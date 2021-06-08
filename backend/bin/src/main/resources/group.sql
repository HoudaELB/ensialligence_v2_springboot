drop table Groupe;
CREATE TABLE Groupe (
                        id_group INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                        id_admin INT,
                        id_participant INT,
                        Admin  VARCHAR(30),
                        group_name VARCHAR(30),
                        admin_phone VARCHAR(30),
                        Source VARCHAR(30),
                        Destination VARCHAR(30),
                        Time VARCHAR(30),
                        Day VARCHAR(30),
                        Month VARCHAR(30),
                        year VARCHAR(30),
                        CONSTRAINT FK_Part1 foreign key (id_admin) references Participant(id),
                        CONSTRAINT FK_Part2 foreign key (id_participant) references Participant(id)
);
INSERT INTO Groupe VALUES (1,2,3,'admin1', 'first_grp','0645775415','Azrou','Ifran','07:00','2','Janwary','2021');
INSERT INTO Groupe VALUES (null,2,3,'admin2', 'second_grp','0645775415','Azrou','Ifran','07:00','2','Janwary','2021');
INSERT INTO Groupe VALUES (null,2,3,'admin3', 'third_grp','0645775415','Azrou','Ifran','07:00','2','Janwary','2021');
INSERT INTO Groupe VALUES (null,2,3,'admin4', 'fourth_grp','0645775415','Azrou','Ifran','07:00','2','Janwary','2021');
INSERT INTO Groupe VALUES (null,2,3,'admin5', 'fifth_grp','0645775415','Azrou','Ifran','07:00','2','Janwary','2021');
select * from Groupe;

