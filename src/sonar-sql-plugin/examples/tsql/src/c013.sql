/*compliant code*/
CREATE UNIQUE INDEX IX_Test_Name on dbo.test (Name);
CREATE UNIQUE INDEX IX_Test_Name on dbo.test (Name);
/*violating code*/
CREATE UNIQUE INDEX Test_Name on dbo.test (Name);
CREATE UNIQUE INDEX Test_Name on dbo.test (Name);
