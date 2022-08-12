package listeners

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

    private fun recursiveParen(context: DartmouthBASICParser.ParenthesizedExpressionContext): Double {
        return when (context.expression()) {
            is DartmouthBASICParser.AdditiveExpressionContext -> recursiveAdd(context.expression() as DartmouthBASICParser.AdditiveExpressionContext)
            is DartmouthBASICParser.ParenthesizedExpressionContext -> recursiveParen(context.expression() as DartmouthBASICParser.ParenthesizedExpressionContext)
            else -> context.expression().text.toDouble()
        }
    }

    private fun recursiveAdd(context: DartmouthBASICParser.AdditiveExpressionContext): Double {
        return when (context.expression().first()) {
            is DartmouthBASICParser.ParenthesizedExpressionContext -> recursiveParen(context.expression().first() as DartmouthBASICParser.ParenthesizedExpressionContext)
            is DartmouthBASICParser.AdditiveExpressionContext -> recursiveAdd(context.expression().first() as DartmouthBASICParser.AdditiveExpressionContext)
            else -> context.expression().first().text.toDouble()
        } + when (context.expression().last()) {
            is DartmouthBASICParser.ParenthesizedExpressionContext -> recursiveParen(context.expression().last() as DartmouthBASICParser.ParenthesizedExpressionContext)
            is DartmouthBASICParser.AdditiveExpressionContext -> recursiveAdd(context.expression().last() as DartmouthBASICParser.AdditiveExpressionContext)
            else -> context.expression().last().text.toDouble()
        }
    }

    override fun enterAssignmentStatement(ctx: DartmouthBASICParser.AssignmentStatementContext) {
        val varName = ctx.varName().text

        if (ctx.expression() is DartmouthBASICParser.LiteralExpressionContext) {
            val value = ctx.expression().text
            if ((ctx.expression() as DartmouthBASICParser.LiteralExpressionContext).STRING() != null)
                value.substring(1, value.length - 1)
            varTable[varName] = value
        }
        if (ctx.expression() is DartmouthBASICParser.AdditiveExpressionContext) {
            varTable[varName] = recursiveAdd(ctx.expression() as DartmouthBASICParser.AdditiveExpressionContext)
        }
    }

    override fun enterInputStatement(ctx: DartmouthBASICParser.InputStatementContext) {
        val varName = ctx.expression().text
        val value = readLine()!!

        varTable[varName] = value.toInt()
    }
}