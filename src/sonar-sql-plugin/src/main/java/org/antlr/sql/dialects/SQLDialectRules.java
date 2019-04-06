package org.antlr.sql.dialects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.sql.dialects.mysql.MySqlParser.ComparisonOperatorContext;
import org.antlr.sql.dialects.mysql.MySqlParser.FunctionCallExpressionAtomContext;
import org.antlr.sql.dialects.mysql.MySqlParser.InsertStatementContext;
import org.antlr.sql.dialects.mysql.MySqlParser.LikePredicateContext;
import org.antlr.sql.dialects.mysql.MySqlParser.LogicalExpressionContext;
import org.antlr.sql.dialects.mysql.MySqlParser.LogicalOperatorContext;
import org.antlr.sql.dialects.mysql.MySqlParser.OrderByClauseContext;
import org.antlr.sql.dialects.mysql.MySqlParser.OrderByExpressionContext;
import org.antlr.sql.dialects.mysql.MySqlParser.PredicateExpressionContext;
import org.antlr.sql.dialects.mysql.MySqlParser.QuerySpecificationContext;
import org.antlr.sql.dialects.mysql.MySqlParser.ScalarFunctionCallContext;
import org.antlr.sql.dialects.mysql.MySqlParser.ScalarFunctionNameContext;
import org.antlr.sql.dialects.mysql.MySqlParser.SelectElementsContext;
import org.antlr.sql.dialects.mysql.MySqlParser.UidContext;
import org.antlr.sql.dialects.mysql.MySqlParser.UidListContext;
import org.antlr.sql.dialects.mysql.MySqlParser.UnionStatementContext;
import org.antlr.sql.dialects.psql.PostgreSQLParser.Func_callContext;
import org.antlr.sql.dialects.psql.PostgreSQLParser.Selector_clauseContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Column_name_listContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Comparison_operatorContext;
import org.antlr.sql.dialects.tsql.TSqlParser.ConstantContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Create_indexContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Cursor_nameContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Cursor_statementContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Declare_cursorContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Declare_statementContext;
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
import org.antlr.sql.dialects.tsql.TSqlParser.Query_expressionContext;
import org.antlr.sql.dialects.tsql.TSqlParser.SCALAR_FUNCTIONContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Search_conditionContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Select_list_elemContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Set_statementContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Simple_idContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Sql_unionContext;
import org.antlr.sql.dialects.tsql.TSqlParser.SubqueryContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Table_constraintContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Table_hintContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Table_nameContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Waitfor_statementContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleDistanceIndexMatchType;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleMatchType;
import org.sonar.plugins.sql.models.rules.RuleMode;
import org.sonar.plugins.sql.models.rules.RuleResultType;
import org.sonar.plugins.sql.models.rules.SqlRules;
import org.sonar.plugins.sql.models.rules.TextCheckType;

public enum SQLDialectRules {
	INSTANCE;

	public List<SqlRules> getRules() {
		List<SqlRules> rules = new ArrayList<>();
		{
			SqlRules customRules = new SqlRules();
			customRules.setRepoKey("SQLCC");
			customRules.setRepoName("SQL Plugin checks");
			customRules.setDialect("tsql");
			customRules.getRule()
					.addAll(Arrays.asList(getWaitForRule(), getSelectAllRule(), getInsertRule(), getOrderByRule(),
							getExecRule(), getNoLockRule(), getSargRule(), getPKRule(), getFKRule(),
							getNullComparisonRule(), getIndexNamingRule(), getWhereWithOrVsUnionRule(),
							getUnionVsUnionALLRule(), getExistsVsInRule(), getOrderByRuleWithoutAscDesc()));
			rules.add(customRules);
		}
		{
			SqlRules customRules = new SqlRules();
			customRules.setRepoKey("SQLCC");
			customRules.setRepoName("SQL Plugin checks");
			customRules.setDialect("mysql");
			customRules.getRule()
					.addAll(Arrays.asList(getWaitForRuleMySql(), getSelectAllRuleMySql(), getInsertRuleMySql(), getOrderByRuleMySql(),
							 getSargRuleMySql(), /*getPKRule(), getFKRule(),*/
							 getNullComparisonRuleMySql(),/* getIndexNamingRule(),*/ getWhereWithOrVsUnionRuleMySql(),
							getUnionVsUnionALLRuleMySQL(), getExistsVsInRuleMySql(), getOrderByRuleWithoutAscDesc()));
			rules.add(customRules);

		}
		{
			SqlRules customRules = new SqlRules();
			customRules.setRepoKey("SQLCC");
			customRules.setRepoName("SQL Plugin checks");
			customRules.setDialect("pssql");
			customRules.getRule()
					.addAll(Arrays.asList(getWaitForRulePsSQL(), getSelectAllRule(), /*getInsertRule(),*/ getOrderByRule(),
							getExecRule(), getNoLockRule(), getSargRule(), getPKRule(), getFKRule(),
							getNullComparisonRule(), getIndexNamingRule(), getWhereWithOrVsUnionRule(),
							getUnionVsUnionALLRule(), getExistsVsInRule(), getOrderByRuleWithoutAscDesc()));
	//		rules.add(customRules);

		}
		return rules;
	}

	public static Rule getWaitForRule() {
		Rule rule = new Rule();
		rule.setKey("C001");
		rule.setInternalKey("C001");
		rule.setDescription("SLEEP/WAITFOR is used.");
		rule.setDescription("SLEEP/WAITFOR is used");
		rule.setTag("performance");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("2min");
		RuleImplementation impl = new RuleImplementation();
		impl.getNames().getTextItem().add(Waitfor_statementContext.class.getSimpleName());

		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		impl.setRuleViolationMessage("WAITFOR is used.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("WAITFOR '10:00:00';");

		rule.setRuleImplementation(impl);
		return rule;
	}
	public static Rule getWaitForRulePsSQL() {
		Rule rule = new Rule();
		rule.setKey("C001");
		rule.setInternalKey("C001");
		rule.setDescription("SLEEP/WAITFOR is used.");
		rule.setDescription("SLEEP/WAITFOR is used");
		rule.setTag("performance");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("2min");
		RuleImplementation impl = new RuleImplementation();
		impl.getNames().getTextItem().add(Func_callContext.class.getSimpleName());
impl.getTextToFind().getTextItem().add("pg_sleep");
		impl.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		impl.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		impl.setRuleViolationMessage("WAITFOR is used.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("select pg_sleep(5); ");

		rule.setRuleImplementation(impl);
		return rule;
	}
	public static Rule getWaitForRuleMySql() {
		Rule rule = new Rule();
		rule.setKey("C001");
		rule.setInternalKey("C001");
		rule.setDescription("SLEEP/WAITFOR is used.");
		rule.setName("SLEEP/WAITFOR is used");
		rule.setTag("performance");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("2min");
		RuleImplementation impl = new RuleImplementation();
		impl.getNames().getTextItem().add(ScalarFunctionNameContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		impl.setRuleViolationMessage("SLEEP is used.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT SLEEP(10);");

		rule.setRuleImplementation(impl);
		return rule;
	}
	public static Rule getSelectAllRule() {
		Rule rule = new Rule();
		rule.setKey("C002");
		rule.setInternalKey("C002");
		rule.setName("SELECT * is used");
		rule.setDescription("<h2>Description</h2><p>SELECT * is used. Please list names.</p>");
		rule.setTag("design");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("2min");
		RuleImplementation impl = new RuleImplementation();

		impl.getNames().getTextItem().add(Select_list_elemContext.class.getSimpleName());
		impl.getNames().getTextItem().add(Selector_clauseContext.class.getSimpleName());
		//
		impl.getTextToFind().getTextItem().add("*");
		impl.setRuleViolationMessage("SELECT * was used. Consider listing column names.");
		impl.setTextCheckType(TextCheckType.STRICT);
		impl.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		impl.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT name, surname from dbo.test;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT name, surname, 1 * 3 from dbo.test;");
		rule.setRuleImplementation(impl);

		return rule;
	}
	public static Rule getSelectAllRuleMySql() {
		Rule rule = new Rule();
		rule.setKey("C002");
		rule.setInternalKey("C002");
		rule.setName("SELECT * is used");
		rule.setDescription("<h2>Description</h2><p>SELECT * is used. Please list names.</p>");
		rule.setTag("design");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("2min");
		RuleImplementation impl = new RuleImplementation();

		impl.getNames().getTextItem().add(SelectElementsContext.class.getSimpleName());
		impl.getTextToFind().getTextItem().add("*");
		impl.setRuleViolationMessage("SELECT * was used. Consider listing column names.");
		impl.setTextCheckType(TextCheckType.STRICT);
		impl.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		impl.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT name, surname from dbo.test;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT name, surname, 1 * 3 from dbo.test;");
		rule.setRuleImplementation(impl);

		return rule;
	}
	//UidListContext
	public static Rule getInsertRule() {
		Rule rule = new Rule();
		rule.setKey("C003");
		rule.setInternalKey("C003");
		rule.setName("INSERT statement without columns listed");
		rule.setDescription(
				"<h2>Description</h2><p>INSERT statement does not have columns listed. Always use a column list in your INSERT statements.</p>");
		rule.setTag("design");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("2min");
		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(Column_name_listContext.class.getSimpleName());
		child2.setTextCheckType(TextCheckType.DEFAULT);
		child2.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		child2.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		RuleImplementation impl = new RuleImplementation();

		impl.getChildrenRules().getRuleImplementation().add(child2);
		impl.getNames().getTextItem().add(Insert_statementContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);
		impl.setRuleViolationMessage("Column list is not specified in an INSERT statement.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("INSERT INTO dbo.test VALUES (1,2);");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("INSERT INTO dbo.test (a,b) VALUES (1,2);");

		rule.setRuleImplementation(impl);

		return rule;
	}
	public static Rule getInsertRuleMySql() {
		Rule rule = new Rule();
		rule.setKey("C003");
		rule.setInternalKey("C003");
		rule.setName("INSERT statement without columns listed");
		rule.setDescription(
				"<h2>Description</h2><p>INSERT statement does not have columns listed. Always use a column list in your INSERT statements.</p>");
		rule.setTag("design");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("2min");
		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(UidListContext.class.getSimpleName());
		child2.setTextCheckType(TextCheckType.DEFAULT);
		child2.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		child2.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		RuleImplementation impl = new RuleImplementation();

		impl.getChildrenRules().getRuleImplementation().add(child2);
		impl.getNames().getTextItem().add(InsertStatementContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);
		impl.setRuleViolationMessage("Column list is not specified in an INSERT statement.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("INSERT INTO dbo.test VALUES (1,2);");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("INSERT INTO dbo.test (a,b) VALUES (1,2);");

		rule.setRuleImplementation(impl);

		return rule;
	}

	public static Rule getOrderByRule() {
		Rule rule = new Rule();
		rule.setKey("C004");
		rule.setInternalKey("C004");
		rule.setName("ORDER BY clause contains positional references");
		rule.setDescription(
				"<h2>Description</h2><p>Do not use column numbers in the ORDER BY clause. Always use column names in an order by clause. Avoid positional references.</p>");
		rule.setTag("design");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("2min");
		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(ConstantContext.class.getSimpleName());
		child2.setTextCheckType(TextCheckType.DEFAULT);
		child2.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		child2.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		RuleImplementation impl = new RuleImplementation();

		impl.getChildrenRules().getRuleImplementation().add(child2);
		impl.getNames().getTextItem().add(Order_by_clauseContext.class.getSimpleName());
		
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);
		impl.setRuleViolationMessage("Positional reference is used instead of column name in an ORDER BY clause.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test order by 1, 2;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test order by name;");

		rule.setRuleImplementation(impl);
		return rule;
	}
	
	public static Rule getOrderByRulePSSQL() {
		Rule rule = new Rule();
		rule.setKey("C004");
		rule.setInternalKey("C004");
		rule.setName("ORDER BY clause contains positional references");
		rule.setDescription(
				"<h2>Description</h2><p>Do not use column numbers in the ORDER BY clause. Always use column names in an order by clause. Avoid positional references.</p>");
		rule.setTag("design");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("2min");
		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(ConstantContext.class.getSimpleName());
		child2.setTextCheckType(TextCheckType.DEFAULT);
		child2.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		child2.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		RuleImplementation impl = new RuleImplementation();

		impl.getChildrenRules().getRuleImplementation().add(child2);
		impl.getNames().getTextItem().add(Order_by_clauseContext.class.getSimpleName());
		
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);
		impl.setRuleViolationMessage("Positional reference is used instead of column name in an ORDER BY clause.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test order by 1;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test order by name;");

		rule.setRuleImplementation(impl);
		return rule;
	}
	public static Rule getOrderByRuleMySql() {
		Rule rule = new Rule();
		rule.setKey("C004");
		rule.setInternalKey("C004");
		rule.setName("ORDER BY clause contains positional references");
		rule.setDescription(
				"<h2>Description</h2><p>Do not use column numbers in the ORDER BY clause. Always use column names in an order by clause. Avoid positional references.</p>");
		rule.setTag("design");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("2min");
		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(org.antlr.sql.dialects.mysql.MySqlParser.ConstantContext.class.getSimpleName());
		child2.setTextCheckType(TextCheckType.DEFAULT);
		child2.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		child2.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		RuleImplementation impl = new RuleImplementation();

		impl.getChildrenRules().getRuleImplementation().add(child2);
		impl.getNames().getTextItem().add(OrderByClauseContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);
		impl.setRuleViolationMessage("Positional reference is used instead of column name in an ORDER BY clause.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test order by 1;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test order by name;");

		rule.setRuleImplementation(impl);
		return rule;
	}

	public static Rule getExecRule() {
		Rule rule = new Rule();
		rule.setKey("C005");
		rule.setInternalKey("C005");
		rule.setName("EXECUTE/EXEC for dynamic query is used");
		rule.setDescription(".");
		rule.setDescription(
				"<h2>Description</h2><p>EXECUTE/EXEC for dynamic query was used. It is better to use sp_executesql for dynamic queries.</p>");
		rule.setTag("best-practise");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("2min");
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

		RuleImplementation impl = new RuleImplementation();
		impl.getChildrenRules().getRuleImplementation().add(child2);
		impl.getChildrenRules().getRuleImplementation().add(skipSubRule);
		impl.getNames().getTextItem().add(Execute_statementContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("EXEC ('SELECT 1');");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("EXEC (@sQueryText);");
		impl.setRuleViolationMessage(
				"EXECUTE/EXEC for dynamic query is used. It is better to use sp_executesql for dynamic queries.");

		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("EXECUTE sp_executesql N'select 1';");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("exec sys.sp_test  @test = 'Publisher';");

		rule.setRuleImplementation(impl);

		return rule;
	}

	public static Rule getSchemaRule() {
		Rule rule = new Rule();
		rule.setKey("C006");
		rule.setInternalKey("C006");
		rule.setName("Non schema qualified object name");
		rule.setDescription(
				"<h2>Description</h2><p>Always use schema-qualified object names to speed up resolution and improve query plan reuse.</p>");

		RuleImplementation parentQuery = new RuleImplementation();
		parentQuery.getNames().getTextItem().add(Query_expressionContext.class.getSimpleName());
		parentQuery.setRuleResultType(RuleResultType.DEFAULT);
		parentQuery.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		parentQuery.setRuleViolationMessage("TEST");

		RuleImplementation parentTableQuery = new RuleImplementation();
		parentTableQuery.getNames().getTextItem().add(Table_nameContext.class.getSimpleName());
		parentTableQuery.setRuleResultType(RuleResultType.DEFAULT);
		parentTableQuery.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		parentTableQuery.setRuleViolationMessage("parentTableQuery");

		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(Simple_idContext.class.getSimpleName());
		child2.setTextCheckType(TextCheckType.DEFAULT);
		child2.setRuleResultType(RuleResultType.FAIL_IF_LESS_FOUND);
		child2.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		child2.setTimes(2);
		child2.setRuleViolationMessage("Always use schema-qualified object names");

		parentTableQuery.getChildrenRules().getRuleImplementation().add(child2);
		parentQuery.getChildrenRules().getRuleImplementation().add(parentTableQuery);
		RuleImplementation impl = new RuleImplementation();

		impl.getParentRules().getRuleImplementation().add(parentQuery);
		impl.getNames().getTextItem().add(Table_nameContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);
		impl.setRuleViolationMessage("Always use schema-qualified object names");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT * from test order by 1;");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT OrderID, OrderDate FROM Orders");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test order by name;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT * from main.dbo.test order by name;");
		// impl.getCompliantRulesCodeExamples().getRuleCodeExample()
		// .add("with cte as(select a, b,c from dbo.test)\r\nSELECT a from cte;
		// select * from test.dbo");

		rule.setRuleImplementation(impl);
		rule.setSource("http://sqlmag.com/t-sql/t-sql-best-practices-part-1");
		return rule;
	}

	public static Rule getNoLockRule() {
		Rule rule = new Rule();
		rule.setKey("C007");
		rule.setInternalKey("C007");
		rule.setName("NOLOCK hint used");
		rule.setDescription("<h2>Description</h2><p>Use of NOLOCK might cause data inconsistency problems.</p>");
		rule.setTag("reliability");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("2min");
		RuleImplementation impl = new RuleImplementation();

		impl.getTextToFind().getTextItem().add("NOLOCK");
		impl.setTextCheckType(TextCheckType.CONTAINS);
		impl.getNames().getTextItem().add(Table_hintContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		impl.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		impl.setRuleViolationMessage("NOLOCK hint is used.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname from dbo.test WITH (NOLOCK);");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT name, surname from dbo.test;");
		rule.setSource("http://sqlmag.com/t-sql/t-sql-best-practices-part-1");
		rule.setRuleImplementation(impl);

		return rule;
	}

	public static Rule getCursorRule() {
		Rule rule = new Rule();
		rule.setKey("C006");
		rule.setInternalKey("C006");
		rule.setName("Cursor lifecycle is violated");
		rule.setDescription("Cursor lifecycle is violated. Cursor either is not opened, deallocated or closed.");

		RuleImplementation impl = new RuleImplementation();

		impl.getNames().getTextItem().add(Cursor_nameContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.DEFAULT);
		impl.setRuleResultType(RuleResultType.DEFAULT);
		impl.setRuleMode(RuleMode.GROUP);
		rule.setRuleImplementation(impl);

		RuleImplementation child = new RuleImplementation();
		child.getNames().getTextItem().add(Cursor_statementContext.class.getSimpleName());
		child.getTextToFind().getTextItem().add("OPEN");
		child.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		child.setRuleMatchType(RuleMatchType.FULL);
		child.setRuleViolationMessage("Cursor was not opened.");

		RuleImplementation childClose = new RuleImplementation();
		childClose.getNames().getTextItem().add(Cursor_statementContext.class.getSimpleName());
		childClose.getTextToFind().getTextItem().add("CLOSE");
		childClose.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		childClose.setRuleMatchType(RuleMatchType.FULL);
		childClose.setRuleViolationMessage("Cursor was not closed.");

		RuleImplementation childDeallocate = new RuleImplementation();
		childDeallocate.getNames().getTextItem().add(Cursor_statementContext.class.getSimpleName());
		childDeallocate.getTextToFind().getTextItem().add("DEALLOCATE");
		childDeallocate.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		childDeallocate.setRuleMatchType(RuleMatchType.FULL);
		childDeallocate.setRuleViolationMessage("Cursor was not deallocated.");

		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(Cursor_statementContext.class.getSimpleName());
		child2.getTextToFind().getTextItem().add("DECLARE");
		child2.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		child2.setRuleMatchType(RuleMatchType.FULL);
		child2.setRuleViolationMessage("Cursor was not declared.");

		impl.getUsesRules().getRuleImplementation().add(child);
		impl.getUsesRules().getRuleImplementation().add(child2);
		impl.getUsesRules().getRuleImplementation().add(childClose);
		impl.getUsesRules().getRuleImplementation().add(childDeallocate);

		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add(
				"DECLARE vend_cursor CURSOR      FOR SELECT * FROM Purchasing.Vendor; OPEN vend_cursor; FETCH NEXT FROM vend_cursor; SELECT * FROM Purchasing.Vendor; DEALLOCATE vendor_cursor; ");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add(
				"DECLARE vend_cursor CURSOR      FOR SELECT * FROM Purchasing.Vendor; OPEN vend_cursor; FETCH NEXT FROM vend_cursor; SELECT * FROM Purchasing.Vendor; CLOSE vend_cursor; DEALLOCATE vend_cursor; ");

		return rule;
	}

	public static Rule getMultipleDeclarations() {
		Rule rule = new Rule();
		rule.setKey("C007");
		rule.setInternalKey("C007");
		rule.setName("Multiple cursor declarations found");
		rule.setDescription("Multiple cursor declarations found");

		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(Cursor_statementContext.class.getSimpleName());
		child2.getTextToFind().getTextItem().add("DECLARE");
		child2.setRuleResultType(RuleResultType.FAIL_IF_MORE_FOUND);
		child2.setTimes(1);
		child2.setRuleMatchType(RuleMatchType.FULL);
		child2.setRuleViolationMessage("Cursor with same name was declared multiple times.");

		RuleImplementation parent = new RuleImplementation();
		parent.getNames().getTextItem().add(Cursor_nameContext.class.getSimpleName());
		parent.setTextCheckType(TextCheckType.DEFAULT);
		parent.setRuleResultType(RuleResultType.DEFAULT);
		parent.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		parent.setRuleMode(RuleMode.GROUP);

		parent.getUsesRules().getRuleImplementation().add(child2);
		parent.getViolatingRulesCodeExamples().getRuleCodeExample().add(
				"DECLARE vend_cursor CURSOR      FOR SELECT * FROM Purchasing.Vendor;DECLARE vend_cursor CURSOR      FOR SELECT * FROM Purchasing.Vendor; OPEN vend_cursor; BEGIN FETCH NEXT FROM vend_cursor; END SELECT * FROM Purchasing.Vendor; BEGIN CLOSE vend_cursor; END DEALLOCATE vend_cursor; ");
		parent.getCompliantRulesCodeExamples().getRuleCodeExample().add(
				"DECLARE vend_cursor CURSOR      FOR SELECT * FROM Purchasing.Vendor; OPEN vend_cursor; FETCH NEXT FROM vend_cursor; SELECT * FROM Purchasing.Vendor; CLOSE vend_cursor; DEALLOCATE vend_cursor; ");

		rule.setRuleImplementation(parent);

		return rule;
	}

	public static Rule getSameFlow() {
		Rule rule = new Rule();
		rule.setKey("C008");
		rule.setInternalKey("C008");
		rule.setName("Cursor was closed in a different control statement");
		rule.setDescription("Cursor was closed or deallocated in a different control statement than declared.");

		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(Cursor_statementContext.class.getSimpleName());
		child2.getTextToFind().getTextItem().add("CLOSE");
		child2.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		child2.setRuleMatchType(RuleMatchType.STRICT);
		child2.setRuleViolationMessage("Cursor was closed in a different control statement.");

		RuleImplementation child3 = new RuleImplementation();
		child3.getNames().getTextItem().add(Cursor_statementContext.class.getSimpleName());
		child3.getTextToFind().getTextItem().add("DEALLOCATE");
		child3.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		child3.setRuleMatchType(RuleMatchType.STRICT);
		child3.setRuleViolationMessage("Cursor was deallocated in a different control statement.");

		RuleImplementation parent0 = new RuleImplementation();
		parent0.getNames().getTextItem().add(Declare_cursorContext.class.getSimpleName());
		parent0.setRuleResultType(RuleResultType.DEFAULT);
		parent0.setRuleMatchType(RuleMatchType.FULL);

		RuleImplementation parent = new RuleImplementation();
		parent.getNames().getTextItem().add(Cursor_nameContext.class.getSimpleName());
		parent.setTextCheckType(TextCheckType.DEFAULT);
		parent.setRuleResultType(RuleResultType.DEFAULT);
		parent.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		parent.setRuleMode(RuleMode.GROUP);

		parent.getUsesRules().getRuleImplementation().add(child2);
		parent.getUsesRules().getRuleImplementation().add(child3);

		parent.getUsesRules().getRuleImplementation().add(parent0);
		parent.getViolatingRulesCodeExamples().getRuleCodeExample().add(
				"DECLARE vend_cursor CURSOR      FOR SELECT * FROM Purchasing.Vendor; OPEN vend_cursor; BEGIN FETCH NEXT FROM vend_cursor; END SELECT * FROM Purchasing.Vendor; BEGIN CLOSE vend_cursor; END DEALLOCATE vend_cursor; ");
		parent.getCompliantRulesCodeExamples().getRuleCodeExample().add(
				"DECLARE vend_cursor CURSOR      FOR SELECT * FROM Purchasing.Vendor; OPEN vend_cursor; FETCH NEXT FROM vend_cursor; SELECT * FROM Purchasing.Vendor; CLOSE vend_cursor; DEALLOCATE vend_cursor; ");

		rule.setRuleImplementation(parent);

		return rule;
	}

	public static Rule getPKRule() {
		RuleImplementation ruleImpl = new RuleImplementation();
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
		// ruleImpl.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);

		RuleImplementation main = new RuleImplementation();
		main.getNames().getTextItem().add(IdContext.class.getSimpleName());
		main.setTextCheckType(TextCheckType.CONTAINS);
		main.getTextToFind().getTextItem().add("PK_");
		main.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		main.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		main.setRuleViolationMessage("Primary key is not defined using suggested naming convention to start with PK_.");
		main.setDistanceCheckType(RuleDistanceIndexMatchType.EQUALS);

		ruleImpl.getChildrenRules().getRuleImplementation().add(main);
		ruleImpl.getViolatingRulesCodeExamples().getRuleCodeExample().add(
				"CREATE TABLE dbo.Orders\r\n(\r\nId int NOT NULL,\r\nCONSTRAINT OrderID PRIMARY KEY CLUSTERED (Id) \r\n);  ");
		ruleImpl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("ALTER TABLE dbo.Orders ADD CONSTRAINT PK_OrderId PRIMARY KEY CLUSTERED (Id);");
		ruleImpl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("CREATE TABLE dbo.Orders\r\n(\r\nId int NOT NULL,  \r\nPRIMARY KEY (Id)\r\n);  ");

		Rule rule = new Rule();
		rule.setKey("C010");
		rule.setInternalKey("C010");
		rule.setStatus("BETA");
		rule.setName("Defined primary key is not using recommended naming convention");
		rule.setDescription(
				"<h2>Description</h2><p>Defined primary key is not using recommended naming convention to start with PK_.</p>");
		rule.setTag("naming");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("3min");
		rule.setRuleImplementation(ruleImpl);

		return rule;
	}

	public static Rule getFKRule() {
		RuleImplementation ruleImpl = new RuleImplementation();
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
		ruleImpl.getViolatingRulesCodeExamples().getRuleCodeExample().add(
				"ALTER TABLE dbo.Orders ADD CONSTRAINT ClientId FOREIGN KEY (ClientId) REFERENCES dbo.Clients(Id);  ");
		ruleImpl.getCompliantRulesCodeExamples().getRuleCodeExample().add(
				"ALTER TABLE dbo.Orders ADD CONSTRAINT FK_ClientId FOREIGN KEY (ClientId) REFERENCES dbo.Clients(Id); ");

		Rule rule = new Rule();
		rule.setKey("C011");
		rule.setInternalKey("C011");
		rule.setStatus("BETA");
		rule.setName("Defined foreign key is not using recommended naming convention");
		rule.setDescription(
				"<h2>Description</h2><p>Defined foreign key is not using recommended naming convention to start with FK_.</p>");
		rule.setTag("naming");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("3min");
		rule.setRuleImplementation(ruleImpl);

		return rule;
	}

	// Search_conditionContext
	public static Rule getIndexNamingRule() {
		RuleImplementation ruleImpl = new RuleImplementation();
		ruleImpl.getNames().getTextItem().add(Create_indexContext.class.getSimpleName());
		ruleImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		RuleImplementation child1 = new RuleImplementation();
		child1.getTextToFind().getTextItem().add("INDEX");
		child1.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());
		child1.setRuleResultType(RuleResultType.SKIP_IF_NOT_FOUND);
		child1.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);

		ruleImpl.getChildrenRules().getRuleImplementation().add(child1);
		// ruleImpl.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);

		RuleImplementation main = new RuleImplementation();
		main.getNames().getTextItem().add(IdContext.class.getSimpleName());
		main.setTextCheckType(TextCheckType.CONTAINS);
		main.getTextToFind().getTextItem().add("IX_");
		main.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		main.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		main.setRuleViolationMessage("Index name is not defined using suggested naming convention to start with IX_.");
		main.setDistanceCheckType(RuleDistanceIndexMatchType.EQUALS);

		ruleImpl.getChildrenRules().getRuleImplementation().add(main);
		ruleImpl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("CREATE UNIQUE INDEX Test_Name on dbo.test (Name);");
		ruleImpl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("CREATE UNIQUE INDEX IX_Test_Name on dbo.test (Name);");

		Rule rule = new Rule();
		rule.setKey("C013");
		rule.setInternalKey("C013");
		rule.setStatus("BETA");
		rule.setName("Defined index name is not using recommended naming convention");
		rule.setDescription(
				"<h2>Description</h2><p>Defined index name is not using recommended naming convention to start with IX_.</p>");
		rule.setTag("naming");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("3min");
		rule.setRuleImplementation(ruleImpl);

		return rule;
	}

	public static Rule getNullComparisonRule() {
		Rule r = new Rule();
		r.setKey("C012");
		r.setInternalKey("C012");
		r.setDescription(
				"<h2>Description</h2><p>It is not advisable to use comparison operator to check if value is null as comparison operators return UNKNOWN when either or both arguments are NULL. Please use IS NULL or IS NOT NULL instead.</p>");
		r.setSeverity("MAJOR");
		r.setTag("reliability");
		r.setRemediationFunction("LINEAR");
		r.setDebtRemediationFunctionCoefficient("3min");
		r.setName("Comparison operator (=, <>, !=) to check if value is null used");
		RuleImplementation rImpl = new RuleImplementation();
		rImpl.getNames().getTextItem().add(PredicateContext.class.getSimpleName());
		rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		rImpl.setRuleViolationMessage(
				"Comparison operator (=, <>, !=) to check if value is null used. Consider using IS NULL/IS NOT NULL.");
		r.setRuleImplementation(rImpl);
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
		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test where name IS NULL;");
		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT * from dbo.test where name IS NOT NULL;");
		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test where name = 'test';");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test where name = null;");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test where name != null;");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test where name <> null;");

		return r;
	}
	public static Rule getNullComparisonRuleMySql() {
		Rule r = new Rule();
		r.setKey("C012");
		r.setInternalKey("C012");
		r.setDescription(
				"<h2>Description</h2><p>It is not advisable to use comparison operator to check if value is null as comparison operators return UNKNOWN when either or both arguments are NULL. Please use IS NULL or IS NOT NULL instead.</p>");
		r.setSeverity("MAJOR");
		r.setTag("reliability");
		r.setRemediationFunction("LINEAR");
		r.setDebtRemediationFunctionCoefficient("3min");
		r.setName("Comparison operator (=, <>, !=) to check if value is null used");
		RuleImplementation rImpl = new RuleImplementation();
		rImpl.getNames().getTextItem().add(PredicateExpressionContext.class.getSimpleName());
		rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		rImpl.setRuleViolationMessage(
				"Comparison operator (=, <>, !=) to check if value is null used. Consider using IS NULL/IS NOT NULL.");
		r.setRuleImplementation(rImpl);
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
		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test where name IS NULL;");
		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT * from dbo.test where name IS NOT NULL;");
		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test where name = 'test';");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test where name = null;");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test where name != null;");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test where name <> null;");

		return r;
	}

	public static Rule getWhereWithOrVsUnionRule() {
		Rule r = new Rule();
		r.setKey("C014");
		r.setInternalKey("C014");
		r.setDescription(
				"<h2>Description</h2><p>It is  advisable to consider using UNION/UNION ALL operator instead of OR verb in the WHERE clause.</p>");
		r.setSeverity("MAJOR");
		r.setTag("performance");
		r.setRemediationFunction("LINEAR");
		r.setDebtRemediationFunctionCoefficient("3min");
		r.setName("OR verb is used in a WHERE clause");
		RuleImplementation rImpl = new RuleImplementation();
		rImpl.getNames().getTextItem().add(Search_conditionContext.class.getSimpleName());
		rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		rImpl.setRuleViolationMessage("Consider using UNION ALL instead of OR in a WHERE clause.");
		r.setRuleImplementation(rImpl);
		RuleImplementation child = new RuleImplementation();
		child.getTextToFind().getTextItem().add("or");
		child.setTextCheckType(TextCheckType.STRICT);
		child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		child.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		child.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());

		rImpl.getChildrenRules().getRuleImplementation().add(child);
		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test where name = 'or' and surname = 'TestOR';");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test where name = 'Test' OR surname = 'Testor';");
		r.setSource("https://dzone.com/articles/sql-handbook-and-best-practices-performance-tuning");
		return r;
	}
	public static Rule getWhereWithOrVsUnionRuleMySql() {
		Rule r = new Rule();
		r.setKey("C014");
		r.setInternalKey("C014");
		r.setDescription(
				"<h2>Description</h2><p>It is  advisable to consider using UNION/UNION ALL operator instead of OR verb in the WHERE clause.</p>");
		r.setSeverity("MAJOR");
		r.setTag("performance");
		r.setRemediationFunction("LINEAR");
		r.setDebtRemediationFunctionCoefficient("3min");
		r.setName("OR verb is used in a WHERE clause");
		RuleImplementation rImpl = new RuleImplementation();
		rImpl.getNames().getTextItem().add(LogicalExpressionContext.class.getSimpleName());
		rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		rImpl.setRuleViolationMessage("Consider using UNION ALL instead of OR in a WHERE clause.");
		r.setRuleImplementation(rImpl);
		RuleImplementation child = new RuleImplementation();
		child.getTextToFind().getTextItem().add("or");
		child.setTextCheckType(TextCheckType.STRICT);
		child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		child.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		child.getNames().getTextItem().add(LogicalOperatorContext.class.getSimpleName());

		rImpl.getChildrenRules().getRuleImplementation().add(child);
		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test where name = 'or' and surname = 'TestOR';");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test where name = 'Test' OR surname = 'Testor';");
		r.setSource("https://dzone.com/articles/sql-handbook-and-best-practices-performance-tuning");
		return r;
	}

	public static Rule getUnionVsUnionALLRule() {
		Rule r = new Rule();
		r.setKey("C015");
		r.setInternalKey("C015");
		r.setDescription(
				"<h2>Description</h2><p>It is  advisable to consider using UNION ALL operator instead of UNION.</p>");
		r.setSeverity("MAJOR");
		r.setTag("performance");
		r.setRemediationFunction("LINEAR");
		r.setDebtRemediationFunctionCoefficient("3min");
		r.setName("UNION operator is used");

		RuleImplementation rImpl = new RuleImplementation();
		rImpl.getNames().getTextItem().add(Sql_unionContext.class.getSimpleName());
		rImpl.setRuleViolationMessage(
				"Consider using UNION ALL instead of UNION operator for the performance reasons.");
		rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		r.setRuleImplementation(rImpl);
		RuleImplementation child = new RuleImplementation();
		child.getTextToFind().getTextItem().add("all");
		child.setTextCheckType(TextCheckType.STRICT);
		child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		child.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		child.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());

		rImpl.getChildrenRules().getRuleImplementation().add(child);
		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test union all SELECT name, surname, count from dbo.test2;");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test union SELECT name, surname, count from dbo.test2;");
		r.setSource("https://dzone.com/articles/sql-handbook-and-best-practices-performance-tuning");
		return r;
	}

	
	public static Rule getUnionVsUnionALLRuleMySQL() {
		Rule r = new Rule();
		r.setKey("C015");
		r.setInternalKey("C015");
		r.setDescription(
				"<h2>Description</h2><p>It is  advisable to consider using UNION ALL operator instead of UNION.</p>");
		r.setSeverity("MAJOR");
		r.setTag("performance");
		r.setRemediationFunction("LINEAR");
		r.setDebtRemediationFunctionCoefficient("3min");
		r.setName("UNION operator is used");

		RuleImplementation rImpl = new RuleImplementation();
		rImpl.getNames().getTextItem().add(UnionStatementContext.class.getSimpleName());
		rImpl.setRuleViolationMessage(
				"Consider using UNION ALL instead of UNION operator for the performance reasons.");
		rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		r.setRuleImplementation(rImpl);
		RuleImplementation child = new RuleImplementation();
		child.getTextToFind().getTextItem().add("all");
		child.setTextCheckType(TextCheckType.STRICT);
		child.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		child.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		child.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());

		rImpl.getChildrenRules().getRuleImplementation().add(child);
		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test union all SELECT name, surname, count from dbo.test2;");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test union SELECT name, surname, count from dbo.test2;");
		r.setSource("https://dzone.com/articles/sql-handbook-and-best-practices-performance-tuning");
		return r;
	}

	public static Rule getExistsVsInRule() {
		Rule r = new Rule();
		r.setKey("C016");
		r.setInternalKey("C016");
		r.setDescription(
				"<h2>Description</h2><p>Consider using EXISTS/NOT EXISTS operator instead of IN for a subquery.</p>");
		r.setSeverity("MAJOR");
		r.setTag("performance");
		r.setRemediationFunction("LINEAR");
		r.setDebtRemediationFunctionCoefficient("5min");
		r.setName("IN/NOT IN is used for a subquery");
		RuleImplementation rImpl = new RuleImplementation();
		rImpl.getNames().getTextItem().add(PredicateContext.class.getSimpleName());
		rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		rImpl.setRuleViolationMessage("Consider using EXISTS/NOT EXISTS instead of IN/NOT IN in a clause.");
		r.setRuleImplementation(rImpl);

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
		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test where locationID in (1,2,3);");
		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test where locationID not in (1,2,3);");

		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample().add(
				"SELECT name, surname, count from dbo.test where exists (select 1 from dbo.locations where id = locationID);");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test where locationID in (select id from dbo.locations);");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample().add(
				"SELECT name, surname, count from dbo.test where locationID not in (select id from dbo.locations);");

		r.setSource("https://dzone.com/articles/sql-handbook-and-best-practices-performance-tuning");
		return r;
	}

	
	public static Rule getExistsVsInRuleMySql() {
		Rule r = new Rule();
		r.setKey("C016");
		r.setInternalKey("C016");
		r.setDescription(
				"<h2>Description</h2><p>Consider using EXISTS/NOT EXISTS operator instead of IN for a subquery.</p>");
		r.setSeverity("MAJOR");
		r.setTag("performance");
		r.setRemediationFunction("LINEAR");
		r.setDebtRemediationFunctionCoefficient("5min");
		r.setName("IN/NOT IN is used for a subquery");
		RuleImplementation rImpl = new RuleImplementation();
		rImpl.getNames().getTextItem().add(PredicateExpressionContext.class.getSimpleName());
		rImpl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		rImpl.setRuleViolationMessage("Consider using EXISTS/NOT EXISTS instead of IN/NOT IN in a clause.");
		r.setRuleImplementation(rImpl);

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
		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test where locationID in (1,2,3);");
		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test where locationID not in (1,2,3);");

		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample().add(
				"SELECT name, surname, count from dbo.test where exists (select 1 from dbo.locations where id = locationID);");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test where locationID in (select id from dbo.locations);");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample().add(
				"SELECT name, surname, count from dbo.test where locationID not in (select id from dbo.locations);");

		r.setSource("https://dzone.com/articles/sql-handbook-and-best-practices-performance-tuning");
		return r;
	}

	public static Rule getOrderByRuleWithoutAscDesc() {
		Rule rule = new Rule();
		rule.setKey("C017");
		rule.setInternalKey("C017");
		rule.setName("ORDER BY clause does not contain order (ASC/DESC)");
		rule.setDescription("<h2>Description</h2><p>It is advisable to specidy order how rows should be ordered.</p>");
		rule.setTag("understanding");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("1min");
		RuleImplementation child2 = new RuleImplementation();
		child2.getNames().getTextItem().add(TerminalNodeImpl.class.getSimpleName());
		child2.getTextToFind().getTextItem().add("asc");
		child2.getTextToFind().getTextItem().add("desc");
		child2.setTextCheckType(TextCheckType.STRICT);
		child2.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		child2.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);

		RuleImplementation impl = new RuleImplementation();

		impl.getChildrenRules().getRuleImplementation().add(child2);
		impl.getNames().getTextItem().add(Order_by_expressionContext.class.getSimpleName());
		impl.getNames().getTextItem().add(OrderByExpressionContext.class.getSimpleName());

		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);
		impl.setRuleViolationMessage("No ASC/DESC order defined in an ORDER BY clause.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname from dbo.test order by name, surname asc;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname from dbo.test order by name desc, surname asc;");

		rule.setRuleImplementation(impl);
		return rule;
	}

	public static Rule getFileTooLargeRule() {
		Rule rule = new Rule();
		rule.setKey("C018");
		rule.setInternalKey("C018");
		rule.setName("File too large");
		rule.setDescription("<h2>Description</h2><p>File is too large. Consider splitting it..</p>");
		rule.setTag("understanding");
		rule.setSeverity("MAJOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("10min");
		return rule;

	}

	public static Rule getSargRule() {
		Rule rule = new Rule();
		rule.setKey("C009");
		rule.setInternalKey("C009");
		rule.setStatus("BETA");
		rule.setName("Non-sargable statement used");
		rule.setDescription(
				"<h2>Description</h2><p>Use of non-sargeable arguments might cause performance problems.</p>");
		rule.setTag("performance");
		rule.setSeverity("MAJOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("5min");
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

		RuleImplementation impl = new RuleImplementation();
		impl.getChildrenRules().getRuleImplementation().add(ruleFunctionCall);
		impl.getChildrenRules().getRuleImplementation().add(predicateContextContainsLike);
		impl.setRuleViolationMessage("Non-sargeable argument found");
		impl.getNames().getTextItem().add(Search_conditionContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);
		impl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT MAX(RateChangeDate)  FROM HumanResources.EmployeePayHistory WHERE BusinessEntityID = 1");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname from dbo.test where year(date) > 2008");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname from dbo.test where name like '%red' ");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname from dbo.test where date between 2008-10-10 and 2010-10-10;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT max(price) from dbo.items;");

		rule.setSource("http://sqlmag.com/t-sql/t-sql-best-practices-part-1");
		rule.setRuleImplementation(impl);

		return rule;
	}

	public static Rule getSargRuleMySql() {
		Rule rule = new Rule();
		rule.setKey("C009");
		rule.setInternalKey("C009");
		rule.setStatus("BETA");
		rule.setName("Non-sargable statement used");
		rule.setDescription(
				"<h2>Description</h2><p>Use of non-sargeable arguments might cause performance problems.</p>");
		rule.setTag("performance");
		rule.setSeverity("MAJOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("5min");
		RuleImplementation functionCallContainsColRef = new RuleImplementation();
		functionCallContainsColRef.getNames().getTextItem().add(UidContext.class.getSimpleName());
		functionCallContainsColRef.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		functionCallContainsColRef.setRuleResultType(RuleResultType.FAIL_IF_FOUND);
		functionCallContainsColRef
				.setRuleViolationMessage("Non-sargeable argument found - column referenced in a function.");

		RuleImplementation ruleFunctionCall = new RuleImplementation();
		ruleFunctionCall.getNames().getTextItem().add(FunctionCallExpressionAtomContext.class.getSimpleName());
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

		RuleImplementation impl = new RuleImplementation();
		impl.getChildrenRules().getRuleImplementation().add(ruleFunctionCall);
		impl.getChildrenRules().getRuleImplementation().add(predicateContextContainsLike);
		impl.setRuleViolationMessage("Non-sargeable argument found");
		impl.getNames().getTextItem().add(PredicateExpressionContext.class.getSimpleName());
		impl.setRuleMatchType(RuleMatchType.CLASS_ONLY);
		impl.setRuleResultType(RuleResultType.DEFAULT);
		impl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT MAX(RateChangeDate)  FROM HumanResources.EmployeePayHistory WHERE BusinessEntityID = 1");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname from dbo.test where year(date) > 2008");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname from dbo.test where name like '%red' ");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname from dbo.test where date between 2008-10-10 and 2010-10-10;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT max(price) from dbo.items;");

		rule.setSource("http://sqlmag.com/t-sql/t-sql-best-practices-part-1");
		rule.setRuleImplementation(impl);

		return rule;
	}
	public static Rule getDeclareRule() {
		Rule r = new Rule();
		r.setInternalKey("C011");
		r.setKey("C011");
		r.setStatus("BETA");
		r.setName("Variable was declared, but not set");
		r.setDescription("<h2>Description</h2><p>Variable was declared, but not set.</p>");

		RuleImplementation useRule = new RuleImplementation();
		useRule.getNames().getTextItem().add(Set_statementContext.class.getSimpleName());
		useRule.setRuleMatchType(RuleMatchType.FULL);
		useRule.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		useRule.setRuleViolationMessage("Item was not set");

		RuleImplementation parentRule = new RuleImplementation();
		parentRule.getNames().getTextItem().add(Declare_statementContext.class.getSimpleName());
		parentRule.setRuleMatchType(RuleMatchType.FULL);
		parentRule.setRuleResultType(RuleResultType.FAIL_IF_NOT_FOUND);
		parentRule.setRuleViolationMessage("Item was not declared");

		RuleImplementation childRule = new RuleImplementation();
		childRule.getNames().getTextItem().add("Data_typeContext");
		childRule.setRuleMatchType(RuleMatchType.CLASS_ONLY);

		RuleImplementation sibRule = new RuleImplementation();
		sibRule.getNames().getTextItem().add(Primitive_expressionContext.class.getSimpleName());

		sibRule.setRuleResultType(RuleResultType.SKIP_IF_FOUND);
		childRule.getSiblingsRules().getRuleImplementation().add(sibRule);

		parentRule.getChildrenRules().getRuleImplementation().add(childRule);
		RuleImplementation impl = new RuleImplementation();
		impl.getUsesRules().getRuleImplementation().add(useRule);
		impl.getUsesRules().getRuleImplementation().add(parentRule);
		impl.setTextCheckType(TextCheckType.REGEXP);
		impl.getTextToFind().getTextItem().add("@(.*?)");
		impl.getNames().getTextItem().add("TerminalNodeImpl");
		impl.setRuleMatchType(RuleMatchType.TEXT_AND_CLASS);
		impl.setRuleMode(RuleMode.GROUP);
		impl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("DECLARE @Group nvarchar(50); Set @Group = 'test';");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("DECLARE @Group nvarchar(50);");
		impl.setRuleViolationMessage("Variable was declared, but not set");
		r.setRuleImplementation(impl);
		return r;
	}

}
