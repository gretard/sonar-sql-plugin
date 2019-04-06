CREATE VIEW [Billing].[CustomerDiscounts]
AS
SELECT        *, CASE WHEN [Billing].IsCustomerEligibleForDiscount(id) = 1 THEN 'discount available' ELSE 'no discount' END AS 'discount options'
FROM            billing.Customers