package org.antlr.sql.dialects.rules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.sql.dialects.comments.CommentsGrammarParser.Multiline_commentContext;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleDistanceIndexMatchType;
import org.sonar.plugins.sql.models.rules.RuleMatchType;
import org.sonar.plugins.sql.models.rules.RuleResultType;
import org.sonar.plugins.sql.models.rules.SqlRules;

public enum CommonRules {

    INSTANCE;

    BaseRules baseRules = BaseRules.INSTANCE;

    public List<SqlRules> getRules() {
        List<SqlRules> rules = new ArrayList<>();
        {
            SqlRules customRules = new SqlRules();
            customRules.setRepoKey("SQLCC");
            customRules.setRepoName("SQL Plugin checks");
            customRules.setDialect(null);
            customRules.getRule().addAll(Arrays.asList(getCommentIsRequired()));
            rules.add(customRules);
        }
        return rules;
    }

    protected Rule getCommentIsRequired() {
        Rule rule = new Rule();
        rule.setKey("C030");
        rule.setInternalKey("C030");
        rule.setName("File does not start with multiline/header comment");
        rule.setDescription("File does not start with multiline/header comment.");
        rule.setTag("reliability");
        rule.setSeverity("MINOR");
        rule.setRemediationFunction("LINEAR");
        rule.setDebtRemediationFunctionCoefficient("2min");
        rule.setRuleReportsOn("file");
        rule.getRuleImplementation().setRuleViolationMessage("File header comment was not found");
        rule.getRuleImplementation().getNames().getTextItem().add(Multiline_commentContext.class.getSimpleName());
        rule.getRuleImplementation().setRuleMatchType(RuleMatchType.CLASS_ONLY);
        rule.getRuleImplementation().setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
        rule.getRuleImplementation().setIndex(4);
        rule.getRuleImplementation().setIndexCheckType(RuleDistanceIndexMatchType.EQUALS);

        rule.setRuleAppliesTo("comments");

        rule.getRuleImplementation().getCompliantRulesCodeExamples().getRuleCodeExample()
                .add("/* AUTHOR: test\r\nDate: 2020-01-01\r\n */\r\n SELECT * FROM test_table1;");
        rule.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample()
                .add("SELECT * FROM test_table1;");
        rule.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample()
                .add("SELECT * FROM test_table1; /*additionalComment*/ ");
        return rule;
    }

}
