DROP TABLE IF EXISTS USERS;
CREATE TABLE USERS(email VARCHAR(45), 
				   firstName VARCHAR(45), 
				   lastName VARCHAR(45), 
				   password VARCHAR(45), 
				   number VARCHAR(20),
				   createdBy VARCHAR(45),
				   createdTimestamp DATETIME,
				   updatedBy VARCHAR(45),
				   updatedTimestamp DATETIME);

