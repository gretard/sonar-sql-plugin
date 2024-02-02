package org.antlr.sql.dialects.rules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.antlr.sql.dialects.Dialects;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleDistanceIndexMatchType;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleMatchType;
import org.sonar.plugins.sql.models.rules.RuleResultType;
import org.sonar.plugins.sql.models.rules.SqlRules;
import org.sonar.plugins.sql.models.rules.TextCheckType;

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
            customRules
                    .getRule()
                    .addAll(
                            Arrays.asList(
                                    getHintIsUsedRule(),
                                    getSargRule(),
                                    getCartesianJoinsRule(),
                                    getCommitMissing(),
                                    getCartesianJoinsRule()
                                    // getColumnListRule()
                                    ));
            rules.add(customRules);
        }
        return rules;
    }

    protected Rule getColumnListRule() {

        Rule rule = baseRules.getColumnListRule();
        // find all column refs
        RuleImplementation parent = rule.getRuleImplementation();
        parent.getNames()
                .getTextItem()
                .add(
                        org.antlr.sql.dialects.vsql.VSqlParser.ColumnReferenceContext.class
                                .getSimpleName());
        parent.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        {
            // only check SELECT clauses
            RuleImplementation columnRefCheck = new RuleImplementation();
            columnRefCheck
                    .getNames()
                    .getTextItem()
                    .add(
                            org.antlr.sql.dialects.vsql.VSqlParser.Select_clauseContext.class
                                    .getSimpleName());
            columnRefCheck.setRuleMatchType(RuleMatchType.CLASS_ONLY);
            columnRefCheck.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
            parent.getParentRules().getRuleImplementation().add(columnRefCheck);
        }

        {
            // check if columns contain references
            RuleImplementation columnRefCheck = new RuleImplementation();
            columnRefCheck
                    .getNames()
                    .getTextItem()
                    .add(org.antlr.sql.dialects.vsql.VSqlParser.TableContext.class.getSimpleName());
            columnRefCheck.setRuleMatchType(RuleMatchType.CLASS_ONLY);
            columnRefCheck.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
            parent.getChildrenRules().getRuleImplementation().add(columnRefCheck);
        }

        {
            // rule to skip rule for single table queries
            RuleImplementation querySpec = new RuleImplementation();
            querySpec
                    .getNames()
                    .getTextItem()
                    .add(
                            org.antlr.sql.dialects.vsql.VSqlParser.Select_statementContext.class
                                    .getSimpleName());
            querySpec.setRuleMatchType(RuleMatchType.CLASS_ONLY);

            // rule to skip rule for single table queries
            RuleImplementation fromClauseSpec = new RuleImplementation();
            fromClauseSpec
                    .getNames()
                    .getTextItem()
                    .add(
                            org.antlr.sql.dialects.vsql.VSqlParser.From_clauseContext.class
                                    .getSimpleName());
            fromClauseSpec.setRuleMatchType(RuleMatchType.CLASS_ONLY);

            RuleImplementation tableRefs = new RuleImplementation();
            tableRefs
                    .getNames()
                    .getTextItem()
                    .add(
                            org.antlr.sql.dialects.vsql.VSqlParser.DatasetContext.class
                                    .getSimpleName());
            tableRefs.setRuleMatchType(RuleMatchType.CLASS_ONLY);
            tableRefs.setRuleResultType(RuleResultType.SKIP_IF_LESS_FOUND);
            tableRefs.setTimes(2);

            fromClauseSpec.getChildrenRules().getRuleImplementation().add(tableRefs);
            querySpec.getChildrenRules().getRuleImplementation().add(fromClauseSpec);
            parent.getParentRules().getRuleImplementation().add(querySpec);
        }

        return rule;
    }

    protected Rule getSargRule() {

        Rule rule = baseRules.getSargRule();

        RuleImplementation impl = rule.getRuleImplementation();

        RuleImplementation functionCallContainsLikeWildcard = new RuleImplementation();
        functionCallContainsLikeWildcard.getTextToFind().getTextItem().add("N?[',‘]%(.*?)'");
        functionCallContainsLikeWildcard.setTextCheckType(TextCheckType.REGEXP);
        functionCallContainsLikeWildcard
                .getNames()
                .getTextItem()
                .add(TerminalNodeImpl.class.getSimpleName());
        functionCallContainsLikeWildcard.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
        functionCallContainsLikeWildcard.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
        functionCallContainsLikeWildcard.setRuleViolationMessage(
                "Non-sargeable argument found - predicate starts with wildcard. %");

        impl.getChildrenRules().getRuleImplementation().add(functionCallContainsLikeWildcard);
        impl.setRuleViolationMessage("Non-sargeable argument found");
        impl.getNames()
                .getTextItem()
                .add(
                        org.antlr.sql.dialects.vsql.VSqlParser.LikePredicateContext.class
                                .getSimpleName());
        impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        impl.setRuleResultType(RuleResultType.DEFAULT);

        return rule;
    }

    protected Rule getCartesianJoinsRule() {

        Rule rule = baseRules.getCartesianJoinsRule();
        RuleImplementation rImpl = rule.getRuleImplementation();

        rImpl.getNames()
                .getTextItem()
                .add(
                        org.antlr.sql.dialects.vsql.VSqlParser.From_clauseContext.class
                                .getSimpleName());
        rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);

        RuleImplementation child = new RuleImplementation();
        child.getNames()
                .getTextItem()
                .add(org.antlr.sql.dialects.vsql.VSqlParser.DatasetContext.class.getSimpleName());
        child.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        child.setRuleResultType(RuleResultType.SKIP_IF_LESS_FOUND);
        child.setTimes(2);
        RuleImplementation child2 = new RuleImplementation();
        child2.getNames()
                .getTextItem()
                .add(
                        org.antlr.sql.dialects.vsql.VSqlParser.JoinedTableContext.class
                                .getSimpleName());
        child2.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        child2.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
        child.getChildrenRules().getRuleImplementation().add(child2);
        rImpl.getChildrenRules().getRuleImplementation().add(child);
        return rule;
    }

    protected Rule getHintIsUsedRule() {
        Rule rule = new Rule();
        rule.setKey("C020");
        rule.setInternalKey("C020");
        rule.setName("HINT is used");
        rule.setDescription(
                "<h2>Description</h2><p>HINT is used. Consider rewriting this statement.</p>");
        rule.setTag("reliability");
        rule.setSeverity("MINOR");
        rule.setRemediationFunction("LINEAR");
        rule.setDebtRemediationFunctionCoefficient("2min");
        rule.getRuleImplementation().setRuleViolationMessage("HINT was found");
        rule.getRuleImplementation()
                .getNames()
                .getTextItem()
                .add(org.antlr.sql.dialects.vsql.VSqlParser.HintsContext.class.getSimpleName());
        rule.getRuleImplementation().setRuleMatchType(RuleMatchType.CLASS_ONLY);
        rule.getRuleImplementation().setRuleResultType(RuleResultType.FAIL_IF_FOUND);
        rule.getRuleImplementation()
                .getViolatingRulesCodeExamples()
                .getRuleCodeExample()
                .add("SELECT /*+DIRECT*/ * FROM test_table1;");
        rule.getRuleImplementation()
                .getViolatingRulesCodeExamples()
                .getRuleCodeExample()
                .add("CREATE TABLE test_table2 AS SELECT /*+DIRECT*/ * FROM test_table1;");
        rule.getRuleImplementation()
                .getCompliantRulesCodeExamples()
                .getRuleCodeExample()
                .add("SELECT * FROM test_table1;");
        return rule;
    }

    protected Rule getCommitMissing() {
        Rule rule = new Rule();
        rule.setKey("C021");
        rule.setInternalKey("C021");
        rule.setName("COMMIT is missing");
        rule.setDescription(
                "<h2>Description</h2><p>COMMIT is missing after UPDATE/DELETE statement. If you run"
                        + " script without autocommit - your changes might be lost.</p>");
        rule.setTag("reliability");
        rule.setSeverity("MINOR");
        rule.setRemediationFunction("LINEAR");
        rule.setDebtRemediationFunctionCoefficient("2min");
        rule.getRuleImplementation().setRuleViolationMessage("COMMIT Missing");

        rule.getRuleImplementation()
                .getNames()
                .getTextItem()
                .add(org.antlr.sql.dialects.vsql.VSqlParser.RootContext.class.getSimpleName());
        {
            RuleImplementation sibling = new RuleImplementation();
            sibling.setRuleMatchType(RuleMatchType.CLASS_ONLY);
            sibling.setIndex(2);
            sibling.setDistanceCheckType(RuleDistanceIndexMatchType.BEFOREORAFTER);
            sibling.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
            sibling.getNames()
                    .getTextItem()
                    .add(
                            org.antlr.sql.dialects.vsql.VSqlParser.Commit_statementContext.class
                                    .getSimpleName());
            rule.getRuleImplementation().getChildrenRules().getRuleImplementation().add(sibling);
        }
        {
            RuleImplementation sibling = new RuleImplementation();
            sibling.setRuleMatchType(RuleMatchType.CLASS_ONLY);
            sibling.setIndex(1);
            sibling.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
            sibling.setDistanceCheckType(RuleDistanceIndexMatchType.BEFOREORAFTER);
            sibling.getNames()
                    .getTextItem()
                    .add(
                            org.antlr.sql.dialects.vsql.VSqlParser.Delete_statementContext.class
                                    .getSimpleName());
            sibling.getNames()
                    .getTextItem()
                    .add(
                            org.antlr.sql.dialects.vsql.VSqlParser.Insert_statementContext.class
                                    .getSimpleName());
            sibling.getNames()
                    .getTextItem()
                    .add(
                            org.antlr.sql.dialects.vsql.VSqlParser.Update_statementContext.class
                                    .getSimpleName());
            rule.getRuleImplementation().getChildrenRules().getRuleImplementation().add(sibling);
        }

        rule.getRuleImplementation().setRuleMatchType(RuleMatchType.CLASS_ONLY);
        rule.getRuleImplementation().setRuleResultType(RuleResultType.DEFAULT);
        rule.getRuleImplementation()
                .getViolatingRulesCodeExamples()
                .getRuleCodeExample()
                .add("SELECT 1; DELETE FROM temp1; SELECT 2;");
        rule.getRuleImplementation()
                .getViolatingRulesCodeExamples()
                .getRuleCodeExample()
                .add("COMMIT; DELETE FROM temp1;");
        rule.getRuleImplementation()
                .getCompliantRulesCodeExamples()
                .getRuleCodeExample()
                .add("SELECT 1; DELETE FROM temp1; COMMIT; SELECT 2; ");
        return rule;
    }
}
