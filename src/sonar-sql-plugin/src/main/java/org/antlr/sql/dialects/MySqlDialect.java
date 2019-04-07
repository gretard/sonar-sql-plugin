package org.antlr.sql.dialects;

import org.antlr.sql.dialects.mysql.MySqlLexer;
import org.antlr.sql.dialects.mysql.MySqlParser;
import org.antlr.sql.dialects.mysql.MySqlParser.DmlStatementContext;
import org.antlr.sql.dialects.mysql.MySqlParser.PredicateExpressionContext;
import org.antlr.sql.dialects.mysql.MySqlParser.ScalarFunctionCallContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;

public class MySqlDialect extends BaseDialect {

	@Override
	protected Lexer getLexer(CharStream charStream) {
		return new MySqlLexer(charStream);
	}

	@Override
	protected ParseTree getRoot(CommonTokenStream stream) {
		MySqlParser p = new MySqlParser(stream);
		p.removeErrorListeners();
		return p.root();
	}

	@Override
	protected DialectLanguageTypesMap getTypesMap() {
		return new DialectLanguageTypesMap().addCommentToken(MySqlParser.COMMENT)
				.addCommentToken(MySqlParser.LINE_COMMENT).addStringToken(MySqlParser.STRING)
				.addCognitiveComplexityType(PredicateExpressionContext.class)
				.addCognitiveComplexityType(DmlStatementContext.class)
				.addCognitiveComplexityType(ScalarFunctionCallContext.class)
				.addComplexityType(PredicateExpressionContext.class);

	}
}
