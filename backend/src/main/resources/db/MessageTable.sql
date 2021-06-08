CREATE TABLE IF NOT EXISTS `message` (
  `idmsg` int NOT NULL AUTO_INCREMENT,
  `msg` varchar(200) DEFAULT NULL,
  `date_envoi` varchar(300) DEFAULT NULL,
  `isread` tinyint(1) DEFAULT NULL,
  `sender` int DEFAULT NULL,
  `receiver` int DEFAULT NULL,
  PRIMARY KEY (`idmsg`),
  KEY `message_i1` (`receiver`),
  KEY `message_i2` (`sender`),
  CONSTRAINT `FK_REC` FOREIGN KEY (`receiver`) REFERENCES `utilisateur` (`id_user`),
  CONSTRAINT `FK_SND` FOREIGN KEY (`sender`) REFERENCES `utilisateur` (`id_user`)
);
