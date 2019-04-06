
CREATE PROCEDURE [BillingTests].[test that not existing customer can not get discount]
AS
BEGIN
	EXEC tSQLt.FakeTable 'Billing.Customers';
    EXEC tSQLt.FakeTable 'Billing.Orders';
    DECLARE @actualComputedResult BIT;
    SET @actualComputedResult = Billing.IsCustomerEligibleForDiscount(1);
    EXEC tSQLt.AssertEquals 0, @actualComputedResult;
END;