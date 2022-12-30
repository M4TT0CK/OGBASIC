package listeners

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTree

class PreListener: DartmouthBASICBaseListener() {
    var statementTable = mutableMapOf<Int, ParserRuleContext>()
    var gotoAndSubTable = mutableMapOf<Int, DartmouthBASICParser.ProgramContext>()
    var data = mutableListOf<Double>()

    override fun enterPrintStatement(ctx: DartmouthBASICParser.PrintStatementContext) {
        statementTable[(ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()] = ctx
    }

    override fun enterAssignmentStatement(ctx: DartmouthBASICParser.AssignmentStatementContext) {
        statementTable[(ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()] = ctx
    }

    override fun enterEndStatement(ctx: DartmouthBASICParser.EndStatementContext) {
        statementTable[(ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()] = ctx
    }

    override fun enterInputStatement(ctx: DartmouthBASICParser.InputStatementContext) {
        statementTable[(ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()] = ctx
    }

    override fun enterGosubStatement(ctx: DartmouthBASICParser.GosubStatementContext) {
        val lineNumber = (ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()
        statementTable[lineNumber] = ctx
    }

    override fun enterReturnStatement(ctx: DartmouthBASICParser.ReturnStatementContext) {
        statementTable[(ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()] = ctx
    }

    override fun enterDataStatement(ctx: DartmouthBASICParser.DataStatementContext) {
        ctx.constantList().constant().forEach { const ->
            data.add(const.text.toDouble())
        }
    }

    override fun enterGotoStatement(ctx: DartmouthBASICParser.GotoStatementContext) {
        val lineNumber = (ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()
        statementTable[lineNumber] = ctx

        var index = 0
        var statementIndex = 0
        val parent = DartmouthBASICParser.ProgramContext(null, -1)
        parent.copyFrom(ctx.parent?.parent?.parent as DartmouthBASICParser.ProgramContext)
        (ctx.parent?.parent?.parent as DartmouthBASICParser.ProgramContext).children.forEach { child -> parent.children.add(child) }
        var children = parent.children.toMutableList()

        for (i in 0 .. children.size - 2)
            if ((children[i] as DartmouthBASICParser.LineContext).number().text.toInt() == ctx.expression().text.toInt())
                index = i

        for (i in 0 .. children.size - 2)
            if ((children[i] as DartmouthBASICParser.LineContext).number().text.toInt() == lineNumber)
                statementIndex = i

        if (index < statementIndex) {
            val terminalNode = children.last()
            children = children.subList(index, statementIndex + 1)
            children.add(terminalNode)

            parent.children = children

            gotoAndSubTable[lineNumber] = parent
        } else {
            children = children.subList(index, children.size).toMutableList()
            parent.children = children

            gotoAndSubTable[lineNumber] = parent
        }
    }

    override fun enterConditionalStatement(ctx: DartmouthBASICParser.ConditionalStatementContext) {
        val lineNumber = (ctx.parent.parent as DartmouthBASICParser.LineContext).number().text.toInt()
        statementTable[lineNumber] = ctx

        var index = 0
        var statementIndex = 0
        val parent = DartmouthBASICParser.ProgramContext(null, -1)
        parent.copyFrom(ctx.parent?.parent?.parent as DartmouthBASICParser.ProgramContext)
        (ctx.parent?.parent?.parent as DartmouthBASICParser.ProgramContext).children.forEach { child -> parent.children.add(child) }
        var children = parent.children.toMutableList()

        for (i in 0 .. children.size - 2)
            if ((children[i] as DartmouthBASICParser.LineContext).number().text.toInt() == ctx.expression().last().text.toInt())
                index = i

        for (i in 0 .. children.size - 2)
            if ((children[i] as DartmouthBASICParser.LineContext).number().text.toInt() == lineNumber)
                statementIndex = i

        if (index < statementIndex) {
            val terminalNode = children.last()
            children = children.subList(index, statementIndex + 1)
            children.add(terminalNode)

            parent.children = children

            gotoAndSubTable[lineNumber] = parent
        } else {
            children = children.subList(index, children.size).toMutableList()
            parent.children = children

            gotoAndSubTable[lineNumber] = parent
        }
    }
}