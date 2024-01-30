# Wiki #
## Custom rules ##
Currently, plugin supports ability to match code against custom rules defined in xml files in specific format. Below are the details how to use and create custom rules.


### Usage ###
To get started using custom rules:
- Create an xml file with custom rules defined. There is an [example project](https://github.com/gretard/sonar-sql-plugin/blob/master/examples/6-pssql-with-custom-rules). Each xml file defines a single rule repository. You can try scanning example project first.
- Put custom file into your base directory of the project or you can specify relative/absolute path to the file by setting _sonar.sql.rules.path_ property. You can check _sonar-project.properties_ file for further reference at the [example project](https://github.com/gretard/sonar-sql-plugin/blob/master/examples/6-pssql-with-custom-rules)
- Run sonar scanner

> Please check sections below for information on how custom rules are defined.


### Creating custom rules ###
Custom rules are defined using xml format. Each file should be defining a single repository using format described below. Attributes repoName and repoKey defines repository's name and key used by SonarQube. All keys should be unique.

Mandatory fields for rule:

- key - used to report issues, should be unique among repositories
- name - rule name
- internalKey - used to report issues, should be unique among repositories
- description - rule description
- severity
- ruleType - can be BUG, CODE_SMELL
- ruleImplementation - defines how to detect code against which rules will be applied. There are different options for this item:
	- names - defines a list of SQL parser classes on which rule will be applied. Full list is specified below ([TSQL](https://github.com/gretard/sonar-sql-plugin/blob/master/docs/tsqlClasses.md), [MYSQL](https://github.com/gretard/sonar-sql-plugin/blob/master/docs/mysqlClasses.md), [PSSQL](https://github.com/gretard/sonar-sql-plugin/blob/master/docs/pssqlClasses.md) )
	- textToFind - defines custom text which will be looked for in the applicable nodes
	- parentRules - defines array of rules of type ruleImplementation which will be applied for node's parents 
	- childrenRules - defines array of rules of type ruleImplementation which will be applied for node's children
	- siblingsRules- defines array of rules of type ruleImplementation which will be applied for node's siblings
	- usesRules - defines array of rules of type ruleImplementation which will be applied for node's similar to current node, i.e. contains same cursor name
	- ruleViolationMesssage - contains text shown by SonarQube server
	- times - if ruleResultType is set to FailIfLessFound or FailIfMoreFound then this value is compared against actual number of nodes violating that rule and failing accordingly
	- ruleMode - can be SINGLE or GROUP. If  SINGLE then all nodes matching rule will be treated differently, i.e. for each select statement rule will be applied. If mode is set to GROUP, then plugin will try to group matching nodes and apply rule once, i.e. when searching for cursors with same names.
	- ruleMatchType - defines how plugin will be applying rules, can be:
		- Full - will check if selected node's class matches, contains specified text if any and node contains text which was found for by other rules
		- TextOnly - checks only if node contains specified text in the textToFind section
		- TextAndClass - checks if node contains specified text in the textToFind section and class name matches
		- ClassOnly - checks if class name matches
		- Strict - this options does the Full check and in addition checks if node is in the same control flow as parent node
	- ruleResultType - defines what to do if a particular rule matched code. Available options:
		- Default - does nothing
		- FailIfFound - reports code issue if at least one node was found violating rule
		- FailIfNotFound - reports code issue if no node was found violating rule
		- FailIfLessFound/FailIfMoreFound - reports code issue if rule was not violated less or more times than value defined by times value
		- SkipIfFound/SkipIfNotFound - skips code issue reporting at all if rule was satisfied or not
        - SkipIfLessFound/SkipIfMoreFound - skips code issue reporting at all if rule was matches less or more times than value defined by times value
	- textCheckType - defines how to search for particular text in nodes, can be:
		- Contains - will be checked if node contains some defined text
		- Regexp - will be checked if node's text matches regexp
		- Strict - equals  operator will be used
   - violatingRulesCodeExamples/compliantRulesCodeExamples - can contain examples of compliant and non-compliant code 
   - distance - specifies how far node node should be from parent so that it is selected
   - index - specifies which node to select, if negative - elements is selected in reverse order, for example -1 can be used to select last child element
   - indexCheckType - specifies how to compare node's index, can be:

		- Default - does not nothing
		- More - checks if node's index to parent node is more than expected value
		- Less - checks if node's index to parent node is less than expected value
		- Equals - checks if node's index to parent node is equal to the expected value

   - distanceCheckType - specifies how to compare node's distance, can be:

		- Default - does not nothing
		- More - checks if node's distance to parent node is more than expected value
		- Less - checks if node's distance to parent node is less than expected value
		- Equals - checks if node's distance to parent node is equal to the expected value
    - ruleAppliesTo - can be code or comments
    - ruleReportsOn - can be line or file. If file is selected - then violation will be reported once.

Schema can be found at [/sonar-sql-plugin/src/main/resources/schemas/customRules.xsd](https://github.com/gretard/sonar-sql-plugin/blob/master/src/sonar-sql-plugin/src/main/resources/schemas/customRules.xsd).

Below is an example of an xml file contents with rules:

```
<sql-rules repoName="Demo rules" repoKey="tsqlDemoRepo" isAdhoc="true">
  <rule>
        <key>CC001</key>
        <name>Waitfor is used.</name>
        <internalKey>CC001</internalKey>
        <description>Waitfor is used</description>
        <ruleImplementation>
            <names>
                <textItem>Waitfor_statementContext</textItem>
            </names>
            <textToFind/>
            <parentRules/>
            <childrenRules/>
            <siblingsRules/>
            <usesRules/>
            <ruleViolationMessage>Waitfor is used.</ruleViolationMessage>
            <times>0</times>
            <ruleMode>Single</ruleMode>
            <ruleMatchType>ClassOnly</ruleMatchType>
            <ruleResultType>FailIfFound</ruleResultType>
            <textCheckType>Default</textCheckType>
            <violatingRulesCodeExamples/>
            <compliantRulesCodeExamples/>
        </ruleImplementation>
    </rule>
  <rule>
        <key>CC002</key>
        <name>SELECT * is used</name>
        <internalKey>CC002</internalKey>
        <description>SELECT * is used. Please list names.</description>
        <ruleImplementation>
            <names>
                <textItem>Select_listContext</textItem> 
            </names>
            <textToFind/>
            <parentRules/>
            <childrenRules>
                <ruleImplementation>
                    <names>
                        <textItem>Select_list_elemContext</textItem>
                    </names>
                    <textToFind>
                        <textItem>*</textItem>
                    </textToFind>
                    <parentRules/>
                    <childrenRules/>
                    <siblingsRules/>
                    <usesRules/>
                    <ruleViolationMessage>SELECT * is used</ruleViolationMessage>
                    <times>0</times>
                    <ruleMode>Single</ruleMode>
                    <ruleMatchType>TextAndClass</ruleMatchType>
                    <ruleResultType>FailIfFound</ruleResultType>
                    <textCheckType>Strict</textCheckType>
                    <violatingRulesCodeExamples/>
                    <compliantRulesCodeExamples/>
                </ruleImplementation>
            </childrenRules>
            <siblingsRules/>
            <usesRules/>
            <times>0</times>
            <ruleMode>Single</ruleMode>
            <ruleMatchType>Default</ruleMatchType>
            <ruleResultType>Default</ruleResultType>
            <textCheckType>Default</textCheckType>
            <violatingRulesCodeExamples>
                <ruleCodeExample>SELECT * from dbo.test;</ruleCodeExample>
            </violatingRulesCodeExamples>
            <compliantRulesCodeExamples>
                <ruleCodeExample>SELECT name, surname from dbo.test;</ruleCodeExample>
 <ruleCodeExample>SELECT name, surname, 1 * 3 from dbo.test;</ruleCodeExample>
            </compliantRulesCodeExamples>
        </ruleImplementation>
    </rule>
</sql-rules>
```

To start building custom rules, you can also look into example at  [example file](https://github.com/gretard/sonar-sql-plugin/blob/master/examples/1-tsql/myExampleRepo.customRules).

In addition to this, there is a small command line tool allowing to verify rules [rulesHelper.jar](https://github.com/gretard/sonar-sql-plugin/releases/download/1.0.0/rulesHelper.jar "rulesHelper.jar") against code in the violatingRulesCodeExamples/compliantRulesCodeExamples sections. And also it allows to print tree of parsed SQL code.

Printing tree of *select 1* statement:

```
java -jar rulesHelper.jar print text "select 1"  mysql
```

Checking if rules produces expected results as defined in the compliantRulesCodeExamples/violatingRulesCodeExamples sections:

```
java -jar rulesHelper.jar verify file "c:/sonar/myExampleRepo.customRules" tsql
```

### Simple rule example ###

Below is an example of a custom rule reporting all WAITFOR statements found.

```
    <rule>
        <key>C001</key>
        <name>WAITFOR is used</name>
        <internalKey>C001</internalKey>
        <description>WAITFOR is used.&lt;h2&gt;Code examples&lt;/h2&gt;&lt;h3&gt;Non-compliant&lt;/h3&gt;&lt;pre&gt;&lt;code&gt;WAITFOR '10:00:00';&lt;/code&gt;&lt;/pre&gt;</description>
        <severity>MINOR</severity>
        <remediationFunction>LINEAR</remediationFunction>
        <debtRemediationFunctionCoefficient>2min</debtRemediationFunctionCoefficient>
        <tag>performance</tag>
        <ruleImplementation>
            <names>
                <textItem>Waitfor_statementContext</textItem>
            </names>
            <textToFind/>
            <parentRules/>
            <childrenRules/>
            <siblingsRules/>
            <usesRules/>
            <ruleViolationMessage>WAITFOR is used.</ruleViolationMessage>
            <times>1</times>
            <distance>0</distance>
            <index>0</index>
            <indexCheckType>Default</indexCheckType>
            <distanceCheckType>Default</distanceCheckType>
            <ruleMode>Default</ruleMode>
            <ruleMatchType>ClassOnly</ruleMatchType>
            <ruleResultType>FailIfFound</ruleResultType>
            <textCheckType>Default</textCheckType>
            <violatingRulesCodeExamples>
                <ruleCodeExample>WAITFOR '10:00:00';</ruleCodeExample>
            </violatingRulesCodeExamples>
            <compliantRulesCodeExamples/>
        </ruleImplementation>
    </rule>
```

For example, statement *WAITFOR '10:00:00';* will be parsed as:

```
Tsql_fileContext@0: WAITFOR'10:00:00';<EOF>
	BatchContext@1: WAITFOR'10:00:00';
		Sql_clausesContext@2: WAITFOR'10:00:00';
			Sql_clauseContext@3: WAITFOR'10:00:00';
				Cfl_statementContext@4: WAITFOR'10:00:00';
					Waitfor_statementContext@5: WAITFOR'10:00:00';
						TerminalNodeImpl@6: WAITFOR
						ExpressionContext@6: '10:00:00'
							Primitive_expressionContext@7: '10:00:00'
								ConstantContext@8: '10:00:00'
									TerminalNodeImpl@9: '10:00:00'
						TerminalNodeImpl@6: ;
	TerminalNodeImpl@1: <EOF>
```


How custom rules work:

1. Find all nodes of type *Waitfor_statementContext*
2. As rule mode is set to *SINGLE* and *FailIfFound* - all lines where  node types *Waitfor_statementContext* were found will be reported as violating this rule. 


### Creating more complex custom rules ###

Below is an example of a rule finding issues where select statements contain asterisks.

```
 <rule>
        <key>C002</key>
        <name>SELECT * is used</name>
        <internalKey>C002</internalKey>
        <description>&lt;h2&gt;Description&lt;/h2&gt;&lt;p&gt;SELECT * is used. Please list names.&lt;/p&gt;&lt;h2&gt;Code examples&lt;/h2&gt;&lt;h3&gt;Non-compliant&lt;/h3&gt;&lt;pre&gt;&lt;code&gt;SELECT * from dbo.test;&lt;/code&gt;&lt;/pre&gt;&lt;h3&gt;Compliant&lt;/h3&gt;&lt;pre&gt;&lt;code&gt;SELECT name, surname from dbo.test;&lt;/code&gt;&lt;/pre&gt;&lt;pre&gt;&lt;code&gt;SELECT name, surname, 1 * 3 from dbo.test;&lt;/code&gt;&lt;/pre&gt;</description>
        <severity>MINOR</severity>
        <remediationFunction>LINEAR</remediationFunction>
        <debtRemediationFunctionCoefficient>2min</debtRemediationFunctionCoefficient>
        <tag>design</tag>
        <ruleImplementation>
            <names>
                <textItem>Select_list_elemContext</textItem>
            </names>
            <textToFind>
                <textItem>*</textItem>
            </textToFind>
            <parentRules/>
            <childrenRules/>
            <siblingsRules/>
            <usesRules/>
            <ruleViolationMessage>SELECT * was used</ruleViolationMessage>
            <times>1</times>
            <distance>0</distance>
            <index>0</index>
            <indexCheckType>Default</indexCheckType>
            <distanceCheckType>Default</distanceCheckType>
            <ruleMode>Default</ruleMode>
            <ruleMatchType>TextAndClass</ruleMatchType>
            <ruleResultType>FailIfFound</ruleResultType>
            <textCheckType>Strict</textCheckType>
            <violatingRulesCodeExamples>
                <ruleCodeExample>SELECT * from dbo.test;</ruleCodeExample>
            </violatingRulesCodeExamples>
            <compliantRulesCodeExamples>
                <ruleCodeExample>SELECT name, surname from dbo.test;</ruleCodeExample>
                <ruleCodeExample>SELECT name, surname, 1 * 3 from dbo.test;</ruleCodeExample>
            </compliantRulesCodeExamples>
        </ruleImplementation>
    </rule>
```
For example, statement *SELECT * from dbo.test;* will be parsed as:

```
Tsql_fileContext@0: SELECT*FROMDBO.TEST;<EOF>
	BatchContext@1: SELECT*FROMDBO.TEST;
		Sql_clausesContext@2: SELECT*FROMDBO.TEST;
			Sql_clauseContext@3: SELECT*FROMDBO.TEST;
				Dml_clauseContext@4: SELECT*FROMDBO.TEST;
					Select_statementContext@5: SELECT*FROMDBO.TEST;
						Query_expressionContext@6: SELECT*FROMDBO.TEST
							Query_specificationContext@7: SELECT*FROMDBO.TEST
								TerminalNodeImpl@8: SELECT
								Select_listContext@8: *
									Select_list_elemContext@9: *
										AsteriskContext@10: *
											TerminalNodeImpl@11: *
								TerminalNodeImpl@8: FROM
								Table_sourcesContext@8: DBO.TEST
									Table_sourceContext@9: DBO.TEST
										Table_source_item_joinedContext@10: DBO.TEST
											Table_source_itemContext@11: DBO.TEST
												Table_name_with_hintContext@12: DBO.TEST
													Table_nameContext@13: DBO.TEST
														IdContext@14: DBO
															Simple_idContext@15: DBO
																TerminalNodeImpl@16: DBO
														TerminalNodeImpl@14: .
														IdContext@14: TEST
															Simple_idContext@15: TEST
																TerminalNodeImpl@16: TEST
						TerminalNodeImpl@6: ;
	TerminalNodeImpl@1: <EOF>
```

How custom rule works:

1. Finds all nodes of type *Select_listContext*
2. As rule mode is set to *SINGLE* and *FailIfFound* - all nodes are checked if any of the nodes contain child where its text value is equal to * as text check mode is set to *Strict*. Then such nodes are reported as having issues. If mode would be set to *Contains*, then statements such as *SELECT 1 * 3* would be reported as well. 

### Creating more complex custom rule with distance checks ###

For example, if you wanted to create a rule requiring that each SELECT statement ends with semicolon, you could use the following definition:

```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<rule>
    <key>Example1</key>
    <name>Select statement should end with semicolon</name>
    <internalKey>Example1</internalKey>
    <description>Select statement should end with semicolon&lt;h2&gt;Code examples&lt;/h2&gt;&lt;h3&gt;Non-compliant&lt;/h3&gt;&lt;pre&gt;&lt;code&gt;SELECT * from dbo.test where name like '%test%'&lt;/code&gt;&lt;/pre&gt;&lt;h3&gt;Compliant&lt;/h3&gt;&lt;pre&gt;&lt;code&gt;SELECT * from dbo.test where name like '%test%';&lt;/code&gt;&lt;/pre&gt;</description>
    <ruleImplementation>
        <names>
            <textItem>Select_statementContext</textItem>
        </names>
        <textToFind/>
        <parentRules/>
        <childrenRules>
            <ruleImplementation>
                <names>
                    <textItem>TerminalNodeImpl</textItem>
                </names>
                <textToFind>
                    <textItem>;</textItem>
                </textToFind>
                <parentRules/>
                <childrenRules/>
                <siblingsRules/>
                <usesRules/>
                <times>1</times>
                <distance>1</distance>
                <index>-1</index>
                <indexCheckType>Equals</indexCheckType>
                <distanceCheckType>Equals</distanceCheckType>
                <ruleMode>Default</ruleMode>
                <ruleMatchType>TextAndClass</ruleMatchType>
                <ruleResultType>FailIfNotFound</ruleResultType>
                <textCheckType>Strict</textCheckType>
                <violatingRulesCodeExamples/>
                <compliantRulesCodeExamples/>
            </ruleImplementation>
        </childrenRules>
        <siblingsRules/>
        <usesRules/>
        <times>1</times>
        <distance>0</distance>
        <index>0</index>
        <indexCheckType>Default</indexCheckType>
        <distanceCheckType>Default</distanceCheckType>
        <ruleMode>Default</ruleMode>
        <ruleMatchType>ClassOnly</ruleMatchType>
        <ruleResultType>Default</ruleResultType>
        <textCheckType>Default</textCheckType>
        <violatingRulesCodeExamples>
            <ruleCodeExample>SELECT * from dbo.test where name like '%test%'</ruleCodeExample>
        </violatingRulesCodeExamples>
        <compliantRulesCodeExamples>
            <ruleCodeExample>SELECT * from dbo.test where name like '%test%';</ruleCodeExample>
        </compliantRulesCodeExamples>
    </ruleImplementation>
</rule>
```

Tree for sample code (select * from dbo.test;):

```
Tsql_fileContext@0: SELECT*FROMDBO.TEST;<EOF>
	BatchContext@1: SELECT*FROMDBO.TEST;
		Sql_clausesContext@2: SELECT*FROMDBO.TEST;
			Sql_clauseContext@3: SELECT*FROMDBO.TEST;
				Dml_clauseContext@4: SELECT*FROMDBO.TEST;
					Select_statementContext@5: SELECT*FROMDBO.TEST;
						Query_expressionContext@6: SELECT*FROMDBO.TEST
							Query_specificationContext@7: SELECT*FROMDBO.TEST
								TerminalNodeImpl@8: SELECT
								Select_listContext@8: *
									Select_list_elemContext@9: *
										AsteriskContext@10: *
											TerminalNodeImpl@11: *
								TerminalNodeImpl@8: FROM
								Table_sourcesContext@8: DBO.TEST
									Table_sourceContext@9: DBO.TEST
										Table_source_item_joinedContext@10: DBO.TEST
											Table_source_itemContext@11: DBO.TEST
												Table_name_with_hintContext@12: DBO.TEST
													Table_nameContext@13: DBO.TEST
														IdContext@14: DBO
															Simple_idContext@15: DBO
																TerminalNodeImpl@16: DBO
														TerminalNodeImpl@14: .
														IdContext@14: TEST
															Simple_idContext@15: TEST
																TerminalNodeImpl@16: TEST
						TerminalNodeImpl@6: ;
	TerminalNodeImpl@1: <EOF>
```

Rule application:

```
Found candidate with text SELECT*FROMDBO.TESTWHERENAMELIKE'%TEST%'; of class Select_statementContext against rule: [Select_statementContext] classes and [] text
Found 1 candidates against [match: CLASS_ONLY, result: DEFAULT, distance 0, index: 0, indexCheck DEFAULT, distanceCheck: DEFAULT] rule: [Select_statementContext] classes and [] text
	Node matching rule: SELECT*FROMDBO.TESTWHERENAMELIKE'%TEST%'; Select_statementContext Distance: 0 Index: 0 Index2: 0
Found 1 candidates against [match: TEXT_AND_CLASS, result: FAIL_IF_NOT_FOUND, distance 1, index: -1, indexCheck EQUALS, distanceCheck: EQUALS] rule: [TerminalNodeImpl] classes and [;] text
	Node matching rule: ; TerminalNodeImpl Distance: 1 Index: 2 Index2: -1
```

As rule was set to FAIL_IF_NOT_FOUND as rule was satisfied, then no issue is reported.
