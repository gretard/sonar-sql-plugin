/*compliant code*/
SELECT * from dbo.test order by name;
SELECT * from dbo.test order by name;
/*violating code*/
SELECT * from dbo.test order by 1, 2;
SELECT * from dbo.test order by 1, 2;
