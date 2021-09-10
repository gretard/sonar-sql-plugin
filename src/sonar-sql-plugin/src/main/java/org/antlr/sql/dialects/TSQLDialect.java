package org.antlr.sql.dialects;

import org.antlr.sql.dialects.tsql.TSqlLexer;
import org.antlr.sql.dialects.tsql.TSqlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;

public class TSQLDialect extends BaseDialect {

	@Override
	protected Lexer getLexer(CharStream charStream) {
		return new TSqlLexer(charStream);
	}

	@Override
	protected ParseTree getRoot(CommonTokenStream stream) {
		TSqlParser p = new TSqlParser(stream);
		p.removeErrorListeners();
		return p.tsql_file();
	}

	@Override
	protected DialectLanguageTypesMap getTypesMap() {
		return new DialectLanguageTypesMap().addCommentToken(TSqlParser.COMMENT)
				.addCommentToken(TSqlParser.LINE_COMMENT).addStringToken(TSqlParser.STRING)
				.addComplexityType(TSqlParser.Search_conditionContext.class)
				.addComplexityType(TSqlParser.Try_catch_statementContext.class)

				.addCognitiveComplexityType(TSqlParser.Sql_unionContext.class)
				.addCognitiveComplexityType(TSqlParser.Function_callContext.class)
				.addCognitiveComplexityType(TSqlParser.Join_partContext.class)
				.addCognitiveComplexityType(TSqlParser.Order_by_expressionContext.class)
				.addCognitiveComplexityType(TSqlParser.Search_conditionContext.class)
				.addCognitiveComplexityType(TSqlParser.Dml_clauseContext.class);
	}

}
