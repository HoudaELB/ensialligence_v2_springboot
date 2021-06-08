CREATE TABLE IF NOT EXISTS `message` (
          `id_msg` int NOT NULL AUTO_INCREMENT,
          `msg` varchar(200) DEFAULT NULL,
          `date_envoi` varchar(300) DEFAULT NULL,
          `is_read` tinyint(1) DEFAULT NULL,
          `sender` int DEFAULT NULL,
          `receiver` int DEFAULT NULL,
           PRIMARY KEY (`id_msg`),
           KEY `message_i1` (`receiver`),
           KEY `message_i2` (`sender`),
           CONSTRAINT `FK_REC` FOREIGN KEY (`receiver`) REFERENCES `utilisateur` (`id_user`),
           CONSTRAINT `FK_SND` FOREIGN KEY (`sender`) REFERENCES `utilisateur` (`id_user`)
);
INSERT INTO message values(1,'first msg','2021-06-23',true,1,1);
select * from message;