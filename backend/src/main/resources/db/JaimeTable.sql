drop table jaime;
CREATE TABLE IF NOT EXISTS jaime (
           id_jaime int NOT NULL AUTO_INCREMENT,
           id_user int DEFAULT NULL,
           id_article int DEFAULT NULL,
           PRIMARY KEY (`id_jaime`),
           UNIQUE KEY `idjaime_UNIQUE` (`id_jaime`),
           KEY `FK_USER_idx` (`id_user`),
           KEY `FK_ART_JAIME_idx` (`id_article`),
           CONSTRAINT FK_JAIME1 foreign key (id_article) references article(id_article),
           CONSTRAINT FK_JAIME2 foreign key (id_user) references utilisateur(id_user)

);
insert into jaime values (1,1,1);
select * from jaime;