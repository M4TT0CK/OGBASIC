package listeners

import kotlin.math.pow

class Listener: DartmouthBASICBaseListener() {
    private val varTable = mutableMapOf<String, Any>()
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

    override fun enterPrintStatement(ctx: DartmouthBASICParser.PrintStatementContext) {
        val printString = processPrintList(ctx.printList(), "")
        println(printString)
    }

    private fun arithmeticSwitch(expCtx: DartmouthBASICParser.ExpressionContext): Double {
        return when (expCtx) {
            is DartmouthBASICParser.ParenthesizedExpressionContext -> recursiveParen(expCtx)
            is DartmouthBASICParser.AdditiveExpressionContext -> recursiveAdd(expCtx)
            is DartmouthBASICParser.MultiplicativeExpressionContext -> recursiveMultiply(expCtx)
            is DartmouthBASICParser.UnaryExpressionContext -> recursiveUnary(expCtx)
            is DartmouthBASICParser.ExponentionalExpressionContext -> recursiveExponent(expCtx)
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
            else -> println("error")
        }
    }

    override fun enterInputStatement(ctx: DartmouthBASICParser.InputStatementContext) {
        val varName = ctx.expression().text
        val value = readLine()!!

        varTable[varName] = value.toDouble()
    }
}