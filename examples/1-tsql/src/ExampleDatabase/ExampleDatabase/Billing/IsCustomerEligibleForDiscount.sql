CREATE FUNCTION Billing.IsCustomerEligibleForDiscount
(
    @customerId int
)
RETURNS bit
AS
BEGIN
    DECLARE @result bit = 0
    DECLARE @date DATETIME = GETDATE();  
    DECLARE @prevMonth DATETIME =  EOMONTH ( @date, -1 );

    SELECT @result = case when sum([sum]) > 2000 and count(*) > 3 then 1 else 0 end 
	FROM Billing.Orders WHERE customerId = @customerId and [date] between @prevMonth and @date

    RETURN @result 

END