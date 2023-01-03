// Generated from java-escape by ANTLR 4.11.1

package listeners;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DartmouthBASICParser}.
 */
public interface DartmouthBASICListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DartmouthBASICParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DartmouthBASICParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(DartmouthBASICParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(DartmouthBASICParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DartmouthBASICParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DartmouthBASICParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(DartmouthBASICParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(DartmouthBASICParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(DartmouthBASICParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(DartmouthBASICParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(DartmouthBASICParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(DartmouthBASICParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void enterLoopBody(DartmouthBASICParser.LoopBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void exitLoopBody(DartmouthBASICParser.LoopBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#loopTerminator}.
	 * @param ctx the parse tree
	 */
	void enterLoopTerminator(DartmouthBASICParser.LoopTerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#loopTerminator}.
	 * @param ctx the parse tree
	 */
	void exitLoopTerminator(DartmouthBASICParser.LoopTerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(DartmouthBASICParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(DartmouthBASICParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#dataStatement}.
	 * @param ctx the parse tree
	 */
	void enterDataStatement(DartmouthBASICParser.DataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#dataStatement}.
	 * @param ctx the parse tree
	 */
	void exitDataStatement(DartmouthBASICParser.DataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(DartmouthBASICParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(DartmouthBASICParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(DartmouthBASICParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(DartmouthBASICParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(DartmouthBASICParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(DartmouthBASICParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(DartmouthBASICParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(DartmouthBASICParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(DartmouthBASICParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(DartmouthBASICParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(DartmouthBASICParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(DartmouthBASICParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(DartmouthBASICParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(DartmouthBASICParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#printList}.
	 * @param ctx the parse tree
	 */
	void enterPrintList(DartmouthBASICParser.PrintListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#printList}.
	 * @param ctx the parse tree
	 */
	void exitPrintList(DartmouthBASICParser.PrintListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(DartmouthBASICParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(DartmouthBASICParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#gosubStatement}.
	 * @param ctx the parse tree
	 */
	void enterGosubStatement(DartmouthBASICParser.GosubStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#gosubStatement}.
	 * @param ctx the parse tree
	 */
	void exitGosubStatement(DartmouthBASICParser.GosubStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(DartmouthBASICParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(DartmouthBASICParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#dimStatement}.
	 * @param ctx the parse tree
	 */
	void enterDimStatement(DartmouthBASICParser.DimStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#dimStatement}.
	 * @param ctx the parse tree
	 */
	void exitDimStatement(DartmouthBASICParser.DimStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#remStatement}.
	 * @param ctx the parse tree
	 */
	void enterRemStatement(DartmouthBASICParser.RemStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#remStatement}.
	 * @param ctx the parse tree
	 */
	void exitRemStatement(DartmouthBASICParser.RemStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#endStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndStatement(DartmouthBASICParser.EndStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#endStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndStatement(DartmouthBASICParser.EndStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#delimiter}.
	 * @param ctx the parse tree
	 */
	void enterDelimiter(DartmouthBASICParser.DelimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#delimiter}.
	 * @param ctx the parse tree
	 */
	void exitDelimiter(DartmouthBASICParser.DelimiterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(DartmouthBASICParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(DartmouthBASICParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExponentionalExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExponentionalExpression(DartmouthBASICParser.ExponentionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExponentionalExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExponentionalExpression(DartmouthBASICParser.ExponentionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(DartmouthBASICParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(DartmouthBASICParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableInvocationExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTableInvocationExpression(DartmouthBASICParser.TableInvocationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableInvocationExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTableInvocationExpression(DartmouthBASICParser.TableInvocationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListInvocationExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListInvocationExpression(DartmouthBASICParser.ListInvocationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListInvocationExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListInvocationExpression(DartmouthBASICParser.ListInvocationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(DartmouthBASICParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(DartmouthBASICParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReferenceExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReferenceExpression(DartmouthBASICParser.ReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReferenceExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReferenceExpression(DartmouthBASICParser.ReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(DartmouthBASICParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(DartmouthBASICParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(DartmouthBASICParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(DartmouthBASICParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(DartmouthBASICParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(DartmouthBASICParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpression(DartmouthBASICParser.ArgumentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpression(DartmouthBASICParser.ArgumentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(DartmouthBASICParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(DartmouthBASICParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DartmouthBASICParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DartmouthBASICParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(DartmouthBASICParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(DartmouthBASICParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#listName}.
	 * @param ctx the parse tree
	 */
	void enterListName(DartmouthBASICParser.ListNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#listName}.
	 * @param ctx the parse tree
	 */
	void exitListName(DartmouthBASICParser.ListNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(DartmouthBASICParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(DartmouthBASICParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#tableNameArg}.
	 * @param ctx the parse tree
	 */
	void enterTableNameArg(DartmouthBASICParser.TableNameArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#tableNameArg}.
	 * @param ctx the parse tree
	 */
	void exitTableNameArg(DartmouthBASICParser.TableNameArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(DartmouthBASICParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(DartmouthBASICParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(DartmouthBASICParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(DartmouthBASICParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartmouthBASICParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(DartmouthBASICParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartmouthBASICParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(DartmouthBASICParser.ConstantContext ctx);
}