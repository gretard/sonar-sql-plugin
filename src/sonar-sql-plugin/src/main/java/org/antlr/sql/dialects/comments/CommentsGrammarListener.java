// Generated from antlr4-grammar-sql-comments/src/main/antlr4/CommentsGrammar.g4 by ANTLR 4.9.3
package org.antlr.sql.dialects.comments;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommentsGrammarParser}.
 */
public interface CommentsGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommentsGrammarParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(CommentsGrammarParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommentsGrammarParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(CommentsGrammarParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommentsGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CommentsGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommentsGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CommentsGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommentsGrammarParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(CommentsGrammarParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommentsGrammarParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(CommentsGrammarParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommentsGrammarParser#multiline_comment}.
	 * @param ctx the parse tree
	 */
	void enterMultiline_comment(CommentsGrammarParser.Multiline_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommentsGrammarParser#multiline_comment}.
	 * @param ctx the parse tree
	 */
	void exitMultiline_comment(CommentsGrammarParser.Multiline_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommentsGrammarParser#line_comment}.
	 * @param ctx the parse tree
	 */
	void enterLine_comment(CommentsGrammarParser.Line_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommentsGrammarParser#line_comment}.
	 * @param ctx the parse tree
	 */
	void exitLine_comment(CommentsGrammarParser.Line_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommentsGrammarParser#non_comment}.
	 * @param ctx the parse tree
	 */
	void enterNon_comment(CommentsGrammarParser.Non_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommentsGrammarParser#non_comment}.
	 * @param ctx the parse tree
	 */
	void exitNon_comment(CommentsGrammarParser.Non_commentContext ctx);
}