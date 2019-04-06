package org.antlr.sql.dialects;

import org.antlr.sql.dialects.psql.PostgreSQLLexer;
import org.antlr.sql.dialects.psql.PostgreSQLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;

public class PsSqlDialect extends BaseDialect {

	@Override
	protected Lexer getLexer(CharStream charStream) {
		return new PostgreSQLLexer(charStream);
	}

	@Override
	protected ParseTree getRoot(CommonTokenStream stream) {
		PostgreSQLParser p = new PostgreSQLParser(stream);
		p.removeErrorListeners();
		return p.stmt();
	}

	@Override
	protected DialectLanguageTypesMap getTypesMap() {
		return new DialectLanguageTypesMap().addCommentToken(PostgreSQLParser.COMMENT)
				.addCommentToken(PostgreSQLParser.LINE_COMMENT).addStringToken(PostgreSQLParser.SINGLEQ_STRING_LITERAL)
				.addStringToken(PostgreSQLParser.DOUBLEQ_STRING_LITERAL);
	}
}
