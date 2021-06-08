CREATE TABLE IF NOT EXISTS `Commentaire` (
           `id_com` int NOT NULL AUTO_INCREMENT,
           `id_user` int DEFAULT NULL,
           `id_article` int DEFAULT NULL,
           `comment` varchar(300) DEFAULT NULL,
           `nbjaimecom` int DEFAULT NULL,
            PRIMARY KEY (`id_com`),
            CONSTRAINT `FK_id_utilisateur_com` FOREIGN KEY (`id_user`) REFERENCES `utilisateur` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE,
            CONSTRAINT `FK_id_article_com` FOREIGN KEY (`id_article`) REFERENCES `article` (`id_article`) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO Commentaire VALUES (1,1,1,'first Comment',45);
select * from Commentaire;