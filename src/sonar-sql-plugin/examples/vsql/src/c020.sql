/*compliant code*/
SELECT * FROM test_table1;
SELECT * FROM test_table1;
/*violating code*/
SELECT /*+DIRECT*/ * FROM test_table1;
SELECT /*+DIRECT*/ * FROM test_table1;
CREATE TABLE test_table2 AS SELECT /*+DIRECT*/ * FROM test_table1;
CREATE TABLE test_table2 AS SELECT /*+DIRECT*/ * FROM test_table1;
