CREATE TABLE [Billing].[Customers] (
    [id]   INT         NULL,
    [name] NCHAR (255) NULL
);


GO
EXECUTE sp_addextendedproperty @name = N'tSQLt.FakeTable_OrgTableName', @value = N'tSQLt_tempobject_9ebb1c5d4b6944daace9941ebca2c6bc', @level0type = N'SCHEMA', @level0name = N'Billing', @level1type = N'TABLE', @level1name = N'Customers';

