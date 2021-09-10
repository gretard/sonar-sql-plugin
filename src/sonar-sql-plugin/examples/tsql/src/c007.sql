/*compliant code*/
SELECT name, surname from dbo.test;
SELECT name, surname from dbo.test;
/*violating code*/
SELECT name, surname from dbo.test WITH (NOLOCK);
SELECT name, surname from dbo.test WITH (NOLOCK);
