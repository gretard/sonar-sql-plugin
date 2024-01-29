package org.antlr.sql.dialects;

import org.antlr.sql.dialects.snowflake.SnowflakeLexer;
import org.antlr.sql.dialects.snowflake.SnowflakeParser;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Group_by_clauseContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Order_by_clauseContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.PredicateContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Select_statementContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Update_statementContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;

public class SnowflakeDialect extends BaseDialect {

	@Override
	protected Lexer getLexer(CharStream charStream) {
		return new SnowflakeLexer(charStream);
	}

	@Override
	protected ParseTree getRoot(CommonTokenStream stream) {
		SnowflakeParser p = new SnowflakeParser(stream);
		p.removeErrorListeners();
		return p.snowflake_file();
	}

	@Override
	protected DialectLanguageTypesMap getTypesMap() {
		return new DialectLanguageTypesMap().addCommentToken(SnowflakeLexer.SQL_COMMENT)
				.addCommentToken(SnowflakeLexer.LINE_COMMENT).addCommentToken(SnowflakeLexer.LINE_COMMENT_2)
				.addStringToken(SnowflakeLexer.STRING)
				.addComplexityType(PredicateContext.class)

				.addCognitiveComplexityType(Order_by_clauseContext.class)
				.addCognitiveComplexityType(PredicateContext.class)
				.addCognitiveComplexityType(Select_statementContext.class)
				.addCognitiveComplexityType(Update_statementContext.class)
				.addCognitiveComplexityType(Group_by_clauseContext.class)

		;
	}
}
