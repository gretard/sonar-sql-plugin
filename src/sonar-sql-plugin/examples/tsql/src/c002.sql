/*compliant code*/
SELECT name, surname from dbo.test;
SELECT name, surname from dbo.test;
SELECT name, surname, 1 * 3 from dbo.test;
SELECT name, surname, 1 * 3 from dbo.test;
/*violating code*/
SELECT t1.*, t2.* from dbo.test as t1 inner join dbo.test2 as t2 on t1.id=t2.id;
SELECT t1.*, t2.* from dbo.test as t1 inner join dbo.test2 as t2 on t1.id=t2.id;
