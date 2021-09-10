/*compliant code*/
SELECT name, surname, count from dbo.test where locationID in (1,2,3);
SELECT name, surname, count from dbo.test where locationID in (1,2,3);
SELECT name, surname, count from dbo.test where exists (select 1 from dbo.locations where id = locationID);
SELECT name, surname, count from dbo.test where exists (select 1 from dbo.locations where id = locationID);
/*violating code*/
SELECT name, surname, count from dbo.test where locationID in (select id from dbo.locations);
SELECT name, surname, count from dbo.test where locationID in (select id from dbo.locations);
