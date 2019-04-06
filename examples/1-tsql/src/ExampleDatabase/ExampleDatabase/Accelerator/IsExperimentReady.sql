
CREATE FUNCTION Accelerator.IsExperimentReady()
RETURNS BIT
AS
BEGIN 
  DECLARE @NumParticles INT;
  
  SELECT @NumParticles = COUNT(1) FROM Accelerator.Particle;
  
  IF @NumParticles > 2
    RETURN 1;

  RETURN 0;
END;


