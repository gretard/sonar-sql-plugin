
CREATE PROCEDURE [BillingTests].[test that customer with more than 3 orders and total over 2000 can discount]
AS
BEGIN
--Assemble: Fake the Particle table to make sure it is empty and that constraints will not be a problem
  EXEC tSQLt.FakeTable 'Billing.Customers';
   EXEC tSQLt.FakeTable 'Billing.Orders';
  --          Populate the Particle table with rows that hug the rectangle boundaries
  INSERT INTO Billing.Customers VALUES ( 1, 'test');
    INSERT INTO Billing.Orders VALUES ('order1', 1, 1000,  DATEADD(day,-1,GETDATE()));
	    INSERT INTO Billing.Orders VALUES ('order2', 1, 2000,  DATEADD(day,-1,GETDATE()));
		    INSERT INTO Billing.Orders VALUES ('order3', 1, 3330,  DATEADD(day,-1,GETDATE()));
			    INSERT INTO Billing.Orders VALUES ('order4', 1, 12220,  DATEADD(day,-1,GETDATE()));
    DECLARE @actualComputedResult BIT;
    SET @actualComputedResult = Billing.IsCustomerEligibleForDiscount(1);
    EXEC tSQLt.AssertEquals 1, @actualComputedResult;
END;