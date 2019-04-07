package org.antlr.sql.dialects;

import org.antlr.sql.dialects.psql.PostgreSQLLexer;
import org.antlr.sql.dialects.psql.PostgreSQLParser;
import org.antlr.sql.dialects.psql.PostgreSQLParser.Combine_clauseContext;
import org.antlr.sql.dialects.psql.PostgreSQLParser.Grouping_elemContext;
import org.antlr.sql.dialects.psql.PostgreSQLParser.Order_by_itemContext;
import org.antlr.sql.dialects.psql.PostgreSQLParser.PredicateContext;
import org.antlr.sql.dialects.psql.PostgreSQLParser.Select_stmtContext;
import org.antlr.sql.dialects.psql.PostgreSQLParser.Update_stmtContext;
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
		return p.root();
	}

	@Override
	protected DialectLanguageTypesMap getTypesMap() {
		return new DialectLanguageTypesMap().addCommentToken(PostgreSQLParser.COMMENT)
				.addCommentToken(PostgreSQLParser.BLOCK_COMMENT).addCommentToken(PostgreSQLParser.LINE_COMMENT)
				.addStringToken(PostgreSQLParser.SINGLEQ_STRING_LITERAL)
				.addStringToken(PostgreSQLParser.DOUBLEQ_STRING_LITERAL).addComplexityType(PredicateContext.class)

				.addCognitiveComplexityType(Order_by_itemContext.class)
				.addCognitiveComplexityType(PredicateContext.class)
				//
				.addCognitiveComplexityType(Update_stmtContext.class)
				.addCognitiveComplexityType(Combine_clauseContext.class)
				.addCognitiveComplexityType(Grouping_elemContext.class)
				.addCognitiveComplexityType(Select_stmtContext.class)
		// .addComplexityType(Grouping_elemContext.class)
		;
	}
}
