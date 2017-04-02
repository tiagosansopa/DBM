package application.model;
// Generated from Expression.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ExpressionParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(ExpressionParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(ExpressionParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ExpressionParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ExpressionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(ExpressionParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ExpressionParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(ExpressionParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#compareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(ExpressionParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ExpressionParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(ExpressionParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ExpressionParser.LiteralContext ctx);
}