/*compliant code*/
SELECT name, surname from dbo.test order by name desc, surname asc;
SELECT name, surname from dbo.test order by name desc, surname asc;
/*violating code*/
SELECT name, surname from dbo.test order by name, surname asc;
SELECT name, surname from dbo.test order by name, surname asc;
