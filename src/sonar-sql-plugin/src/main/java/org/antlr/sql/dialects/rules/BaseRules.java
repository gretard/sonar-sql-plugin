package org.antlr.sql.dialects.rules;

import org.antlr.sql.dialects.tsql.TSqlParser.Declare_statementContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Primitive_expressionContext;
import org.antlr.sql.dialects.tsql.TSqlParser.Set_statementContext;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleMatchType;
import org.sonar.plugins.sql.models.rules.RuleMode;
import org.sonar.plugins.sql.models.rules.RuleResultType;
import org.sonar.plugins.sql.models.rules.TextCheckType;

public enum BaseRules implements IBaseRules {

	INSTANCE;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getWaitForRule()
	 */
	@Override
	public Rule getWaitForRule() {
		Rule rule = new Rule();
		rule.setKey("C001");
		rule.setInternalKey("C001");
		rule.setName("SLEEP/WAITFOR is used.");
		rule.setDescription("SLEEP/WAITFOR is used");
		rule.setTag("performance");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("2min");
		rule.getRuleImplementation().setRuleViolationMessage("WAIT/SLEEP is used");

		return rule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getSelectAllRule()
	 */
	@Override
	public Rule getSelectAllRule() {
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
		impl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT t1.*, t2.* from dbo.test as t1 inner join dbo.test2 as t2 on t1.id=t2.id;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT name, surname from dbo.test;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT name, surname, 1 * 3 from dbo.test;");
		impl.setRuleViolationMessage("SELECT * was found.");

		rule.setRuleImplementation(impl);

		return rule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getInsertRule()
	 */
	@Override
	public Rule getInsertRule() {
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

		RuleImplementation impl = new RuleImplementation();
		impl.setRuleViolationMessage("Column list is not specified in an INSERT statement.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("INSERT INTO dbo.test VALUES (1,2);");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("INSERT INTO dbo.test (a,b) VALUES (1,2);");

		rule.setRuleImplementation(impl);

		return rule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getOrderByRule()
	 */
	@Override
	public Rule getOrderByRule() {
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
		RuleImplementation impl = new RuleImplementation();
		impl.setRuleViolationMessage("Positional reference is used instead of column name in an ORDER BY clause.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test order by 1, 2;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test order by name;");

		rule.setRuleImplementation(impl);
		return rule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getExecRule()
	 */
	@Override
	public Rule getExecRule() {
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

		RuleImplementation impl = new RuleImplementation();
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("EXEC ('SELECT 1');");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("EXEC (@sQueryText);");
		impl.setRuleViolationMessage(
				"EXECUTE/EXEC for dynamic query is used. It is better to use sp_executesql for dynamic queries.");

		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("EXECUTE sp_executesql N'select 1';");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("exec sys.sp_test  @test = 'Publisher';");

		rule.setRuleImplementation(impl);

		return rule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getSchemaRule()
	 */
	@Override
	public Rule getSchemaRule() {
		Rule rule = new Rule();
		rule.setKey("C006");
		rule.setInternalKey("C006");
		rule.setName("Non schema qualified object name");
		rule.setDescription(
				"<h2>Description</h2><p>Always use schema-qualified object names to speed up resolution and improve query plan reuse.</p>");

		RuleImplementation impl = new RuleImplementation();
		impl.setRuleViolationMessage("Always use schema-qualified object names");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT * from test order by 1;");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add("SELECT OrderID, OrderDate FROM Orders");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT * from dbo.test order by name;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT * from main.dbo.test order by name;");
		rule.setRuleImplementation(impl);
		return rule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getNoLockRule()
	 */
	@Override
	public Rule getNoLockRule() {
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

		impl.setRuleViolationMessage("NOLOCK hint is used.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname from dbo.test WITH (NOLOCK);");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT name, surname from dbo.test;");
		rule.setSource("http://sqlmag.com/t-sql/t-sql-best-practices-part-1");
		rule.setRuleImplementation(impl);

		return rule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getCursorRule()
	 */
	@Override
	public Rule getCursorRule() {
		Rule rule = new Rule();
		rule.setKey("C006");
		rule.setInternalKey("C006");
		rule.setName("Cursor lifecycle is violated");
		rule.setDescription("Cursor lifecycle is violated. Cursor either is not opened, deallocated or closed.");

		RuleImplementation impl = new RuleImplementation();

		rule.setRuleImplementation(impl);

		impl.getViolatingRulesCodeExamples().getRuleCodeExample().add(
				"DECLARE vend_cursor CURSOR      FOR SELECT * FROM Purchasing.Vendor; OPEN vend_cursor; FETCH NEXT FROM vend_cursor; SELECT * FROM Purchasing.Vendor; DEALLOCATE vendor_cursor; ");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add(
				"DECLARE vend_cursor CURSOR      FOR SELECT * FROM Purchasing.Vendor; OPEN vend_cursor; FETCH NEXT FROM vend_cursor; SELECT * FROM Purchasing.Vendor; CLOSE vend_cursor; DEALLOCATE vend_cursor; ");

		return rule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getMultipleDeclarations()
	 */
	@Override
	public Rule getMultipleDeclarations() {
		Rule rule = new Rule();
		rule.setKey("C007");
		rule.setInternalKey("C007");
		rule.setName("Multiple cursor declarations found");
		rule.setDescription("Multiple cursor declarations found");

		RuleImplementation parent = new RuleImplementation();

		parent.getViolatingRulesCodeExamples().getRuleCodeExample().add(
				"DECLARE vend_cursor CURSOR      FOR SELECT * FROM Purchasing.Vendor;DECLARE vend_cursor CURSOR      FOR SELECT * FROM Purchasing.Vendor; OPEN vend_cursor; BEGIN FETCH NEXT FROM vend_cursor; END SELECT * FROM Purchasing.Vendor; BEGIN CLOSE vend_cursor; END DEALLOCATE vend_cursor; ");
		parent.getCompliantRulesCodeExamples().getRuleCodeExample().add(
				"DECLARE vend_cursor CURSOR      FOR SELECT * FROM Purchasing.Vendor; OPEN vend_cursor; FETCH NEXT FROM vend_cursor; SELECT * FROM Purchasing.Vendor; CLOSE vend_cursor; DEALLOCATE vend_cursor; ");

		rule.setRuleImplementation(parent);

		return rule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getSameFlow()
	 */
	@Override
	public Rule getSameFlow() {
		Rule rule = new Rule();
		rule.setKey("C008");
		rule.setInternalKey("C008");
		rule.setName("Cursor was closed in a different control statement");
		rule.setDescription("Cursor was closed or deallocated in a different control statement than declared.");

		RuleImplementation parent = new RuleImplementation();

		parent.getViolatingRulesCodeExamples().getRuleCodeExample().add(
				"DECLARE vend_cursor CURSOR      FOR SELECT * FROM Purchasing.Vendor; OPEN vend_cursor; BEGIN FETCH NEXT FROM vend_cursor; END SELECT * FROM Purchasing.Vendor; BEGIN CLOSE vend_cursor; END DEALLOCATE vend_cursor; ");
		parent.getCompliantRulesCodeExamples().getRuleCodeExample().add(
				"DECLARE vend_cursor CURSOR      FOR SELECT * FROM Purchasing.Vendor; OPEN vend_cursor; FETCH NEXT FROM vend_cursor; SELECT * FROM Purchasing.Vendor; CLOSE vend_cursor; DEALLOCATE vend_cursor; ");

		rule.setRuleImplementation(parent);

		return rule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getPKRule()
	 */
	@Override
	public Rule getPKRule() {
		RuleImplementation ruleImpl = new RuleImplementation();

		ruleImpl.setRuleViolationMessage("Defined primary key is not using recommended naming convention");
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getFKRule()
	 */
	@Override
	public Rule getFKRule() {
		RuleImplementation ruleImpl = new RuleImplementation();

		ruleImpl.getViolatingRulesCodeExamples().getRuleCodeExample().add(
				"ALTER TABLE dbo.Orders ADD CONSTRAINT ClientId FOREIGN KEY (ClientId) REFERENCES dbo.Clients(Id);  ");
		ruleImpl.getCompliantRulesCodeExamples().getRuleCodeExample().add(
				"ALTER TABLE dbo.Orders ADD CONSTRAINT FK_ClientId FOREIGN KEY (ClientId) REFERENCES dbo.Clients(Id); ");
		ruleImpl.setRuleViolationMessage("Defined foreign key is not using recommended naming convention");
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
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getIndexNamingRule()
	 */
	@Override
	public Rule getIndexNamingRule() {
		RuleImplementation ruleImpl = new RuleImplementation();

		ruleImpl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("CREATE UNIQUE INDEX Test_Name on dbo.test (Name);");
		ruleImpl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("CREATE UNIQUE INDEX IX_Test_Name on dbo.test (Name);");
		ruleImpl.setRuleViolationMessage("INDEX is not using recommended naming convention");

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getNullComparisonRule()
	 */
	@Override
	public Rule getNullComparisonRule() {
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

		r.getRuleImplementation().getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT * from dbo.test where name IS NULL;");
		r.getRuleImplementation().getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT * from dbo.test where name IS NOT NULL;");
		r.getRuleImplementation().getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT * from dbo.test where name = 'test';");
		r.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT * from dbo.test where name = null and surname = 'Test' ;");
		r.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT * from dbo.test where name != null;");
		r.getRuleImplementation().getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT * from dbo.test where name <> null;");
		r.getRuleImplementation()
				.setRuleViolationMessage("Comparison operator (=, <>, !=) to check if value is null used");

		return r;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getWhereWithOrVsUnionRule()
	 */
	@Override
	public Rule getWhereWithOrVsUnionRule() {
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
		rImpl.setRuleViolationMessage("Consider using UNION ALL instead of OR in a WHERE clause.");
		r.setRuleImplementation(rImpl);
		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test where name = 'or' and surname = 'TestOR';");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test where name = 'Test' OR surname = 'Testor';");
		r.setSource("https://dzone.com/articles/sql-handbook-and-best-practices-performance-tuning");
		return r;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getUnionVsUnionALLRule()
	 */
	@Override
	public Rule getUnionVsUnionALLRule() {
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
		rImpl.setRuleViolationMessage(
				"Consider using UNION ALL instead of UNION operator for the performance reasons.");

		rImpl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test union all SELECT name, surname, count from dbo.test2;");
		rImpl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test union SELECT name, surname, count from dbo.test2;");
		r.setSource("https://dzone.com/articles/sql-handbook-and-best-practices-performance-tuning");
		r.setRuleImplementation(rImpl);
		return r;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getExistsVsInRule()
	 */
	@Override
	public Rule getExistsVsInRule() {
		Rule rule = new Rule();
		rule.setKey("C016");
		rule.setInternalKey("C016");
		rule.setDescription(
				"<h2>Description</h2><p>Consider using EXISTS/NOT EXISTS operator instead of IN for a subquery.</p>");
		rule.setSeverity("MAJOR");
		rule.setTag("performance");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("5min");
		rule.setName("IN/NOT IN is used for a subquery");

		RuleImplementation ruleImplementation = rule.getRuleImplementation();
		ruleImplementation
				.setRuleViolationMessage("Consider using EXISTS/NOT EXISTS instead of IN/NOT IN in a clause.");

		ruleImplementation.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test where locationID in (1,2,3);");

		ruleImplementation.getCompliantRulesCodeExamples().getRuleCodeExample().add(
				"SELECT name, surname, count from dbo.test where exists (select 1 from dbo.locations where id = locationID);");
		ruleImplementation.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname, count from dbo.test where locationID in (select id from dbo.locations);");

		rule.setSource("https://dzone.com/articles/sql-handbook-and-best-practices-performance-tuning");
		return rule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getOrderByRuleWithoutAscDesc()
	 */
	@Override
	public Rule getOrderByRuleWithoutAscDesc() {
		Rule rule = new Rule();
		rule.setKey("C017");
		rule.setInternalKey("C017");
		rule.setName("ORDER BY clause does not contain order (ASC/DESC)");
		rule.setDescription("<h2>Description</h2><p>It is advisable to specidy order how rows should be ordered.</p>");
		rule.setTag("understanding");
		rule.setSeverity("MINOR");
		rule.setRemediationFunction("LINEAR");
		rule.setDebtRemediationFunctionCoefficient("1min");

		RuleImplementation impl = new RuleImplementation();

		impl.setRuleViolationMessage("No ASC/DESC order defined in an ORDER BY clause.");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname from dbo.test order by name, surname asc;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname from dbo.test order by name desc, surname asc;");

		rule.setRuleImplementation(impl);
		return rule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getFileTooLargeRule()
	 */
	@Override
	public Rule getFileTooLargeRule() {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getSargRule()
	 */
	@Override
	public Rule getSargRule() {
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

		RuleImplementation impl = new RuleImplementation();
		impl.setRuleViolationMessage("Non-sargeable argument found");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT MAX(RateChangeDate)  FROM HumanResources.EmployeePayHistory WHERE BusinessEntityID = 1");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname from dbo.test where year(date) > 2008 and month = 12;");
		impl.getViolatingRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname from dbo.test where name like '%red' ");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample()
				.add("SELECT name, surname from dbo.test where date between 2008-10-10 and 2010-10-10;");
		impl.getCompliantRulesCodeExamples().getRuleCodeExample().add("SELECT max(price) from dbo.items;");

		rule.setSource("http://sqlmag.com/t-sql/t-sql-best-practices-part-1");
		rule.setRuleImplementation(impl);

		return rule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.sql.dialects.rules.IBaseRules#getDeclareRule()
	 */
	@Override
	public Rule getDeclareRule() {
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
