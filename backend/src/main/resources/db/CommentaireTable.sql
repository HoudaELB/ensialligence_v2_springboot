CREATE TABLE IF NOT EXISTS `Commentaire` (
  `idCom` int NOT NULL AUTO_INCREMENT,
  `idUser` int DEFAULT NULL,
  `idArticle` int DEFAULT NULL,
  `comment` varchar(300) DEFAULT NULL,
  `nbjaimecom` int DEFAULT NULL,
  PRIMARY KEY (`idcom`),
  KEY `FK_COM1` (`id`),
  KEY `commentaire_i1` (`idarticle`),
  CONSTRAINT `FK_id_utilisateur_com` FOREIGN KEY (`id`) REFERENCES `utilisateur` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_id_article_com` FOREIGN KEY (`idarticle`) REFERENCES `article` (`idarticle`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;