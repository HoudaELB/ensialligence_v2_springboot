CREATE TABLE IF NOT EXISTS `Commentaire` (
  `idCom` int NOT NULL AUTO_INCREMENT,
  `idUser` int DEFAULT NULL,
  `idArticle` int DEFAULT NULL,
  `comment` varchar(300) DEFAULT NULL,
  `nbjaimecom` int DEFAULT NULL,
  PRIMARY KEY (`idcom`),
  CONSTRAINT `FK_id_utilisateur_com` FOREIGN KEY (`idUser`) REFERENCES `utilisateur` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_id_article_com` FOREIGN KEY (`idArticle`) REFERENCES `article` (`id_article`) ON DELETE CASCADE ON UPDATE CASCADE
);
