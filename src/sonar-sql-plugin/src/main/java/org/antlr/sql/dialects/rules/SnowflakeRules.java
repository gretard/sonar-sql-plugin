package org.antlr.sql.dialects.rules;

import java.util.ArrayList;
import java.util.List;
import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Column_elemContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Column_list_in_parenthesesContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Comparison_operatorContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Create_viewContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.From_clauseContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Function_callContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Id_Context;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Insert_statementContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.NumContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Order_by_clauseContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Order_itemContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.PredicateContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Search_conditionContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Select_statementContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.SetContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Set_operatorsContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Sql_commandContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.SubqueryContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Table_sourceContext;
import org.antlr.sql.dialects.snowflake.SnowflakeParser.Where_clauseContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleDistanceIndexMatchType;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleMatchType;
import org.sonar.plugins.sql.models.rules.RuleMode;
import org.sonar.plugins.sql.models.rules.RuleResultType;
import org.sonar.plugins.sql.models.rules.SqlRules;
import org.sonar.plugins.sql.models.rules.TextCheckType;

public enum SnowflakeRules {
    INSTANCE;

    BaseRules baseRules = BaseRules.INSTANCE;

    public List<SqlRules> getRules() {
        List<SqlRules> rules = new ArrayList<>();
        {
            SqlRules customRules = new SqlRules();
            customRules.setRepoKey("SQLCC");
            customRules.setRepoName("SQL Plugin checks");
            customRules.setDialect(Dialects.SNOWFLAKE.name());
            customRules.getRule().add(getSelectAllRule());
            customRules.getRule().add(getNullComparisonRule());
            customRules.getRule().add(getInsertRule());
            customRules.getRule().add(getOrderByRule());
            customRules.getRule().add(getSargRule());
            customRules.getRule().add(getWhereWithOrVsUnionRule());
            customRules.getRule().add(getUnionVsUnionALLRule());
            customRules.getRule().add(getExistsVsInRule());
            customRules.getRule().add(getOrderByRuleWithoutAscDesc());

            customRules.getRule().add(getMaterializedView());
            customRules.getRule().add(getCartesianJoinsRule());

            // customRules.getRule().add(getColumnListRule());
            rules.add(customRules);
        }
        return rules;
    }

    public Rule getColumnListRule() {

        Rule rule = baseRules.getColumnListRule();

        // find all column refs
        RuleImplementation columnRef = rule.getRuleImplementation();
        columnRef
                .getNames()
                .getTextItem()
                .add(
                        org.antlr.sql.dialects.snowflake.SnowflakeParser.Select_list_elemContext
                                .class
                                .getSimpleName());
        columnRef.setRuleMatchType(RuleMatchType.CLASS_ONLY);

        {
            // only check SELECT clauses
            RuleImplementation columnRefCheck = new RuleImplementation();
            columnRefCheck
                    .getNames()
                    .getTextItem()
                    .add(
                            org.antlr.sql.dialects.snowflake.SnowflakeParser.Select_clauseContext
                                    .class
                                    .getSimpleName());
            columnRefCheck.setRuleMatchType(RuleMatchType.CLASS_ONLY);
            columnRefCheck.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
            columnRef.getParentRules().getRuleImplementation().add(columnRefCheck);
        }
        {

            // Skip select *
            RuleImplementation columnRefCheck = new RuleImplementation();
            columnRefCheck
                    .getNames()
                    .getTextItem()
                    .add(
                            org.antlr.sql.dialects.snowflake.SnowflakeParser
                                    .Select_list_no_topContext.class
                                    .getSimpleName());
            columnRefCheck.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
            columnRefCheck.getTextToFind().getTextItem().add("*");

            columnRefCheck.setRuleResultType(RuleResultType.SKIP_IF_FOUND);
            columnRef.getParentRules().getRuleImplementation().add(columnRefCheck);
        }
        {
            // check if columns contain references
            RuleImplementation columnRefCheck = new RuleImplementation();
            columnRefCheck
                    .getNames()
                    .getTextItem()
                    .add(
                            org.antlr.sql.dialects.snowflake.SnowflakeParser.AliasContext.class
                                    .getSimpleName());
            columnRefCheck.setRuleMatchType(RuleMatchType.CLASS_ONLY);
            columnRefCheck.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
            columnRef.getChildrenRules().getRuleImplementation().add(columnRefCheck);
        }
        //// Select_clauseContext
        {
            RuleImplementation selectClause = new RuleImplementation();
            selectClause
                    .getNames()
                    .getTextItem()
                    .add(
                            org.antlr.sql.dialects.snowflake.SnowflakeParser.Select_clauseContext
                                    .class
                                    .getSimpleName());
            selectClause.setRuleMatchType(RuleMatchType.CLASS_ONLY);

            RuleImplementation selectClauseContext = new RuleImplementation();
            selectClauseContext
                    .getNames()
                    .getTextItem()
                    .add(
                            org.antlr.sql.dialects.snowflake.SnowflakeParser
                                    .Select_optional_clausesContext.class
                                    .getSimpleName());
            selectClauseContext.setDistance(1);
            selectClauseContext.setDistanceCheckType(RuleDistanceIndexMatchType.EQUALS);

            selectClauseContext.setRuleMatchType(RuleMatchType.CLASS_ONLY);

            RuleImplementation fromClause = new RuleImplementation();
            fromClause
                    .getNames()
                    .getTextItem()
                    .add(
                            org.antlr.sql.dialects.snowflake.SnowflakeParser.From_clauseContext
                                    .class
                                    .getSimpleName());
            fromClause.setRuleMatchType(RuleMatchType.CLASS_ONLY);

            RuleImplementation tableRefs = new RuleImplementation();
            tableRefs
                    .getNames()
                    .getTextItem()
                    .add(
                            org.antlr.sql.dialects.snowflake.SnowflakeParser.Object_refContext.class
                                    .getSimpleName());
            tableRefs.setRuleMatchType(RuleMatchType.CLASS_ONLY);
            tableRefs.setRuleResultType(RuleResultType.SKIP_IF_LESS_FOUND);
            tableRefs.setTimes(2);

            fromClause.getChildrenRules().getRuleImplementation().add(tableRefs);
            selectClauseContext.getChildrenRules().getRuleImplementation().add(fromClause);
            selectClause.getSiblingsRules().getRuleImplementation().add(selectClauseContext);
            columnRef.getParentRules().getRuleImplementation().add(selectClause);
        }

        return rule;
    }

    public Rule getMaterializedView() {

        Rule r = new Rule();
        r.setKey("C022");
        r.setInternalKey("C022");
        r.setDescription("<h2>Description</h2><p>Consider using materialized view.</p>");
        r.setSeverity("MAJOR");
        r.setTag("performance");
        r.setRemediationFunction("LINEAR");
        r.setDebtRemediationFunctionCoefficient("3min");
        r.setName("Non-materialized view found");
        RuleImplementation rImpl = new RuleImplementation();

        rImpl.setRuleViolationMessage("Consider using materialized view");
        r.setRuleImplementation(rImpl);
        rImpl.getCompliantRulesCodeExamples()
                .getRuleCodeExample()
                .add("CREATE MATERIALIZED VIEW V1 (C1) AS SELECT 1 as C1;");
        rImpl.getViolatingRulesCodeExamples()
                .getRuleCodeExample()
                .add("CREATE VIEW V1 (C1) AS SELECT 1 as C1;");

        rImpl.getNames().getTextItem().add(Create_viewContext.class.getSimpleName());
        rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        rImpl.setRuleResultType(RuleResultType.FAIL_IF_FOUND);

        return r;
    }

    public Rule getUnusedVariableRule() {
        Rule r = new Rule();
        r.setInternalKey("C024");
        r.setKey("C024");
        r.setName("Unused variable found");
        r.setDescription("<h2>Description</h2><p>Unused variable found.</p>");

        RuleImplementation useRule = new RuleImplementation();
        useRule.getNames().getTextItem().add(Sql_commandContext.class.getSimpleName());
        useRule.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);

        RuleImplementation impl = new RuleImplementation();
        impl.getUsesRules().getRuleImplementation().add(useRule);

        impl.getNames().getTextItem().add(SetContext.class.getSimpleName());
        impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        impl.setRuleMode(RuleMode.GROUP);

        impl.getCompliantRulesCodeExamples()
                .getRuleCodeExample()
                .add("SET $size = 'XSMALL'; SELECT $size; ");
        impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SET $size = 'XSMALL';");

        impl.setRuleViolationMessage("Unused variable found");
        r.setRuleImplementation(impl);
        return r;
    }

    public Rule getCartesianJoinsRule() {

        Rule rule = baseRules.getCartesianJoinsRule();
        RuleImplementation rImpl = rule.getRuleImplementation();

        rImpl.getNames().getTextItem().add(From_clauseContext.class.getSimpleName());
        rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        rImpl.setRuleResultType(RuleResultType.DEFAULT);

        RuleImplementation child = new RuleImplementation();
        child.getNames().getTextItem().add(Table_sourceContext.class.getSimpleName());
        child.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        child.setRuleResultType(RuleResultType.FAIL_IF_MORE_FOUND);
        child.setTimes(1);
        rImpl.getChildrenRules().getRuleImplementation().add(child);
        return rule;
    }

    public Rule getWhereWithOrVsUnionRule() {

        Rule rule = baseRules.getWhereWithOrVsUnionRule();
        RuleImplementation rImpl = rule.getRuleImplementation();

        rImpl.getNames().getTextItem().add(Where_clauseContext.class.getSimpleName());
        rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);

        RuleImplementation child = new RuleImplementation();
        child.getTextToFind().getTextItem().add("or");
        child.setTextCheckType(TextCheckType.STRICT);
        child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
        child.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
        child.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());

        rImpl.getChildrenRules().getRuleImplementation().add(child);
        return rule;
    }

    public Rule getUnionVsUnionALLRule() {
        Rule rule = baseRules.getUnionVsUnionALLRule();
        RuleImplementation rImpl = rule.getRuleImplementation();

        rImpl.getNames().getTextItem().add(Set_operatorsContext.class.getSimpleName());
        rImpl.setRuleViolationMessage(
                "Consider using UNION ALL instead of UNION operator for the performance reasons.");
        rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        rImpl.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);

        RuleImplementation child = new RuleImplementation();
        child.getTextToFind().getTextItem().add("all");
        child.setTextCheckType(TextCheckType.STRICT);
        child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
        child.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
        child.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());

        rImpl.getChildrenRules().getRuleImplementation().add(child);
        return rule;
    }

    public Rule getExistsVsInRule() {
        Rule rule = baseRules.getExistsVsInRule();

        RuleImplementation rImpl = rule.getRuleImplementation();
        rImpl.getNames().getTextItem().add(PredicateContext.class.getSimpleName());
        rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        rImpl.setRuleViolationMessage(
                "Consider using EXISTS/NOT EXISTS instead of IN/NOT IN in a clause.");

        RuleImplementation child = new RuleImplementation();
        child.getTextToFind().getTextItem().add("in");
        child.setTextCheckType(TextCheckType.STRICT);
        child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
        child.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
        child.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());

        RuleImplementation childSubqueryContext = new RuleImplementation();
        childSubqueryContext.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        childSubqueryContext.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
        childSubqueryContext.getNames().getTextItem().add(SubqueryContext.class.getSimpleName());

        rImpl.getChildrenRules().getRuleImplementation().add(child);
        rImpl.getChildrenRules().getRuleImplementation().add(childSubqueryContext);
        return rule;
    }

    public Rule getOrderByRuleWithoutAscDesc() {
        Rule rule = baseRules.getOrderByRuleWithoutAscDesc();

        RuleImplementation impl = rule.getRuleImplementation();

        RuleImplementation child2 = new RuleImplementation();
        child2.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());
        child2.getTextToFind().getTextItem().add("asc");
        child2.getTextToFind().getTextItem().add("desc");
        child2.setTextCheckType(TextCheckType.STRICT);
        child2.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
        child2.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
        child2.setRuleViolationMessage("test");
        impl.getChildrenRules().getRuleImplementation().add(child2);
        impl.getNames().getTextItem().add(Order_itemContext.class.getSimpleName());

        impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        impl.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
        return rule;
    }

    public Rule getSargRule() {

        Rule rule = baseRules.getSargRule();

        RuleImplementation impl = rule.getRuleImplementation();
        impl.setRuleViolationMessage("Non-sargeable argument found");
        impl.getNames().getTextItem().add(Search_conditionContext.class.getSimpleName());
        impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        impl.setRuleResultType(RuleResultType.DEFAULT);

        RuleImplementation functionCallContainsColRef = new RuleImplementation();
        functionCallContainsColRef.getNames().getTextItem().add(Id_Context.class.getSimpleName());
        functionCallContainsColRef.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        functionCallContainsColRef.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
        functionCallContainsColRef.setRuleViolationMessage(
                "Non-sargeable argument found - column referenced in a function.");

        RuleImplementation ruleFunctionCall = new RuleImplementation();
        // ruleFunctionCall.getNames().getTextItem().add(BUILT_IN_FUNCContext.class.getSimpleName());
        ruleFunctionCall.getNames().getTextItem().add(Function_callContext.class.getSimpleName());
        ruleFunctionCall.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        ruleFunctionCall.setRuleResultType(RuleResultType.DEFAULT);
        ruleFunctionCall.getChildrenRules().getRuleImplementation().add(functionCallContainsColRef);

        RuleImplementation predicateContextContainsLike = new RuleImplementation();
        predicateContextContainsLike.getTextToFind().getTextItem().add("LIKE");
        predicateContextContainsLike.setTextCheckType(TextCheckType.CONTAINS);
        predicateContextContainsLike
                .getNames()
                .getTextItem()
                .add(PredicateContext.class.getSimpleName());
        predicateContextContainsLike.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
        predicateContextContainsLike.setRuleResultType(RuleResultType.DEFAULT);

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

        predicateContextContainsLike
                .getChildrenRules()
                .getRuleImplementation()
                .add(functionCallContainsLikeWildcard);

        impl.getChildrenRules().getRuleImplementation().add(ruleFunctionCall);
        impl.getChildrenRules().getRuleImplementation().add(predicateContextContainsLike);

        RuleImplementation whereClauseContextOnly = new RuleImplementation();
        whereClauseContextOnly
                .getNames()
                .getTextItem()
                .add(Where_clauseContext.class.getSimpleName());
        whereClauseContextOnly.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        whereClauseContextOnly.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);

        impl.getParentRules().getRuleImplementation().add(whereClauseContextOnly);

        return rule;
    }

    public Rule getOrderByRule() {
        Rule rule = baseRules.getOrderByRule();
        RuleImplementation impl = rule.getRuleImplementation();

        RuleImplementation child2 = new RuleImplementation();
        child2.getNames().getTextItem().add(NumContext.class.getSimpleName());
        child2.setTextCheckType(TextCheckType.DEFAULT);
        child2.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
        child2.setRuleMatchType(RuleMatchType.CLASS_ONLY);

        impl.getChildrenRules().getRuleImplementation().add(child2);
        impl.getNames().getTextItem().add(Order_by_clauseContext.class.getSimpleName());

        impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        impl.setRuleResultType(RuleResultType.DEFAULT);
        impl.setRuleViolationMessage(
                "Positional reference is used instead of column name in an ORDER BY clause.");

        rule.setRuleImplementation(impl);
        return rule;
    }

    public Rule getNullComparisonRule() {

        Rule rule = baseRules.getNullComparisonRule();
        RuleImplementation rImpl = rule.getRuleImplementation();
        rImpl.getNames().getTextItem().add(PredicateContext.class.getSimpleName());
        rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);

        RuleImplementation child = new RuleImplementation();
        child.getTextToFind().getTextItem().add("!=");
        child.getTextToFind().getTextItem().add("<>");
        child.getTextToFind().getTextItem().add("=");
        child.setTextCheckType(TextCheckType.STRICT);
        child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
        child.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
        child.getNames().getTextItem().add(Comparison_operatorContext.class.getSimpleName());

        RuleImplementation childNull = new RuleImplementation();

        childNull.getTextToFind().getTextItem().add("NULL");
        childNull.setTextCheckType(TextCheckType.STRICT);
        childNull.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
        childNull.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
        childNull.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());

        rImpl.getChildrenRules().getRuleImplementation().add(child);
        rImpl.getChildrenRules().getRuleImplementation().add(childNull);

        return rule;
    }

    public Rule getInsertRule() {
        Rule rule = baseRules.getInsertRule();
        RuleImplementation impl = rule.getRuleImplementation();

        RuleImplementation child2 = new RuleImplementation();
        child2.getNames()
                .getTextItem()
                .add(Column_list_in_parenthesesContext.class.getSimpleName());

        child2.setTextCheckType(TextCheckType.DEFAULT);
        child2.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
        child2.setRuleMatchType(RuleMatchType.CLASS_ONLY);

        impl.getChildrenRules().getRuleImplementation().add(child2);
        impl.getNames().getTextItem().add(Insert_statementContext.class.getSimpleName());
        impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
        impl.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
        return rule;
    }

    public Rule getSelectAllRule() {
        Rule rule = baseRules.getSelectAllRule();
        RuleImplementation impl = rule.getRuleImplementation();

        impl.getNames().getTextItem().add(Select_statementContext.class.getSimpleName());
        impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);

        {
            RuleImplementation child = new RuleImplementation();
            child.getNames().getTextItem().add(Column_elemContext.class.getSimpleName());
            child.getTextToFind().getTextItem().add("*");
            child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
            child.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
            impl.getChildrenRules().getRuleImplementation().add(child);
        }

        return rule;
    }
}
