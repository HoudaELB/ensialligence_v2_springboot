CREATE TABLE IF NOT EXISTS `friend` (
      `id_friend` int NOT NULL AUTO_INCREMENT,
       `id_user1` int DEFAULT NULL,
       `id_user2` int DEFAULT NULL,
       PRIMARY KEY (`id_friend`),
       KEY `friend_i1` (`id_user1`),
       KEY `friend_i2` (`id_user2`),
       CONSTRAINT `FK_USER1` FOREIGN KEY (`id_user1`) REFERENCES `utilisateur` (`id_user`),
       CONSTRAINT `FK_USER2` FOREIGN KEY (`id_user2`) REFERENCES `utilisateur` (`id_user`)
);
INSERT INTO friend VALUES (1,1,1);
select * from friend;