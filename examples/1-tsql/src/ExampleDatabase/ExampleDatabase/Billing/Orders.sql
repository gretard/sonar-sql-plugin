CREATE TABLE [Billing].[Orders] (
    [ordername]  NCHAR (255) NULL,
    [customerId] INT         NULL,
    [sum]        FLOAT (53)  NULL,
    [date]       DATE        NULL
);


GO
EXECUTE sp_addextendedproperty @name = N'tSQLt.FakeTable_OrgTableName', @value = N'tSQLt_tempobject_f0c30fdb1c4a4fa697445d265ee80788', @level0type = N'SCHEMA', @level0name = N'Billing', @level1type = N'TABLE', @level1name = N'Orders';

