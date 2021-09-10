/*compliant code*/
ALTER TABLE dbo.Orders ADD CONSTRAINT FK_ClientId FOREIGN KEY (ClientId) REFERENCES dbo.Clients(Id); 
ALTER TABLE dbo.Orders ADD CONSTRAINT FK_ClientId FOREIGN KEY (ClientId) REFERENCES dbo.Clients(Id); 
/*violating code*/
ALTER TABLE dbo.Orders ADD CONSTRAINT ClientId FOREIGN KEY (ClientId) REFERENCES dbo.Clients(Id);  
ALTER TABLE dbo.Orders ADD CONSTRAINT ClientId FOREIGN KEY (ClientId) REFERENCES dbo.Clients(Id);  
