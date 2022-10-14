package org.antlr.sql.dialects.rules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.dialects.mysql.MySqlParser.InsertStatementContext;
import org.antlr.sql.dialects.mysql.MySqlParser.UidListContext;
import org.antlr.sql.dialects.psqlv1.PostgreSQLParser.Combine_clauseContext;
import org.antlr.sql.dialects.psqlv1.PostgreSQLParser.ExprContext;
import org.antlr.sql.dialects.psqlv1.PostgreSQLParser.Func_callContext;
import org.antlr.sql.dialects.psqlv1.PostgreSQLParser.IdentifierContext;
import org.antlr.sql.dialects.psqlv1.PostgreSQLParser.Order_by_clauseContext;
import org.antlr.sql.dialects.psqlv1.PostgreSQLParser.Order_by_itemContext;
import org.antlr.sql.dialects.psqlv1.PostgreSQLParser.PredicateContext;
import org.antlr.sql.dialects.psqlv1.PostgreSQLParser.Select_stmtContext;
import org.antlr.sql.dialects.psqlv1.PostgreSQLParser.Where_clauseContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.A_exprContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.A_expr_andContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.A_expr_inContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.A_expr_likeContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.C_expr_exprContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.Func_applicationContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.Func_exprContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.Indirection_elContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.Insert_column_listContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.InsertstmtContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.Opt_sort_clauseContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.Select_clauseContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.Set_operator_with_all_or_distinctContext;
import org.antlr.sql.dialects.psqlv2.PostgreSQLParser.SortbyContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleDistanceIndexMatchType;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleMatchType;
import org.sonar.plugins.sql.models.rules.RuleResultType;
import org.sonar.plugins.sql.models.rules.SqlRules;
import org.sonar.plugins.sql.models.rules.TextCheckType;

public enum PSSQLV2Rules {

	INSTANCE;
	
	BaseRules baseRules = BaseRules.INSTANCE;

	public List<SqlRules> getRules() {
		List<SqlRules> rules = new ArrayList<>();
		{
			SqlRules customRules = new SqlRules();
			customRules.setRepoKey("SQLCC");
			customRules.setRepoName("SQL Plugin checks");
			customRules.setDialect(Dialects.PSSQLV2.name());
			customRules.getRule()
					.addAll(Arrays.asList(
							getWaitForRule(),
							getSelectAllRule(),   
							getInsertRule(),
							getOrderByRule(), 
							getSargRule(),
							getNullComparisonRule(), 
							getWhereWithOrVsUnionRule(), 
							getUnionVsUnionALLRule(),
							getExistsVsInRule(), 
							getOrderByRuleWithoutAscDesc())
							);
			rules.add(customRules);
		}
		return rules;
	}

	protected Rule getWaitForRule() {
		Rule rule = baseRules.getWaitForRule();
		RuleImplementation impl = rule.getRuleImplementation();
		impl.getNames().getTextItem().add(Func_exprContext.class.getSimpleName());
		impl.getTextToFind().getTextItem().add("PG_SLEEP");
		impl.setTextCheckType(TextCheckType.CONTAINS);
		impl.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		impl.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		impl.setRuleViolationMessage("PG_SLEEP is used.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT PG_SLEEP(5);");

		return rule;
	}

	protected Rule getSelectAllRule() {
		Rule rule = baseRules.getSelectAllRule();
		RuleImplementation impl = rule.getRuleImplementation();

		impl.getNames().getTextItem().add(Indirection_elContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		{
			RuleImplementation child = new RuleImplementation();
			child.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());
			child.getTextToFind().getTextItem().add("*");
			child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
			child.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
			child.setDistance(1);
			child.setDistanceCheckType(RuleDistanceIndexMatchType.EQUALS);
			impl.getChildrenRules().getRuleImplementation().add(child);
		}

		return rule;
	}

	protected Rule getInsertRule() {
		Rule rule = baseRules.getInsertRule();
		RuleImplementation impl = rule.getRuleImplementation();

		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(Insert_column_listContext.class.getSimpleName());
		child2.setTextCheckType(TextCheckType.DEFAULT);
		child2.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		child2.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		impl.getChildrenRules().getRuleImplementation().add(child2);
		impl.getNames().getTextItem().add(InsertstmtContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);

		return rule;
	}

	protected Rule getOrderByRule() {
		Rule rule = baseRules.getOrderByRule();
		RuleImplementation impl = rule.getRuleImplementation();

		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(SortbyContext.class.getSimpleName());
		child2.setTextCheckType(TextCheckType.REGEXP);
		child2.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		child2.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		child2.getTextToFind().getTextItem().add("[0-9]+");

		impl.getChildrenRules().getRuleImplementation().add(child2);
		impl.getNames().getTextItem().add(Opt_sort_clauseContext.class.getSimpleName());

		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
		impl.setRuleViolationMessage("Positional reference is used instead of column name in an ORDER BY clause.");

		rule.setRuleImplementation(impl);
		return rule;
	}

	protected Rule getNullComparisonRule() {

		Rule rule = baseRules.getNullComparisonRule();
		RuleImplementation rImpl = rule.getRuleImplementation();
		rImpl.getNames().getTextItem().add(A_expr_inContext.class.getSimpleName());
		rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		RuleImplementation child = new RuleImplementation();
		child.getTextToFind().getTextItem().add("!=");
		child.getTextToFind().getTextItem().add("<>");
		child.getTextToFind().getTextItem().add("=");
		child.setTextCheckType(TextCheckType.STRICT);
		child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		child.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
		child.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());

		RuleImplementation childNull = new RuleImplementation();

		childNull.getTextToFind().getTextItem().add("NULL");
		childNull.setTextCheckType(TextCheckType.STRICT);
		childNull.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		childNull.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		childNull.getNames().getTextItem().add(C_expr_exprContext.class.getSimpleName());

		rImpl.getChildrenRules().getRuleImplementation().add(child);
		rImpl.getChildrenRules().getRuleImplementation().add(childNull);

		return rule;
	}

	protected Rule getWhereWithOrVsUnionRule() {

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

	protected Rule getUnionVsUnionALLRule() {
		Rule rule = baseRules.getUnionVsUnionALLRule();
		RuleImplementation rImpl = rule.getRuleImplementation();

		rImpl.getNames().getTextItem().add(Set_operator_with_all_or_distinctContext.class.getSimpleName());
		rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		{
			RuleImplementation child = new RuleImplementation();
			child.getTextToFind().getTextItem().add("all");
			child.setTextCheckType(TextCheckType.STRICT);
			child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
			child.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
			child.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());

			rImpl.getChildrenRules().getRuleImplementation().add(child);
		}
		{
			RuleImplementation child = new RuleImplementation();
			child.getTextToFind().getTextItem().add("union");
			child.setTextCheckType(TextCheckType.STRICT);
			child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
			child.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
			child.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());

			rImpl.getChildrenRules().getRuleImplementation().add(child);
		}
		return rule;
	}

	protected Rule getExistsVsInRule() {
		Rule rule = baseRules.getExistsVsInRule();

		RuleImplementation rImpl = rule.getRuleImplementation();
		rImpl.getNames().getTextItem().add(Where_clauseContext.class.getSimpleName());
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
		childSubqueryContext.getNames().getTextItem().add(Select_clauseContext.class.getSimpleName());

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
		impl.getNames().getTextItem().add(SortbyContext.class.getSimpleName());

		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
		return rule;
	}

	protected Rule getSargRule() {

		Rule rule = baseRules.getSargRule();

		RuleImplementation impl = rule.getRuleImplementation();

		RuleImplementation functionCallContainsColRef = new RuleImplementation();
		functionCallContainsColRef.getNames().getTextItem().add(IdentifierContext.class.getSimpleName());
		functionCallContainsColRef.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		functionCallContainsColRef.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		functionCallContainsColRef
				.setRuleViolationMessage("Non-sargeable argument found - column referenced in a function.");

		RuleImplementation ruleFunctionCall = new RuleImplementation();
		ruleFunctionCall.getNames().getTextItem().add(Func_applicationContext.class.getSimpleName());
		ruleFunctionCall.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		ruleFunctionCall.setRuleResultType(RuleResultType.DEFAULT);
		ruleFunctionCall.getChildrenRules().getRuleImplementation().add(functionCallContainsColRef);

		RuleImplementation predicateContextContainsLike = new RuleImplementation();
		predicateContextContainsLike.getTextToFind().getTextItem().add("LIKE");
		predicateContextContainsLike.setTextCheckType(TextCheckType.CONTAINS);
		predicateContextContainsLike.getNames().getTextItem().add(A_exprContext.class.getSimpleName());
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
		impl.getNames().getTextItem().add(Where_clauseContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);

		return rule;
	}

}
