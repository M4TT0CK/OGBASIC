package listeners

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.tree.TerminalNode
import kotlin.math.*

class Listener: DartmouthBASICBaseListener() {
    private var varTable = mutableMapOf<String, Any>()
    var statementTable = mutableMapOf<Int, ParserRuleContext>()
    //TODO: This is hacky as hell--change it
    var programHolder: List<ParseTree>? = ArrayList()

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
        val walker = ParseTreeWalker()
        val prunedProgram = pruneProgram(
            statement?.parent?.parent?.parent as DartmouthBASICParser.ProgramContext,
            (statement.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt(),
            gotoIndex
        )
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
        // Standard library funcions
//        ABS The absolute value
//                ATN The arctangent
//        COS The cosine
//        EXP The exponential, i.e., e^x
//        INT The integer part (truncating toward 0)
//        LOG The natural logarithm
//                RND The next random number
//        SIN The sine
//        SQR The square root
//                TAN The tangent
        return when (exp.FUNCTION_NAME().text) {
            "ABS" -> abs(arithmeticSwitch(exp.expression()))
            "COS" -> cos(arithmeticSwitch(exp.expression()))
            "EXP" -> exp(arithmeticSwitch(exp.expression()))
            "INT" -> arithmeticSwitch(exp.expression()).toInt().toDouble()
            "LOG" -> ln(arithmeticSwitch(exp.expression()))
            "SIN" -> sin(arithmeticSwitch(exp.expression()))
            "SQR" -> sqrt(arithmeticSwitch(exp.expression()))
            "RND" -> Math.random()
            else -> 0.0 //TODO: Replace with proper function call here
        }

    }

    override fun enterEndStatement(ctx: DartmouthBASICParser.EndStatementContext) {
//        statementTable[(ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()] = ctx
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
            val statement = statementTable[ctx.expression().last().text.toInt()]
            val def = Listener()
            def.varTable = varTable
            def.statementTable = statementTable
            val walker = ParseTreeWalker()
            val prunedProgram = pruneProgram(
                statement?.parent?.parent?.parent as DartmouthBASICParser.ProgramContext,
                (statement.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt(),
                statementLine
            )
            walker.walk(def, prunedProgram)
        }
    }

    override fun exitConditionalStatement(ctx: DartmouthBASICParser.ConditionalStatementContext) {
        if (programHolder?.size!! > 0)
            (ctx.parent.parent.parent as DartmouthBASICParser.ProgramContext).children = programHolder
    }
}

class RefException(message:String): Exception(message)