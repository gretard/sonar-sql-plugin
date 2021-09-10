/*compliant code*/
SELECT name, surname, count from dbo.test union all SELECT name, surname, count from dbo.test2;
SELECT name, surname, count from dbo.test union all SELECT name, surname, count from dbo.test2;
/*violating code*/
SELECT name, surname, count from dbo.test union SELECT name, surname, count from dbo.test2;
SELECT name, surname, count from dbo.test union SELECT name, surname, count from dbo.test2;
