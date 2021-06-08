drop table utilisateur;
CREATE TABLE IF NOT EXISTS utilisateur (
        id_user int PRIMARY KEY NOT NULL AUTO_INCREMENT,
        username varchar(30) DEFAULT NULL,
        password varchar(30) DEFAULT NULL,
        first_name varchar(30) DEFAULT NULL,
        last_name varchar(30) DEFAULT NULL,
        email varchar(30) DEFAULT NULL,
        date_nais varchar(30) DEFAULT NULL
);
Insert Into utilisateur VALUES (1,'hibahikma','hibahiba','hiba','ajabri','hiba@gmail.com','06-08-1999');
select * from utilisateur;