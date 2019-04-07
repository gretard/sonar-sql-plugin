package org.antlr.sql.dialects.rules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.dialects.tsql.TSqlParser.AsteriskContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Column_name_listContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Comparison_operatorContext;
import org.antlr.sql.dialects.tsql.TSqlParser.ConstantContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Create_indexContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Execute_statementContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Full_column_nameContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Func_proc_nameContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Function_callContext;
import org.antlr.sql.dialects.tsql.TSqlParser.IdContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Insert_statementContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Order_by_clauseContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Order_by_expressionContext;
import org.antlr.sql.dialects.tsql.TSqlParser.PredicateContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Primitive_expressionContext;
import org.antlr.sql.dialects.tsql.TSqlParser.SCALAR_FUNCTIONContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Search_conditionContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Search_condition_notContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Select_list_elemContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Sql_unionContext;
import org.antlr.sql.dialects.tsql.TSqlParser.SubqueryContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Table_constraintContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Table_hintContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Waitfor_statementContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleDistanceIndexMatchType;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleMatchType;
import org.sonar.plugins.sql.models.rules.RuleResultType;
import org.sonar.plugins.sql.models.rules.SqlRules;
import org.sonar.plugins.sql.models.rules.TextCheckType;

public enum TSQLRules {

	INSTANCE;
	BaseRules baseRules = BaseRules.INSTANCE;

	public List<SqlRules> getRules() {
		List<SqlRules> rules = new ArrayList<>();
		{
			SqlRules customRules = new SqlRules();
			customRules.setRepoKey("SQLCC");
			customRules.setRepoName("SQL Plugin checks");
			customRules.setDialect(Dialects.TSQL.name());
			customRules.getRule()
					.addAll(Arrays.asList(getWaitForRule(), getSelectAllRule(), getInsertRule(), getOrderByRule(),
							getExecRule(), getNoLockRule(), getSargRule(), getPKRule(), getFKRule(),
							getNullComparisonRule(), getIndexNamingRule(), getWhereWithOrVsUnionRule(),
							getUnionVsUnionALLRule(), getExistsVsInRule(), getOrderByRuleWithoutAscDesc()));
			rules.add(customRules);
		}
		return rules;
	}

	protected Rule getWaitForRule() {
		Rule rule = baseRules.getWaitForRule();
		RuleImplementation impl = rule.getRuleImplementation();
		impl.getNames().getTextItem().add(Waitfor_statementContext.class.getSimpleName());

		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		impl.setRuleViolationMessage("WAITFOR is used.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("WAITFOR '10:00:00';");

		return rule;
	}

	protected Rule getSelectAllRule() {
		Rule rule = baseRules.getSelectAllRule();
		RuleImplementation impl = rule.getRuleImplementation();

		impl.getNames().getTextItem().add(Select_list_elemContext.class.getSimpleName());

		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		
		RuleImplementation child = new RuleImplementation();

		child.getNames().getTextItem().add(AsteriskContext.class.getSimpleName());
		child.getTextToFind().getTextItem().add("*");

		child.setTextCheckType(TextCheckType.STRICT);
		child.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);

		impl.getChildrenRules().getRuleImplementation().add(child);

		//AsteriskContext
		return rule;
	}

	protected Rule getInsertRule() {
		Rule rule = baseRules.getInsertRule();
		RuleImplementation impl = rule.getRuleImplementation();

		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(Column_name_listContext.class.getSimpleName());
		child2.setTextCheckType(TextCheckType.DEFAULT);
		child2.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		child2.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		impl.getChildrenRules().getRuleImplementation().add(child2);
		impl.getNames().getTextItem().add(Insert_statementContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);

		return rule;
	}

	protected Rule getOrderByRule() {
		Rule rule = baseRules.getOrderByRule();
		RuleImplementation impl = rule.getRuleImplementation();

		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(ConstantContext.class.getSimpleName());
		child2.setTextCheckType(TextCheckType.DEFAULT);
		child2.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		child2.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		impl.getChildrenRules().getRuleImplementation().add(child2);
		impl.getNames().getTextItem().add(Order_by_clauseContext.class.getSimpleName());

		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);
		impl.setRuleViolationMessage("Positional reference is used instead of column name in an ORDER BY clause.");

		rule.setRuleImplementation(impl);
		return rule;
	}

	protected Rule getExecRule() {
		Rule rule = baseRules.getExecRule();
		RuleImplementation impl = rule.getRuleImplementation();

		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(Primitive_expressionContext.class.getSimpleName());
		child2.setTextCheckType(TextCheckType.DEFAULT);
		child2.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		child2.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		RuleImplementation skipSubRule = new RuleImplementation();
		skipSubRule.getNames().getTextItem().add(Func_proc_nameContext.class.getSimpleName());
		skipSubRule.setTextCheckType(TextCheckType.DEFAULT);
		skipSubRule.setRuleResultType(RuleResultType.SKIP_IF_FOUND);
		skipSubRule.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		impl.getChildrenRules().getRuleImplementation().add(child2);
		impl.getChildrenRules().getRuleImplementation().add(skipSubRule);
		impl.getNames().getTextItem().add(Execute_statementContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);

		return rule;
	}

	protected Rule getNoLockRule() {
		Rule rule = baseRules.getNoLockRule();
		RuleImplementation impl = rule.getRuleImplementation();

		impl.getTextToFind().getTextItem().add("NOLOCK");
		impl.setTextCheckType(TextCheckType.CONTAINS);
		impl.getNames().getTextItem().add(Table_hintContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		impl.setRuleResultType(RuleResultType.FAIL_IF_FOUND);

		return rule;
	}

	protected Rule getPKRule() {
		Rule rule = baseRules.getPKRule();
		RuleImplementation ruleImpl = rule.getRuleImplementation();

		ruleImpl.getNames().getTextItem().add(Table_constraintContext.class.getSimpleName());
		ruleImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		RuleImplementation child1 = new RuleImplementation();
		child1.getTextToFind().getTextItem().add("PRIMARY");
		child1.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());
		child1.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
		child1.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);

		RuleImplementation child2 = new RuleImplementation();
		child2.getTextToFind().getTextItem().add("KEY");
		child2.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());
		child2.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
		child2.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		ruleImpl.getChildrenRules().getRuleImplementation().add(child1);
		ruleImpl.getChildrenRules().getRuleImplementation().add(child2);

		RuleImplementation main = new RuleImplementation();
		main.getNames().getTextItem().add(IdContext.class.getSimpleName());
		main.setTextCheckType(TextCheckType.CONTAINS);
		main.getTextToFind().getTextItem().add("PK_");
		main.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		main.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		main.setRuleViolationMessage("Primary key is not defined using suggested naming convention to start with PK_.");
		main.setDistanceCheckType(RuleDistanceIndexMatchType.EQUALS);
		ruleImpl.getChildrenRules().getRuleImplementation().add(main);

		return rule;
	}

	protected Rule getFKRule() {
		Rule rule = baseRules.getFKRule();
		RuleImplementation ruleImpl = rule.getRuleImplementation();

		ruleImpl.getNames().getTextItem().add(Table_constraintContext.class.getSimpleName());
		ruleImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		RuleImplementation child1 = new RuleImplementation();
		child1.getTextToFind().getTextItem().add("FOREIGN");
		child1.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());
		child1.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
		child1.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);

		RuleImplementation child2 = new RuleImplementation();
		child2.getTextToFind().getTextItem().add("KEY");
		child2.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());
		child2.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
		child2.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		ruleImpl.getChildrenRules().getRuleImplementation().add(child1);
		ruleImpl.getChildrenRules().getRuleImplementation().add(child2);

		RuleImplementation main = new RuleImplementation();
		main.getNames().getTextItem().add(IdContext.class.getSimpleName());
		main.setTextCheckType(TextCheckType.CONTAINS);
		main.getTextToFind().getTextItem().add("FK_");
		main.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		main.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		main.setRuleViolationMessage("Foreign key is not defined using suggested naming convention to start with FK_.");
		main.setDistanceCheckType(RuleDistanceIndexMatchType.EQUALS);

		ruleImpl.getChildrenRules().getRuleImplementation().add(main);

		return rule;
	}

	// Search_conditionContext
	protected Rule getIndexNamingRule() {
		Rule rule = baseRules.getIndexNamingRule();

		RuleImplementation ruleImpl = rule.getRuleImplementation();

		ruleImpl.getNames().getTextItem().add(Create_indexContext.class.getSimpleName());
		ruleImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		RuleImplementation child1 = new RuleImplementation();
		child1.getTextToFind().getTextItem().add("INDEX");
		child1.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());
		child1.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
		child1.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);

		ruleImpl.getChildrenRules().getRuleImplementation().add(child1);

		RuleImplementation main = new RuleImplementation();
		main.getNames().getTextItem().add(IdContext.class.getSimpleName());
		main.setTextCheckType(TextCheckType.CONTAINS);
		main.getTextToFind().getTextItem().add("IX_");
		main.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		main.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);

		ruleImpl.getChildrenRules().getRuleImplementation().add(main);

		return rule;
	}

	protected Rule getNullComparisonRule() {

		Rule rule = baseRules.getNullComparisonRule();
		RuleImplementation rImpl = rule.getRuleImplementation();
		rImpl.getNames().getTextItem().add(Search_condition_notContext.class.getSimpleName());
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
		childNull.getNames().getTextItem().add(Primitive_expressionContext.class.getSimpleName());

		rImpl.getChildrenRules().getRuleImplementation().add(child);
		rImpl.getChildrenRules().getRuleImplementation().add(childNull);

		return rule;
	}

	protected Rule getWhereWithOrVsUnionRule() {

		Rule rule = baseRules.getWhereWithOrVsUnionRule();
		RuleImplementation rImpl = rule.getRuleImplementation();

		rImpl.getNames().getTextItem().add(Search_conditionContext.class.getSimpleName());
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

	protected Rule getUnionVsUnionALLRule() {
		Rule rule = baseRules.getUnionVsUnionALLRule();
		RuleImplementation rImpl = rule.getRuleImplementation();

		rImpl.getNames().getTextItem().add(Sql_unionContext.class.getSimpleName());
		rImpl.setRuleViolationMessage(
				"Consider using UNION ALL instead of UNION operator for the performance reasons.");
		rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		RuleImplementation child = new RuleImplementation();
		child.getTextToFind().getTextItem().add("all");
		child.setTextCheckType(TextCheckType.STRICT);
		child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		child.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		child.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());

		rImpl.getChildrenRules().getRuleImplementation().add(child);
		return rule;
	}

	protected Rule getExistsVsInRule() {
		Rule rule = baseRules.getExistsVsInRule();

		RuleImplementation rImpl = rule.getRuleImplementation();
		rImpl.getNames().getTextItem().add(PredicateContext.class.getSimpleName());
		rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		rImpl.setRuleViolationMessage("Consider using EXISTS/NOT EXISTS instead of IN/NOT IN in a clause.");

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

	protected Rule getOrderByRuleWithoutAscDesc() {
		Rule rule = baseRules.getOrderByRuleWithoutAscDesc();

		RuleImplementation impl = rule.getRuleImplementation();

		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());
		child2.getTextToFind().getTextItem().add("asc");
		child2.getTextToFind().getTextItem().add("desc");
		child2.setTextCheckType(TextCheckType.STRICT);
		child2.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		child2.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);

		impl.getChildrenRules().getRuleImplementation().add(child2);
		impl.getNames().getTextItem().add(Order_by_expressionContext.class.getSimpleName());

		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);
		return rule;
	}

	protected Rule getSargRule() {

		Rule rule = baseRules.getSargRule();

		RuleImplementation impl = rule.getRuleImplementation();

		RuleImplementation functionCallContainsColRef = new RuleImplementation();
		functionCallContainsColRef.getNames().getTextItem().add(Full_column_nameContext.class.getSimpleName());
		functionCallContainsColRef.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		functionCallContainsColRef.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		functionCallContainsColRef
				.setRuleViolationMessage("Non-sargeable argument found - column referenced in a function.");

		RuleImplementation ruleFunctionCall = new RuleImplementation();
		ruleFunctionCall.getNames().getTextItem().add(SCALAR_FUNCTIONContext.class.getSimpleName());
		ruleFunctionCall.getNames().getTextItem().add(Function_callContext.class.getSimpleName());
		ruleFunctionCall.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		ruleFunctionCall.setRuleResultType(RuleResultType.DEFAULT);
		ruleFunctionCall.getChildrenRules().getRuleImplementation().add(functionCallContainsColRef);

		RuleImplementation predicateContextContainsLike = new RuleImplementation();
		predicateContextContainsLike.getTextToFind().getTextItem().add("LIKE");
		predicateContextContainsLike.setTextCheckType(TextCheckType.CONTAINS);
		predicateContextContainsLike.getNames().getTextItem().add(PredicateContext.class.getSimpleName());
		predicateContextContainsLike.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		predicateContextContainsLike.setRuleResultType(RuleResultType.DEFAULT);

		RuleImplementation functionCallContainsLikeWildcard = new RuleImplementation();
		functionCallContainsLikeWildcard.getTextToFind().getTextItem().add("N?[',‘]%(.*?)'");
		functionCallContainsLikeWildcard.setTextCheckType(TextCheckType.REGEXP);
		functionCallContainsLikeWildcard.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());
		functionCallContainsLikeWildcard.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		functionCallContainsLikeWildcard.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		functionCallContainsLikeWildcard
				.setRuleViolationMessage("Non-sargeable argument found - predicate starts with wildcard. %");

		predicateContextContainsLike.getChildrenRules().getRuleImplementation().add(functionCallContainsLikeWildcard);

		impl.getChildrenRules().getRuleImplementation().add(ruleFunctionCall);
		impl.getChildrenRules().getRuleImplementation().add(predicateContextContainsLike);
		impl.setRuleViolationMessage("Non-sargeable argument found");
		impl.getNames().getTextItem().add(Search_conditionContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);

		return rule;
	}

}
