/*compliant code*/
SELECT name, surname, count from dbo.test where name = 'or' and surname = 'TestOR';
SELECT name, surname, count from dbo.test where name = 'or' and surname = 'TestOR';
/*violating code*/
SELECT name, surname, count from dbo.test where name = 'Test' OR surname = 'Testor';
SELECT name, surname, count from dbo.test where name = 'Test' OR surname = 'Testor';
