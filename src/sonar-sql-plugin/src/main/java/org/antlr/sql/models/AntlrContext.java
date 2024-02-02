package org.antlr.sql.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.antlr.sql.dialects.DialectLanguageTypesMap;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class AntlrContext {

    public Lexer lexer;

    public ParseTree root;

    public CommonTokenStream stream;
    public boolean isCodeRules = true;
    public DialectLanguageTypesMap types;

    public String initialContents;

    public final List<SqlRules> rules = new ArrayList<>();

    public List<SqlRules> getRules() {
        return rules;
    }

    public boolean isComment(Token token) {
        return types.getCommentTokens().contains(token.getType());
    }

    public ParseTree getRoot() {
        return root;
    }

    public boolean isString(Token token) {
        return types.getStringTokens().contains(token.getType());
    }

    public boolean isKeyword(Token token) {
        String symbolicName = lexer.getVocabulary().getSymbolicName(token.getType());
        return symbolicName != null
                && ((StringUtils.equalsAnyIgnoreCase(symbolicName, token.getText()))
                        || symbolicName.toLowerCase().contains(token.getText().toLowerCase()));
    }

    public List<? extends Token> getAllTokens() {
        return stream.getTokens();
    }

    public AntlrContext withRules(Rule... rules) {
        var list = Arrays.asList(rules).stream().map(x -> x.getKey()).toList();
        this.rules.forEach(
                r -> {
                    r.getRule().removeIf(ri -> !list.contains(ri.getKey()));
                });
        return this;
    }
}
