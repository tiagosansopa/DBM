package application.model;
// Generated from Expression.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(ExpressionParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(ExpressionParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ExpressionParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ExpressionParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(ExpressionParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(ExpressionParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ExpressionParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ExpressionParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExpressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExpressionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(ExpressionParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(ExpressionParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ExpressionParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ExpressionParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(ExpressionParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(ExpressionParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(ExpressionParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(ExpressionParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ExpressionParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ExpressionParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(ExpressionParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(ExpressionParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ExpressionParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ExpressionParser.LiteralContext ctx);
}