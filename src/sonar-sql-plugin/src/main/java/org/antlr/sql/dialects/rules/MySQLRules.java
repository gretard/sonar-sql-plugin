package org.antlr.sql.dialects.rules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.dialects.mysql.MySqlParser.ComparisonOperatorContext;
import org.antlr.sql.dialects.mysql.MySqlParser.ConstantContext;
import org.antlr.sql.dialects.mysql.MySqlParser.FromClauseContext;
import org.antlr.sql.dialects.mysql.MySqlParser.FullColumnNameListContext;
import org.antlr.sql.dialects.mysql.MySqlParser.InsertStatementContext;
import org.antlr.sql.dialects.mysql.MySqlParser.LikePredicateContext;
import org.antlr.sql.dialects.mysql.MySqlParser.LogicalOperatorContext;
import org.antlr.sql.dialects.mysql.MySqlParser.OrderByClauseContext;
import org.antlr.sql.dialects.mysql.MySqlParser.OrderByExpressionContext;
import org.antlr.sql.dialects.mysql.MySqlParser.PredicateExpressionContext;
import org.antlr.sql.dialects.mysql.MySqlParser.QuerySpecificationContext;
import org.antlr.sql.dialects.mysql.MySqlParser.ScalarFunctionCallContext;
import org.antlr.sql.dialects.mysql.MySqlParser.ScalarFunctionNameContext;
import org.antlr.sql.dialects.mysql.MySqlParser.SelectStarElementContext;
import org.antlr.sql.dialects.mysql.MySqlParser.UidContext;
import org.antlr.sql.dialects.mysql.MySqlParser.UnionStatementContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleMatchType;
import org.sonar.plugins.sql.models.rules.RuleResultType;
import org.sonar.plugins.sql.models.rules.SqlRules;
import org.sonar.plugins.sql.models.rules.TextCheckType;

public enum MySQLRules {

	INSTANCE;

	BaseRules baseRules = BaseRules.INSTANCE;

	public List<SqlRules> getRules() {
		List<SqlRules> rules = new ArrayList<>();
		{
			SqlRules customRules = new SqlRules();
			customRules.setRepoKey("SQLCC");
			customRules.setRepoName("SQL Plugin checks");
			customRules.setDialect(Dialects.MYSQL.name());
			customRules.getRule()
					.addAll(Arrays.asList(getWaitForRule(), getSelectAllRule(), getInsertRule(), getOrderByRule(),
							getSargRule(), getNullComparisonRule(), getWhereWithOrVsUnionRule(),
							getUnionVsUnionALLRule(), getCartesianJoinsRule(), getExistsVsInRule(),
							getOrderByRuleWithoutAscDesc()));
			rules.add(customRules);
		}
		return rules;
	}

	protected Rule getCartesianJoinsRule() {

		var rule = baseRules.getCartesianJoinsRule();
		RuleImplementation parent = rule.getRuleImplementation();

		parent.getNames().getTextItem()
				.add(org.antlr.sql.dialects.mysql.MySqlParser.FromClauseContext.class.getSimpleName());
		parent.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		
		RuleImplementation child = new RuleImplementation();

		child.getNames().getTextItem()
				.add(org.antlr.sql.dialects.mysql.MySqlParser.TableSourceBaseContext.class.getSimpleName());
		child.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		child.setRuleResultType(RuleResultType.FAIL_IF_MORE_FOUND);
		child.setTimes(1);

		parent.getChildrenRules().getRuleImplementation().add(child);
		return rule;
	}

	protected Rule getWaitForRule() {
		Rule rule = baseRules.getWaitForRule();
		RuleImplementation impl = rule.getRuleImplementation();
		impl.getNames().getTextItem().add(ScalarFunctionNameContext.class.getSimpleName());
		impl.getTextToFind().getTextItem().add("SLEEP");
		impl.setTextCheckType(TextCheckType.STRICT);

		impl.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		impl.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		impl.setRuleViolationMessage("SLEEP is used.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT SLEEP(5);");

		return rule;
	}

	protected Rule getSelectAllRule() {
		Rule rule = baseRules.getSelectAllRule();
		RuleImplementation impl = rule.getRuleImplementation();

		impl.getNames().getTextItem().add(SelectStarElementContext.class.getSimpleName());
		impl.getTextToFind().getTextItem().add("*");

		impl.setTextCheckType(TextCheckType.STRICT);
		impl.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		return rule;
	}

	protected Rule getInsertRule() {
		Rule rule = baseRules.getInsertRule();
		RuleImplementation impl = rule.getRuleImplementation();

		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(FullColumnNameListContext.class.getSimpleName());
		child2.setTextCheckType(TextCheckType.DEFAULT);
		child2.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		child2.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		impl.getChildrenRules().getRuleImplementation().add(child2);
		impl.getNames().getTextItem().add(InsertStatementContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);

		return rule;
	}

	protected Rule getOrderByRule() {
		Rule rule = baseRules.getOrderByRule();
		RuleImplementation impl = rule.getRuleImplementation();

		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(OrderByExpressionContext.class.getSimpleName());
		child2.setTextCheckType(TextCheckType.REGEXP);
		child2.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		child2.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		child2.getTextToFind().getTextItem().add("[0-9]+");

		impl.getChildrenRules().getRuleImplementation().add(child2);
		impl.getNames().getTextItem().add(OrderByClauseContext.class.getSimpleName());

		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);
		impl.setRuleViolationMessage("Positional reference is used instead of column name in an ORDER BY clause.");

		rule.setRuleImplementation(impl);
		return rule;
	}

	protected Rule getNullComparisonRule() {

		Rule rule = baseRules.getNullComparisonRule();
		RuleImplementation rImpl = rule.getRuleImplementation();
		rImpl.getNames().getTextItem().add(PredicateExpressionContext.class.getSimpleName());
		rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		RuleImplementation child = new RuleImplementation();
		child.getTextToFind().getTextItem().add("!=");
		child.getTextToFind().getTextItem().add("<>");
		child.getTextToFind().getTextItem().add("=");
		child.setTextCheckType(TextCheckType.STRICT);
		child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		child.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
		child.getNames().getTextItem().add(ComparisonOperatorContext.class.getSimpleName());

		RuleImplementation childNull = new RuleImplementation();

		childNull.getTextToFind().getTextItem().add("NULL");
		childNull.setTextCheckType(TextCheckType.STRICT);
		childNull.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		childNull.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		childNull.getNames().getTextItem().add(ConstantContext.class.getSimpleName());

		rImpl.getChildrenRules().getRuleImplementation().add(child);
		rImpl.getChildrenRules().getRuleImplementation().add(childNull);

		return rule;
	}

	protected Rule getWhereWithOrVsUnionRule() {

		Rule rule = baseRules.getWhereWithOrVsUnionRule();
		RuleImplementation rImpl = rule.getRuleImplementation();

		rImpl.getNames().getTextItem().add(FromClauseContext.class.getSimpleName());
		rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		rImpl.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
		RuleImplementation child = new RuleImplementation();
		child.getTextToFind().getTextItem().add("or");
		child.setTextCheckType(TextCheckType.STRICT);
		child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		child.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		child.getNames().getTextItem().add(LogicalOperatorContext.class.getSimpleName());

		rImpl.getChildrenRules().getRuleImplementation().add(child);
		return rule;
	}

	protected Rule getUnionVsUnionALLRule() {
		Rule rule = baseRules.getUnionVsUnionALLRule();
		RuleImplementation rImpl = rule.getRuleImplementation();

		rImpl.getNames().getTextItem().add(UnionStatementContext.class.getSimpleName());
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

	protected Rule getExistsVsInRule() {
		Rule rule = baseRules.getExistsVsInRule();

		RuleImplementation rImpl = rule.getRuleImplementation();
		rImpl.getNames().getTextItem().add(PredicateExpressionContext.class.getSimpleName());
		rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		RuleImplementation child = new RuleImplementation();
		child.getTextToFind().getTextItem().add("in");
		child.setTextCheckType(TextCheckType.STRICT);
		child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		child.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		child.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());

		RuleImplementation childSubqueryContext = new RuleImplementation();
		childSubqueryContext.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		childSubqueryContext.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
		childSubqueryContext.getNames().getTextItem().add(QuerySpecificationContext.class.getSimpleName());

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
		impl.getNames().getTextItem().add(OrderByExpressionContext.class.getSimpleName());

		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
		return rule;
	}

	protected Rule getSargRule() {

		Rule rule = baseRules.getSargRule();

		RuleImplementation impl = rule.getRuleImplementation();

		RuleImplementation functionCallContainsColRef = new RuleImplementation();
		functionCallContainsColRef.getNames().getTextItem().add(UidContext.class.getSimpleName());
		functionCallContainsColRef.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		functionCallContainsColRef.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		functionCallContainsColRef
				.setRuleViolationMessage("Non-sargeable argument found - column referenced in a function.");

		RuleImplementation ruleFunctionCall = new RuleImplementation();
		ruleFunctionCall.getNames().getTextItem().add(ScalarFunctionCallContext.class.getSimpleName());
		ruleFunctionCall.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		ruleFunctionCall.setRuleResultType(RuleResultType.DEFAULT);
		ruleFunctionCall.getChildrenRules().getRuleImplementation().add(functionCallContainsColRef);

		RuleImplementation predicateContextContainsLike = new RuleImplementation();
		predicateContextContainsLike.getTextToFind().getTextItem().add("LIKE");
		predicateContextContainsLike.setTextCheckType(TextCheckType.CONTAINS);
		predicateContextContainsLike.getNames().getTextItem().add(LikePredicateContext.class.getSimpleName());
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
		impl.getNames().getTextItem().add(PredicateExpressionContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);

		return rule;
	}

}
