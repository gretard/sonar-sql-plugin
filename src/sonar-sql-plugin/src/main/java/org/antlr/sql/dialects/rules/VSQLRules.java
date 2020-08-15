package org.antlr.sql.dialects.rules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.sql.dialects.Dialects;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleDistanceIndexMatchType;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleMatchType;
import org.sonar.plugins.sql.models.rules.RuleResultType;
import org.sonar.plugins.sql.models.rules.SqlRules;

public enum VSQLRules {

    INSTANCE;

    BaseRules baseRules = BaseRules.INSTANCE;

    public List<SqlRules> getRules() {
        List<SqlRules> rules = new ArrayList<>();
        {
            SqlRules customRules = new SqlRules();
            customRules.setRepoKey("SQLCC");
            customRules.setRepoName("SQL Plugin checks");
            customRules.setDialect(Dialects.VSQL.name());
            customRules.getRule().addAll(Arrays.asList(getHintIsUsedRule(), getCommitMissing()));
            rules.add(customRules);
        }
        return rules;
    }

    protected Rule getHintIsUsedRule() {
        Rule rule = new Rule();
        rule.setKey("C020");
        rule.setInternalKey("C020");
        rule.setName("HINT is used");
        rule.setDescription("HINT is used. Consider rewriting this statement.");
        rule.setTag("reliability");
        rule.setSeverity("MINOR");
        rule.setRemediationFunction("LINEAR");
        rule.setDebtRemediationFunctionCoefficient("2min");
        rule.getRuleImplementation().setRuleViolationMessage("HINT was found");
        rule.getRuleImplementation().getNames().getTextItem()
                .add(org.antlr.sql.dialects.vsql.VSqlParser.HintsContext.class.getSimpleName());
        rule.getRuleImplementation().setRuleMatchType(RuleMatchType.CLASS_ONLY);
        rule.getRuleImplementation().setRuleResultType(RuleResultType.FAIL_IF_FOUND);
        rule.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample()
                .add("SELECT /*+DIRECT*/ * FROM test_table1;");
        rule.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample()
                .add("CREATE TABLE test_table2 AS SELECT /*+DIRECT*/ * FROM test_table1;");
        rule.getRuleImplementation().getCompliantRulesCodeExamples().getRuleCodeExample()
                .add("SELECT * FROM test_table1;");
        return rule;
    }

    protected Rule getCommitMissing() {
        Rule rule = new Rule();
        rule.setKey("C021");
        rule.setInternalKey("C021");
        rule.setName("COMMIT is missing");
        rule.setDescription(
                "COMMIT is missing after UPDATE/DELETE statement. If you run script without autocommit - your changes might be lost.");
        rule.setTag("reliability");
        rule.setSeverity("MINOR");
        rule.setRemediationFunction("LINEAR");
        rule.setDebtRemediationFunctionCoefficient("2min");
        rule.getRuleImplementation().setRuleViolationMessage("COMMIT Missing");

        rule.getRuleImplementation().getNames().getTextItem()
                .add(org.antlr.sql.dialects.vsql.VSqlParser.RootContext.class.getSimpleName());
        {
            RuleImplementation sibling = new RuleImplementation();
            sibling.setRuleMatchType(RuleMatchType.CLASS_ONLY);
            sibling.setIndex(2);
            sibling.setDistanceCheckType(RuleDistanceIndexMatchType.BEFOREORAFTER);
            sibling.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
            sibling.getNames().getTextItem()
                    .add(org.antlr.sql.dialects.vsql.VSqlParser.Commit_statementContext.class.getSimpleName());
            rule.getRuleImplementation().getChildrenRules().getRuleImplementation().add(sibling);
        }
        {
            RuleImplementation sibling = new RuleImplementation();
            sibling.setRuleMatchType(RuleMatchType.CLASS_ONLY);
            sibling.setIndex(1);
            sibling.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
            sibling.setDistanceCheckType(RuleDistanceIndexMatchType.BEFOREORAFTER);
            sibling.getNames().getTextItem()
                    .add(org.antlr.sql.dialects.vsql.VSqlParser.Delete_statementContext.class.getSimpleName());
            sibling.getNames().getTextItem()
                    .add(org.antlr.sql.dialects.vsql.VSqlParser.Update_statementContext.class.getSimpleName());
            rule.getRuleImplementation().getChildrenRules().getRuleImplementation().add(sibling);
        }

        rule.getRuleImplementation().setRuleMatchType(RuleMatchType.CLASS_ONLY);
        rule.getRuleImplementation().setRuleResultType(RuleResultType.DEFAULT);
         rule.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample().add("DELETE FROM temp1;");
        rule.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample()
                .add("COMMIT; DELETE FROM temp1;");
         rule.getRuleImplementation().getCompliantRulesCodeExamples().getRuleCodeExample()
         .add("SELECT 1; DELETE FROM temp1; COMMIT; SELECT 2; ");
        return rule;
    }
}
