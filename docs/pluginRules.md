## C001 - SLEEP/WAITFOR is used.
<p>Supported dialects: MYSQL,PSSQL,PSSQLV2,TSQL</p>
SLEEP/WAITFOR is used<h2>Code examples</h2><h3>Non-compliant</h3><pre><code>WAITFOR '10:00:00';</code></pre>

## C002 - SELECT * is used
<p>Supported dialects: MYSQL,SNOWFLAKE,PSSQLV2,TSQL</p>
<h2>Description</h2><p>SELECT * is used. Please list names.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>SELECT t1.*, t2.* from dbo.test as t1 inner join dbo.test2 as t2 on t1.id=t2.id;</code></pre><h3>Compliant</h3><pre><code>SELECT name, surname from dbo.test;</code></pre><pre><code>SELECT name, surname, 1 * 3 from dbo.test;</code></pre>

## C003 - INSERT statement without columns listed
<p>Supported dialects: MYSQL,SNOWFLAKE,PSSQLV2,TSQL</p>
<h2>Description</h2><p>INSERT statement does not have columns listed. Always use a column list in your INSERT statements.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>INSERT INTO dbo.test VALUES (1,2);
INSERT INTO dbo.test2 VALUES (1,2);</code></pre><h3>Compliant</h3><pre><code>INSERT INTO dbo.test (a,b) VALUES (1,2);</code></pre>

## C004 - ORDER BY clause contains positional references
<p>Supported dialects: MYSQL,PSSQL,SNOWFLAKE,PSSQLV2,TSQL</p>
<h2>Description</h2><p>Do not use column numbers in the ORDER BY clause. Always use column names in an order by clause. Avoid positional references.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>SELECT * from dbo.test order by 1, 2;</code></pre><h3>Compliant</h3><pre><code>SELECT * from dbo.test order by name;</code></pre>

## C005 - EXECUTE/EXEC for dynamic query is used
<p>Supported dialects: TSQL</p>
<h2>Description</h2><p>EXECUTE/EXEC for dynamic query was used. It is better to use sp_executesql for dynamic queries.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>EXEC ('SELECT 1');</code></pre><pre><code>EXEC (@sQueryText);</code></pre><h3>Compliant</h3><pre><code>EXECUTE sp_executesql N'select 1';</code></pre><pre><code>exec sys.sp_test  @test = 'Publisher';</code></pre>

## C007 - NOLOCK hint used
<p>Supported dialects: TSQL</p>
<h2>Description</h2><p>Use of NOLOCK might cause data inconsistency problems.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>SELECT name, surname from dbo.test WITH (NOLOCK);</code></pre><h3>Compliant</h3><pre><code>SELECT name, surname from dbo.test;</code></pre>

## C009 - Non-sargable statement used
<p>Supported dialects: VSQL,MYSQL,PSSQL,SNOWFLAKE,PSSQLV2,TSQL</p>
<h2>Description</h2><p>Use of non-sargeable arguments might cause performance problems.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>SELECT name, surname from dbo.test where year(date) > 2008 and month = 12;</code></pre><pre><code>SELECT name, surname from dbo.test where name like '%red' </code></pre><h3>Compliant</h3><pre><code>SELECT MAX(RateChangeDate)  FROM HumanResources.EmployeePayHistory WHERE BusinessEntityID = 1</code></pre><pre><code>SELECT name, surname from dbo.test where date between 2008-10-10 and 2010-10-10;</code></pre><pre><code>SELECT max(price) from dbo.items;</code></pre><pre><code>select department_id, count(*) from employees group by department_id having count (*) < 10;</code></pre>

## C010 - Defined primary key is not using recommended naming convention
<p>Supported dialects: TSQL</p>
<h2>Description</h2><p>Defined primary key is not using recommended naming convention to start with PK_.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>CREATE TABLE dbo.Orders
(
Id int NOT NULL,
CONSTRAINT OrderID PRIMARY KEY CLUSTERED (Id) 
);  </code></pre><pre><code>CREATE TABLE dbo.Orders
(
Id int NOT NULL,  
PRIMARY KEY (Id)
);  </code></pre><h3>Compliant</h3><pre><code>ALTER TABLE dbo.Orders ADD CONSTRAINT PK_OrderId PRIMARY KEY CLUSTERED (Id);</code></pre>

## C011 - Defined foreign key is not using recommended naming convention
<p>Supported dialects: TSQL</p>
<h2>Description</h2><p>Defined foreign key is not using recommended naming convention to start with FK_.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>ALTER TABLE dbo.Orders ADD CONSTRAINT ClientId FOREIGN KEY (ClientId) REFERENCES dbo.Clients(Id);  </code></pre><h3>Compliant</h3><pre><code>ALTER TABLE dbo.Orders ADD CONSTRAINT FK_ClientId FOREIGN KEY (ClientId) REFERENCES dbo.Clients(Id); </code></pre>

## C012 - Comparison operator (=, <>, !=) to check if value is null used
<p>Supported dialects: MYSQL,PSSQL,SNOWFLAKE,PSSQLV2,TSQL</p>
<h2>Description</h2><p>It is not advisable to use comparison operator to check if value is null as comparison operators return UNKNOWN when either or both arguments are NULL. Please use IS NULL or IS NOT NULL instead.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>SELECT * from dbo.test where name = null and surname = 'Test' ;</code></pre><pre><code>SELECT * from dbo.test where name != null;</code></pre><pre><code>SELECT * from dbo.test where name <> null;</code></pre><h3>Compliant</h3><pre><code>SELECT * from dbo.test where name IS NULL;</code></pre><pre><code>SELECT * from dbo.test where name IS NOT NULL;</code></pre><pre><code>SELECT * from dbo.test where name = 'test';</code></pre>

## C013 - Defined index name is not using recommended naming convention
<p>Supported dialects: TSQL</p>
<h2>Description</h2><p>Defined index name is not using recommended naming convention to start with IX_.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>CREATE UNIQUE INDEX Test_Name on dbo.test (Name);</code></pre><h3>Compliant</h3><pre><code>CREATE UNIQUE INDEX IX_Test_Name on dbo.test (Name);</code></pre>

## C014 - OR verb is used in a WHERE clause
<p>Supported dialects: MYSQL,PSSQL,SNOWFLAKE,PSSQLV2,TSQL</p>
<h2>Description</h2><p>It is  advisable to consider using UNION/UNION ALL operator instead of OR verb in the WHERE clause.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>SELECT name, surname, count from dbo.test where name = 'Test' OR surname = 'Testor';</code></pre><h3>Compliant</h3><pre><code>SELECT name, surname, count from dbo.test where name = 'or' and surname = 'TestOR';</code></pre>

## C015 - UNION operator is used
<p>Supported dialects: MYSQL,PSSQL,SNOWFLAKE,PSSQLV2,TSQL</p>
<h2>Description</h2><p>It is  advisable to consider using UNION ALL operator instead of UNION.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>SELECT name, surname, count from dbo.test union SELECT name, surname, count from dbo.test2;</code></pre><h3>Compliant</h3><pre><code>SELECT name, surname, count from dbo.test union all SELECT name, surname, count from dbo.test2;</code></pre>

## C016 - IN/NOT IN is used for a subquery
<p>Supported dialects: MYSQL,PSSQL,SNOWFLAKE,PSSQLV2,TSQL</p>
<h2>Description</h2><p>Consider using EXISTS/NOT EXISTS operator instead of IN for a subquery.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>SELECT name, surname, count from dbo.test where locationID in (select id from dbo.locations);</code></pre><h3>Compliant</h3><pre><code>SELECT name, surname, count from dbo.test where locationID in (1,2,3);</code></pre><pre><code>SELECT name, surname, count from dbo.test where exists (select 1 from dbo.locations where id = locationID);</code></pre>

## C017 - ORDER BY clause does not contain order (ASC/DESC)
<p>Supported dialects: MYSQL,PSSQL,SNOWFLAKE,PSSQLV2,TSQL</p>
<h2>Description</h2><p>It is advisable to specidy order how rows should be ordered.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>SELECT name, surname from dbo.test order by name, surname asc;</code></pre><h3>Compliant</h3><pre><code>SELECT name, surname from dbo.test order by name desc, surname asc;</code></pre>

## C020 - HINT is used
<p>Supported dialects: VSQL</p>
<h2>Description</h2><p>HINT is used. Consider rewriting this statement.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>SELECT /*+DIRECT*/ * FROM test_table1;</code></pre><pre><code>CREATE TABLE test_table2 AS SELECT /*+DIRECT*/ * FROM test_table1;</code></pre><h3>Compliant</h3><pre><code>SELECT * FROM test_table1;</code></pre>

## C021 - COMMIT is missing
<p>Supported dialects: VSQL</p>
<h2>Description</h2><p>COMMIT is missing after UPDATE/DELETE statement. If you run script without autocommit - your changes might be lost.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>SELECT 1; DELETE FROM temp1; SELECT 2;</code></pre><pre><code>COMMIT; DELETE FROM temp1;</code></pre><h3>Compliant</h3><pre><code>SELECT 1; DELETE FROM temp1; COMMIT; SELECT 2; </code></pre>

## C022 - Non-materialized view found
<p>Supported dialects: SNOWFLAKE</p>
<h2>Description</h2><p>Consider using materialized view.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>CREATE VIEW V1 (C1) AS SELECT 1 as C1;</code></pre><h3>Compliant</h3><pre><code>CREATE MATERIALIZED VIEW V1 (C1) AS SELECT 1 as C1;</code></pre>

## C023 - Cartesian join found
<p>Supported dialects: VSQL,MYSQL,SNOWFLAKE,PSSQLV2,TSQL</p>
<h2>Description</h2><p>Cartesian join without explicit JOIN clause. Consider using explicit JOIN clause.</p><h2>Code examples</h2><h3>Non-compliant</h3><pre><code>SELECT name, order_id FROM customers, orders WHERE customers.id = orders.customer_id;</code></pre><h3>Compliant</h3><pre><code>SELECT name, surname FROM customers c</code></pre><pre><code>SELECT name, bank_name FROM customers c  inner join banks b on c.bank_id = b.id</code></pre>

## C030 - File does not start with multiline/header comment
<p>Supported dialects: TSQL,PSSQL,MYSQL,VSQL,PSSQLV2,SNOWFLAKE</p>
File does not start with multiline/header comment.<h2>Code examples</h2><h3>Non-compliant</h3><pre><code>SELECT * FROM test_table1;</code></pre><pre><code>SELECT * FROM test_table1; /*additionalComment*/ </code></pre><h3>Compliant</h3><pre><code>/* AUTHOR: test
Date: 2020-01-01
 */
 SELECT * FROM test_table1;</code></pre>

