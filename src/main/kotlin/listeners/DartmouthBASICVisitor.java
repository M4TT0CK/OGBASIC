// Generated from java-escape by ANTLR 4.11.1

package listeners;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DartmouthBASICParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DartmouthBASICVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DartmouthBASICParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(DartmouthBASICParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DartmouthBASICParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(DartmouthBASICParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(DartmouthBASICParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(DartmouthBASICParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#loopBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBody(DartmouthBASICParser.LoopBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#loopTerminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopTerminator(DartmouthBASICParser.LoopTerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(DartmouthBASICParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#dataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStatement(DartmouthBASICParser.DataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(DartmouthBASICParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(DartmouthBASICParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(DartmouthBASICParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(DartmouthBASICParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(DartmouthBASICParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(DartmouthBASICParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(DartmouthBASICParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#printList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintList(DartmouthBASICParser.PrintListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(DartmouthBASICParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#gosubStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGosubStatement(DartmouthBASICParser.GosubStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(DartmouthBASICParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#dimStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimStatement(DartmouthBASICParser.DimStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#remStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemStatement(DartmouthBASICParser.RemStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#endStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndStatement(DartmouthBASICParser.EndStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#delimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimiter(DartmouthBASICParser.DelimiterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(DartmouthBASICParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExponentionalExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentionalExpression(DartmouthBASICParser.ExponentionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(DartmouthBASICParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableInvocationExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableInvocationExpression(DartmouthBASICParser.TableInvocationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListInvocationExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListInvocationExpression(DartmouthBASICParser.ListInvocationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(DartmouthBASICParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReferenceExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceExpression(DartmouthBASICParser.ReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(DartmouthBASICParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(DartmouthBASICParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(DartmouthBASICParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentExpression}
	 * labeled alternative in {@link DartmouthBASICParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpression(DartmouthBASICParser.ArgumentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#tableArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableArguments(DartmouthBASICParser.TableArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(DartmouthBASICParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DartmouthBASICParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(DartmouthBASICParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#listName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListName(DartmouthBASICParser.ListNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(DartmouthBASICParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#tableNameArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNameArg(DartmouthBASICParser.TableNameArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(DartmouthBASICParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(DartmouthBASICParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartmouthBASICParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(DartmouthBASICParser.ConstantContext ctx);
}