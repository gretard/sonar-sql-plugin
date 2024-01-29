package org.antlr.sql.dialects;

import org.antlr.sql.dialects.snowflake.SnowflakeLexer;
import org.antlr.sql.dialects.snowflake.SnowflakeParser;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.*;
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
