package listeners

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTreeWalker
import kotlin.math.pow

class Listener: DartmouthBASICBaseListener() {
    var varTable = mutableMapOf<String, Any>()
    var statementTable = mutableMapOf<Int, ParserRuleContext>()
    private fun processPrintList(printList: DartmouthBASICParser.PrintListContext, printString: String): String {
        var printable = printString
        val expressionText = printList.expression().text
        if (printList.expression() is DartmouthBASICParser.LiteralExpressionContext) {
            printable += expressionText.substring(1, expressionText.length - 1)
        } else {
            printable += varTable[expressionText]
        }
        if (printList.delimiter() != null)
            printable += if (printList.delimiter().text == ",") "               " else " "
        return if (printList.printList() != null) processPrintList(printList.printList(), printable) else printable
    }

    override fun enterGotoStatement(ctx: DartmouthBASICParser.GotoStatementContext) {
        val statement = statementTable[ctx.expression().text.toInt()]
        val def = Listener()
        def.varTable = varTable
        def.statementTable = statementTable
        val walker = ParseTreeWalker()
        walker.walk(def, statement?.parent?.parent?.parent)

//        when (statement) {
//            is DartmouthBASICParser.PrintStatementContext -> enterPrintStatement(statement)
//            is DartmouthBASICParser.AssignmentStatementContext -> enterAssignmentStatement(statement)
//            is DartmouthBASICParser.InputStatementContext -> enterInputStatement(statement)
//            is DartmouthBASICParser.ConditionalStatementContext -> enterConditionalStatement(statement)
//            else -> println("error")
//        }
    }

    override fun enterPrintStatement(ctx: DartmouthBASICParser.PrintStatementContext) {
        statementTable[(ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()] = ctx
        val printString = processPrintList(ctx.printList(), "")
        println(printString)
    }

    private fun reference(context: DartmouthBASICParser.ReferenceExpressionContext): Double {
        val ref = varTable[context.varName().text]
        if (ref is Double) return ref
        else
            throw RefException("Error: Not a number.")
    }

    private fun arithmeticSwitch(expCtx: DartmouthBASICParser.ExpressionContext): Double {
        return when (expCtx) {
            is DartmouthBASICParser.ParenthesizedExpressionContext -> recursiveParen(expCtx)
            is DartmouthBASICParser.AdditiveExpressionContext -> recursiveAdd(expCtx)
            is DartmouthBASICParser.MultiplicativeExpressionContext -> recursiveMultiply(expCtx)
            is DartmouthBASICParser.UnaryExpressionContext -> recursiveUnary(expCtx)
            is DartmouthBASICParser.ExponentionalExpressionContext -> recursiveExponent(expCtx)
            is DartmouthBASICParser.ReferenceExpressionContext -> reference(expCtx)
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
        statementTable[(ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()] = ctx
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
            else -> println("error")
        }
    }

    override fun enterInputStatement(ctx: DartmouthBASICParser.InputStatementContext) {
        statementTable[(ctx.parent as DartmouthBASICParser.LineContext).number().text.toInt()] = ctx
        val varName = ctx.expression().text
        val value = readln()

        varTable[varName] = value.toDouble()
    }

//    private fun computeNumericalLiteral

    private fun evaluateEqualityExpression(exp: DartmouthBASICParser.EqualityExpressionContext): Boolean {
        return when (exp.comparator().text) {
            "<=" -> exp.expression().first().text.toDouble() <= exp.expression().last().text.toDouble()
            ">=" -> exp.expression().first().text.toDouble() >= exp.expression().last().text.toDouble()
            "<" -> exp.expression().first().text.toDouble() < exp.expression().last().text.toDouble()
            ">" -> exp.expression().first().text.toDouble() > exp.expression().last().text.toDouble()
            "=" -> exp.expression().first().text.toDouble() == exp.expression().last().text.toDouble()
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
        statementTable[(ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()] = ctx
        val computedExp = evaluateBooleanExpression(ctx.expression())
        if (computedExp)
            println(computedExp)
    }
}

class RefException(message:String): Exception(message)