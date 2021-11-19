// Generated from antlr4-grammar-sql-comments/src/main/antlr4/CommentsGrammar.g4 by ANTLR 4.9.3
package org.antlr.sql.dialects.comments;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CommentsGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CommentsGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CommentsGrammarParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(CommentsGrammarParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommentsGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CommentsGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommentsGrammarParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(CommentsGrammarParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommentsGrammarParser#multiline_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiline_comment(CommentsGrammarParser.Multiline_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommentsGrammarParser#line_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_comment(CommentsGrammarParser.Line_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CommentsGrammarParser#non_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_comment(CommentsGrammarParser.Non_commentContext ctx);
}