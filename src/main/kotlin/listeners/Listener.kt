package listeners

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.tree.TerminalNode
import kotlin.math.*

class Listener: DartmouthBASICBaseListener() {
    private var varTable = mutableMapOf<String, Any>()
    var statementTable = mutableMapOf<Int, ParserRuleContext>()
    var functionTable = mutableMapOf<String, Any>()
    var gotoAndSubTable: MutableMap<Int, DartmouthBASICParser.ProgramContext> = mutableMapOf()
    //TODO: This is hacky as hell--change it
    var programHolder: List<ParseTree>? = ArrayList()
    var functionVar = 0.0
    var data = mutableListOf<Double>()
    var dataCounter = 0

    override fun enterProgram(ctx: DartmouthBASICParser.ProgramContext) {
    }
    private fun processPrintList(printList: DartmouthBASICParser.PrintListContext, printString: String): String {
        var printable = printString
        val expressionText = processExpression(printList.expression())
        printable += if (printList.expression() is DartmouthBASICParser.LiteralExpressionContext) {
            expressionText.substring(1, expressionText.length - 1)
        } else {
            expressionText
        }
        if (printList.delimiter() != null)
            printable += if (printList.delimiter().text == ",") "               " else " "
        return if (printList.printList() != null) processPrintList(printList.printList(), printable) else printable
    }

    override fun enterFunctionStatement(ctx: DartmouthBASICParser.FunctionStatementContext) {
        functionTable[ctx.FUNCTION_NAME().text] = ctx.expression()
    }

    override fun exitFunctionStatement(ctx: DartmouthBASICParser.FunctionStatementContext?) {
        super.exitFunctionStatement(ctx)
    }

    private fun processFunction(fnn: String, x: Double): Double {
        varTable["X"] = x

        val funcExp = functionTable[fnn]

        val evaluation = processExpression(funcExp as DartmouthBASICParser.ExpressionContext).toDouble()
        varTable.remove("X")
        return evaluation
    }

    private fun processExpression(exp: DartmouthBASICParser.ExpressionContext): String {
        return when (exp) {
            is DartmouthBASICParser.LiteralExpressionContext -> {
                val value = exp.text
                if (exp.STRING() != null)
                    value.substring(1, value.length - 1)
                value
            }
            is DartmouthBASICParser.ParenthesizedExpressionContext -> recursiveParen(exp).toString()
            is DartmouthBASICParser.AdditiveExpressionContext -> recursiveAdd(exp).toString()
            is DartmouthBASICParser.MultiplicativeExpressionContext -> recursiveMultiply(exp).toString()
            is DartmouthBASICParser.UnaryExpressionContext -> recursiveUnary(exp).toString()
            is DartmouthBASICParser.ExponentionalExpressionContext -> recursiveExponent(exp).toString()
            is DartmouthBASICParser.ReferenceExpressionContext -> reference(exp).toString()
            else -> ""
        }
    }

    override fun enterGotoStatement(ctx: DartmouthBASICParser.GotoStatementContext) {
        val statement = statementTable[ctx.expression().text.toInt()]
        val gotoIndex = (ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()
        val def = Listener()
        def.varTable = varTable
        def.statementTable = statementTable
        def.gotoAndSubTable = gotoAndSubTable
        def.data = data
        val walker = ParseTreeWalker()
        val prunedProgram = gotoAndSubTable[gotoIndex]
        walker.walk(def, prunedProgram)
    }

    private fun pruneProgram(ctx: DartmouthBASICParser.ProgramContext,
                             statementLine: Int,
                             gotoLine: Int): DartmouthBASICParser.ProgramContext {
        var index = 0
        val children = ctx.children
        //TODO: split this into its own function to remove redundancy
        for (i in 0..children.size - 2)
            if ((children[i] as DartmouthBASICParser.LineContext).number().text.toInt() == statementLine)
                index = i

        var endIndex = 0
        for (i in 0 .. children.size - 2)
            if ((children[i] as DartmouthBASICParser.LineContext).number().text.toInt() == gotoLine)
                endIndex = i

//        for (i in 0 .. children.size)
        if (index <= endIndex) {
            ctx.children = children.subList(index, endIndex + 1)
            ctx.children.add(children.last())
        }
        else {
            ctx.children = children.subList(index, children.size - 2)
            if (ctx.children.size == 0)
                ctx.children.add(children.last())
        }
//        ctx.children = children.subList(index, endIndex + 1)
        return ctx
    }

    override fun enterPrintStatement(ctx: DartmouthBASICParser.PrintStatementContext) {
//        statementTable[(ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()] = ctx
        val printString = processPrintList(ctx.printList(), "")

        if (ctx.SEMI_COLON() != null)
            print(printString)
        else
            println(printString)
    }

    private fun reference(context: DartmouthBASICParser.ReferenceExpressionContext): Double {
        return when (val ref = varTable[context.varName().text]) {
            is Double -> ref
            is String -> ref.toDouble()
            else -> throw RefException("Error: Not a number.")
        }
    }

    private fun arithmeticSwitch(expCtx: DartmouthBASICParser.ExpressionContext): Double {
        return when (expCtx) {
            is DartmouthBASICParser.ParenthesizedExpressionContext -> recursiveParen(expCtx)
            is DartmouthBASICParser.AdditiveExpressionContext -> recursiveAdd(expCtx)
            is DartmouthBASICParser.MultiplicativeExpressionContext -> recursiveMultiply(expCtx)
            is DartmouthBASICParser.UnaryExpressionContext -> recursiveUnary(expCtx)
            is DartmouthBASICParser.ExponentionalExpressionContext -> recursiveExponent(expCtx)
            is DartmouthBASICParser.ReferenceExpressionContext -> reference(expCtx)
            is DartmouthBASICParser.ArgumentExpressionContext -> argument(expCtx)
            else -> expCtx.text.toDouble()
        }
    }

    private fun recursiveExponent(context: DartmouthBASICParser.ExponentionalExpressionContext): Double {
        return arithmeticSwitch(context.expression().first()).pow(context.expression().last().text.toDouble())
    }

    private fun recursiveMultiply(context: DartmouthBASICParser.MultiplicativeExpressionContext): Double {
        //TODO: Make this less ridiculous
        if (context.children[1].text == "*") return arithmeticSwitch(context.expression().first()) * arithmeticSwitch(context.expression().last())
        return arithmeticSwitch(context.expression().first()) / arithmeticSwitch(context.expression().last())
    }

    private fun recursiveParen(context: DartmouthBASICParser.ParenthesizedExpressionContext): Double {
        return arithmeticSwitch(context.expression())
    }

    private fun recursiveAdd(context: DartmouthBASICParser.AdditiveExpressionContext): Double {
        //TODO: Make this less ridiculous
        if (context.children[1].text == "-") return arithmeticSwitch(context.expression().first()) - arithmeticSwitch(context.expression().last())
        return arithmeticSwitch(context.expression().first()) + arithmeticSwitch(context.expression().last())
    }

    private fun recursiveUnary(context: DartmouthBASICParser.UnaryExpressionContext): Double {
        return arithmeticSwitch(context.expression()) * (-1)
    }

    override fun enterAssignmentStatement(ctx: DartmouthBASICParser.AssignmentStatementContext) {
//        statementTable[(ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()] = ctx
        val varName = ctx.varName().text

        when (ctx.expression()) {
            is DartmouthBASICParser.LiteralExpressionContext -> {
                val value = ctx.expression().text
                if ((ctx.expression() as DartmouthBASICParser.LiteralExpressionContext).STRING() != null)
                    value.substring(1, value.length - 1)
                varTable[varName] = value
            }
            is DartmouthBASICParser.ParenthesizedExpressionContext -> varTable[varName] = recursiveParen((ctx.expression() as DartmouthBASICParser.ParenthesizedExpressionContext))
            is DartmouthBASICParser.AdditiveExpressionContext -> varTable[varName] = recursiveAdd(ctx.expression() as DartmouthBASICParser.AdditiveExpressionContext)
            is DartmouthBASICParser.MultiplicativeExpressionContext -> varTable[varName] = recursiveMultiply(ctx.expression() as DartmouthBASICParser.MultiplicativeExpressionContext)
            is DartmouthBASICParser.UnaryExpressionContext -> varTable[varName] = recursiveUnary(ctx.expression() as DartmouthBASICParser.UnaryExpressionContext)
            is DartmouthBASICParser.ExponentionalExpressionContext -> varTable[varName] = recursiveExponent(ctx.expression() as DartmouthBASICParser.ExponentionalExpressionContext)
            is DartmouthBASICParser.ReferenceExpressionContext -> varTable[varName] = reference(ctx.expression() as DartmouthBASICParser.ReferenceExpressionContext)
            is DartmouthBASICParser.ArgumentExpressionContext -> varTable[varName] = argument(ctx.expression() as DartmouthBASICParser.ArgumentExpressionContext)
            else -> println("error")
        }
    }

    private fun argument(exp: DartmouthBASICParser.ArgumentExpressionContext): Double {
        // Standard library functions
        return when (exp.FUNCTION_NAME().text) {
            "ABS" -> abs(arithmeticSwitch(exp.expression()))
            "COS" -> cos(arithmeticSwitch(exp.expression()))
            "EXP" -> exp(arithmeticSwitch(exp.expression()))
            "INT" -> arithmeticSwitch(exp.expression()).toInt().toDouble()
            "LOG" -> ln(arithmeticSwitch(exp.expression()))
            "SIN" -> sin(arithmeticSwitch(exp.expression()))
            "SQR" -> sqrt(arithmeticSwitch(exp.expression()))
            "RND" -> Math.random()
            else -> processFunction(exp.FUNCTION_NAME().text, arithmeticSwitch(exp.expression()))
        }

    }

    override fun enterEndStatement(ctx: DartmouthBASICParser.EndStatementContext) {
        val children = (ctx.parent.parent.parent as DartmouthBASICParser.ProgramContext).children
        val terminalNode = children.last()
        val lineNumber = (ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()
        var index = 0

        for (i in 0 .. children.size - 2)
            if ((children[i] as DartmouthBASICParser.LineContext).number().text.toInt() == lineNumber)
                index = i

        (ctx.parent.parent.parent as DartmouthBASICParser.ProgramContext).children = listOf(terminalNode)

        throw ParseCancellationException()
    }

    override fun enterInputStatement(ctx: DartmouthBASICParser.InputStatementContext) {
//        statementTable[(ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()] = ctx
        val varName = ctx.expression().text
        val value = readln()

        varTable[varName] = value.toDouble()
    }

    private fun computeNumericalLiteral(exp: DartmouthBASICParser.ExpressionContext): Double {
        return when(exp) {
            is DartmouthBASICParser.LiteralExpressionContext -> exp.text.toDouble()
            else -> reference(exp as DartmouthBASICParser.ReferenceExpressionContext)
        }
    }

    private fun evaluateEqualityExpression(exp: DartmouthBASICParser.EqualityExpressionContext): Boolean {
        val leftHand = computeNumericalLiteral(exp.expression().first())
        val rightHand = computeNumericalLiteral(exp.expression().last())
        return when (exp.comparator().text) {
            "<=" -> leftHand <= rightHand
            ">=" -> leftHand >= rightHand
            "<" -> leftHand < rightHand
            ">" -> leftHand > rightHand
            "=" -> leftHand == rightHand
            else -> false
        }
    }

    private fun evaluateBooleanExpression(exp: DartmouthBASICParser.ExpressionContext): Boolean {
        return when (exp) {
            is DartmouthBASICParser.EqualityExpressionContext -> evaluateEqualityExpression(exp)
            else -> false
        }
    }

    override fun enterConditionalStatement(ctx: DartmouthBASICParser.ConditionalStatementContext) {
        val statementLine = (ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()
        statementTable[statementLine] = ctx
        val computedExp = evaluateBooleanExpression(ctx.expression().first())
        if (computedExp) {
            val def = Listener()
            def.varTable = varTable
            def.statementTable = statementTable
            def.gotoAndSubTable = gotoAndSubTable
            val walker = ParseTreeWalker()
            val prunedProgram = gotoAndSubTable[statementLine]
            walker.walk(def, prunedProgram)
        }
    }

    override fun exitConditionalStatement(ctx: DartmouthBASICParser.ConditionalStatementContext) {
        if (programHolder?.size!! > 0)
            (ctx.parent.parent.parent as DartmouthBASICParser.ProgramContext).children = programHolder
    }

    override fun enterForStatement(ctx: DartmouthBASICParser.ForStatementContext) {
        val step = if (ctx.STEP() != null) processExpression(ctx.expression().last()).toDouble() else 1.0
        val varName = ctx.varName().text
        val toValue = processExpression(ctx.expression()[1]).toDouble()
        varTable[varName] = processExpression(ctx.expression().first())
        var i = varTable[varName].toString().toDouble()
        val def = Listener()
        def.varTable = varTable
        def.statementTable = statementTable
        def.functionTable = functionTable
        val walker = ParseTreeWalker()

        while (i <= toValue) {
            varTable[varName] = i
            ctx.loopBody().line().forEach { statement ->
                walker.walk(def, statement)
                varTable = def.varTable
            }
            i += step
        }
    }

    override fun enterGosubStatement(ctx: DartmouthBASICParser.GosubStatementContext) {
        val subStatements = mutableListOf<ParserRuleContext>()

        run breaking@ {
            statementTable.forEach { (key, context) ->
                if (key >= ctx.expression().text.toInt()) subStatements.add(context)
                if (context is DartmouthBASICParser.ReturnStatementContext)
                    return@breaking
            }
        }

        val def = Listener()
        def.varTable = varTable
        def.statementTable = statementTable
        def.functionTable = functionTable
        val walker = ParseTreeWalker()

        subStatements.forEach { context ->
            walker.walk(def, context)
            varTable = def.varTable
        }
    }

    override fun enterReadStatement(ctx: DartmouthBASICParser.ReadStatementContext) {
        ctx.idList().varName().forEach { varName ->
            varTable[varName.text] = data[dataCounter]
            dataCounter++
        }
    }
}

class RefException(message:String): Exception(message)