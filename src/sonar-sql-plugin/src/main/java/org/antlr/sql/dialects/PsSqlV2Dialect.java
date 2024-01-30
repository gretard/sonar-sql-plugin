package org.antlr.sql.dialects;

import org.antlr.sql.dialects.psqlv2.PostgreSQLLexer;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.A_exprContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.A_expr_andContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.Group_by_itemContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.SelectstmtContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.SortbyContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.UpdatestmtContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;

public class PsSqlV2Dialect extends BaseDialect {

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
        return new DialectLanguageTypesMap()
                .addCommentToken(PostgreSQLLexer.BlockComment)
                .addCommentToken(PostgreSQLLexer.LineComment)
                .addCommentToken(PostgreSQLLexer.UnterminatedBlockComment)
                .addStringToken(PostgreSQLLexer.StringConstant)
                .addComplexityType(A_exprContext.class)
                .addCognitiveComplexityType(SortbyContext.class)
                .addCognitiveComplexityType(A_expr_andContext.class)
                .addCognitiveComplexityType(SelectstmtContext.class)
                .addCognitiveComplexityType(UpdatestmtContext.class)
                .addCognitiveComplexityType(Group_by_itemContext.class);
    }
}
