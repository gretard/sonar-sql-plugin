/*compliant code*/
INSERT INTO dbo.test (a,b) VALUES (1,2);
INSERT INTO dbo.test (a,b) VALUES (1,2);
/*violating code*/
INSERT INTO dbo.test VALUES (1,2);
INSERT INTO dbo.test2 VALUES (1,2);
INSERT INTO dbo.test VALUES (1,2);
INSERT INTO dbo.test2 VALUES (1,2);
