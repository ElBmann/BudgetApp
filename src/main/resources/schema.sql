DROP TABLE IF EXISTS USERS;
CREATE TABLE USERS(email VARCHAR(45), 
				   firstName VARCHAR(45), 
				   lastName VARCHAR(45), 
				   password VARCHAR(45), 
				   number VARCHAR(20),
				   createdByUser VARCHAR(45),
				   createdByDate DATETIME,
				   updatedByUser VARCHAR(45),
				   updatedByDate DATETIME);

