package org.antlr.sql.dialects;

import org.antlr.sql.dialects.vsql.VSqlLexer;
import org.antlr.sql.dialects.vsql.VSqlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;

public class VSQLDialect extends BaseDialect {

    @Override
    protected Lexer getLexer(CharStream charStream) {
        return new VSqlLexer(charStream);
    }

    @Override
    protected ParseTree getRoot(CommonTokenStream stream) {
        VSqlParser p = new VSqlParser(stream);
        p.removeErrorListeners();
        return p.root();
    }

    @Override
    protected DialectLanguageTypesMap getTypesMap() {
        return new DialectLanguageTypesMap().addCommentToken(VSqlParser.COMMENT)
                .addCommentToken(VSqlParser.LINE_COMMENT).addStringToken(VSqlParser.DOUBLE_QUOTE_STRING)
                .addStringToken(VSqlParser.SINGLE_QUOTE_STRING).addComplexityType(VSqlParser.ExpressionContext.class)

                .addCognitiveComplexityType(VSqlParser.FunctionCallContext.class)
                .addCognitiveComplexityType(VSqlParser.JoinPredicateContext.class)
                .addCognitiveComplexityType(VSqlParser.Orderby_clauseContext.class)
                .addCognitiveComplexityType(VSqlParser.Where_clauseContext.class)
                .addCognitiveComplexityType(VSqlParser.StatementContext.class);
    }

}
