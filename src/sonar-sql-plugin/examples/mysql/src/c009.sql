/*compliant code*/
SELECT MAX(RateChangeDate)  FROM HumanResources.EmployeePayHistory WHERE BusinessEntityID = 1
SELECT MAX(RateChangeDate)  FROM HumanResources.EmployeePayHistory WHERE BusinessEntityID = 1
SELECT name, surname from dbo.test where date between 2008-10-10 and 2010-10-10;
SELECT name, surname from dbo.test where date between 2008-10-10 and 2010-10-10;
SELECT max(price) from dbo.items;
SELECT max(price) from dbo.items;
/*violating code*/
SELECT name, surname from dbo.test where year(date) > 2008 and month = 12;
SELECT name, surname from dbo.test where year(date) > 2008 and month = 12;
SELECT name, surname from dbo.test where name like '%red' 
SELECT name, surname from dbo.test where name like '%red' 
