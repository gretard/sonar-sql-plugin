/*compliant code*/
SELECT * from dbo.test where name IS NULL;
SELECT * from dbo.test where name IS NULL;
SELECT * from dbo.test where name IS NOT NULL;
SELECT * from dbo.test where name IS NOT NULL;
SELECT * from dbo.test where name = 'test';
SELECT * from dbo.test where name = 'test';
/*violating code*/
SELECT * from dbo.test where name = null and surname = 'Test' ;
SELECT * from dbo.test where name = null and surname = 'Test' ;
SELECT * from dbo.test where name != null;
SELECT * from dbo.test where name != null;
SELECT * from dbo.test where name <> null;
SELECT * from dbo.test where name <> null;
