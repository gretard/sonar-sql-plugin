
CREATE FUNCTION Accelerator.GetStatusMessage()
  RETURNS NVARCHAR(MAX)
AS
BEGIN
  DECLARE @NumParticles INT;
  SELECT @NumParticles = COUNT(1) FROM Accelerator.Particle;
  RETURN 'The Accelerator is prepared with ' + CAST(@NumParticles AS NVARCHAR(MAX)) + ' particles.';
END;


