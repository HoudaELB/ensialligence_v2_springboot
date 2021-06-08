CREATE TABLE Participant (
                             id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                             first_name VARCHAR(30),
                             last_name VARCHAR(30),
                             admin_phone VARCHAR(30)
);
INSERT INTO Participant VALUES (1,'hiba','ajabri','0632551498');
INSERT INTO Participant VALUES (null,'houda','elbiach','0632984514');
INSERT INTO Participant VALUES (null,'mohamed','ed','0632951487');
select * from Participant;