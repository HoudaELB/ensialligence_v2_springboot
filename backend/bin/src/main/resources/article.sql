drop table article;
CREATE TABLE IF NOT EXISTS article (
               id_article int PRIMARY KEY NOT NULL AUTO_INCREMENT,
               id_user int DEFAULT NULL,
               titre varchar(300) DEFAULT NULL,
               categorie varchar(300) DEFAULT NULL,
               image longblob,
               nbjaimeart int DEFAULT NULL,
               CONSTRAINT FK_ART foreign key (id_user) references utilisateur(id_user)
);
INSERT INTO article VALUES (1,1,'first_article_tite','first_article_categorie',null,12);
select * from article;