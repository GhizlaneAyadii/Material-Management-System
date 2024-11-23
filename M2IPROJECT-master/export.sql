CREATE DATABASE  IF NOT EXISTS `bd_dept_info` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bd_dept_info`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bd_dept_info
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `demande`
--

DROP TABLE IF EXISTS `demande`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `demande` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_creation` date DEFAULT NULL,
  `etat` int NOT NULL,
  `id_employee` bigint DEFAULT NULL,
  `materiel_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKa1h5bpqvt9ee0pdfw5hd07vst` (`id_employee`) USING BTREE,
  KEY `FK74hs7vt3fojrw0beicqsvwwm` (`materiel_id`)
) ENGINE=MyISAM AUTO_INCREMENT=62 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `demande`
--

LOCK TABLES `demande` WRITE;
/*!40000 ALTER TABLE `demande` DISABLE KEYS */;
INSERT INTO `demande` VALUES (58,'2024-01-31',1,23,70),(59,'2024-02-01',0,23,69),(60,'2024-02-01',0,23,69),(61,'2024-02-01',0,23,69);
/*!40000 ALTER TABLE `demande` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `demande_fourniture`
--

DROP TABLE IF EXISTS `demande_fourniture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `demande_fourniture` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_creation` date DEFAULT NULL,
  `etat` int NOT NULL,
  `fournisseur` varchar(255) DEFAULT NULL,
  `nombre` int NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  `id_employee` bigint DEFAULT NULL,
  `fourniture_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKruhp1e38wfs5cx94he7b2bjkp` (`id_employee`),
  KEY `FK3f1vs34sbsibgke6yhs7oj7jw` (`fourniture_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `demande_fourniture`
--

LOCK TABLES `demande_fourniture` WRITE;
/*!40000 ALTER TABLE `demande_fourniture` DISABLE KEYS */;
INSERT INTO `demande_fourniture` VALUES (1,'2024-01-01',0,'FournisseurXYZ',50,'Stylos',NULL,NULL);
/*!40000 ALTER TABLE `demande_fourniture` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `cin` varchar(10) NOT NULL,
  `email` varchar(80) NOT NULL,
  `password` varchar(80) NOT NULL,
  `fonction` varchar(60) NOT NULL,
  `employee_role` varchar(255) NOT NULL,
  `telephone` varchar(20) NOT NULL,
  `bureau` varchar(10) NOT NULL,
  `image_url` varchar(500) DEFAULT NULL,
  `datenaissance` varchar(255) DEFAULT NULL,
  `postal_code` varchar(255) DEFAULT NULL,
  `rib` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL,
  `adress` varchar(60) NOT NULL,
  `banque` varchar(60) NOT NULL,
  `codepostal` varchar(60) NOT NULL,
  `somnumber` varchar(60) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_kq4w2ttahre5ce3trc2wjwx7n` (`telephone`),
  UNIQUE KEY `UK_xmf3rjl19x0vgsjuoydgbrp0` (`cin`),
  UNIQUE KEY `UK_j9xgmd0ya5jmus09o0b8pqrpb` (`email`)
) ENGINE=MyISAM AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'zerrif','fati','F659951','fati.zerrif@ump.ac.ma','$2a$10$0aEwHfCOAttaQeCGDGbOm.SsAr6mvua6ODyza7YdhhIWNTFxw83ea','Enseignant','Chef','0640750454','I9',NULL,'1990-01-01','12345','123456789','Oujda','Oujda','banque','12345','987654321'),(24,'Allaoui','Ahmed','F669727','ahmed.allaoui@gmail.com','$2a$10$NGyUQpgTgX6eWHbw5DKfKekhGzyb9AP5Pb/1z5Zd6McWCjSVJ4m3K','Enseignant','responsable','0679155424','15',NULL,NULL,NULL,NULL,NULL,'','','',''),(22,'ZERRIF','FATIMA ZAHRA','F669527','fatima23zahra12@gmail.com','$2a$10$8zrmJmyd5dW90pV19ZbWre0q9l0DXthxCyAusKrPmCO6VK.C/kRwK','Enseignant','Enseignant','0649155424','15',NULL,NULL,NULL,NULL,NULL,'','','',''),(23,'ZERRIF','Mustapha','F60000','fatima23zahra112@gmail.com','$2a$10$jpOHVkU4B0VdrLB.NCxTWeP/Gbo9um37rbsvyVjPYgfqZj.ss4hGa','Technicien','Technicien','0662107442','12',NULL,NULL,NULL,NULL,NULL,'','','',''),(25,'zr','tima','F679951','tima.zr@ump.ac.ma','$2a$10$aFdgyKmOvxPg/64qkmgTweaPNXNZeK8vuMWlI.m/iiJCHYlHgQ69O','Enseignant','Chef','0640750954','I1','https://i.pinimg.com/originals/c3/0f/ae/c30fae9271190cfd53e7ff9a3ed0423d.jpg','23/12/2001',NULL,'123456789','oujda','oujda','banque','60000','2024'),(26,'med','medo','F123123','med.medo@ump.ac.ma','$2a$10$frOgFflvR9lLWb.cE8QWMOhtDGaFZO/1en1X.5zgzXESbkmAa8AH.','Technicien','Technicien','0123456789','12',NULL,'2001-01-23',NULL,'1236547897','oujda','oujda','banque','60000',''),(28,'ZERIF','FATIMA ZAHR','F60005','fatima23zahra1112@gmail.com','$2a$10$uEYfMoHLCBfzByzXgFBMxugrqlDKKZ6djjPKDYMv6/DPD22QnVPOu','Technicien','Technicien','0649155888','1225',NULL,'23-12-2001',NULL,'123456789456123','OUJDA','BEN KHIRANE E18 N18','FATi','60000','12365'),(29,'elhassani','ikrame','F60006','fatima233zahra12@gmail.com','$2a$10$ArR237oq4xzJpXKEBQVZbeh5XHqroJTjhHLSl9tTjNE696pu1i9AG','Enseignant','Adjoint','0649158888','1515',NULL,'23-12-2001',NULL,'123456789456123','OUJDA','BEN KHIRANE E18 N18','FATii','60000','12365'),(30,'boudou','aymane','F60009','fatima23zahraa12@gmail.com','$2a$10$EjlCHWUVfDmYCPgk520Iy.UNCqAKApPPUNL77Imi5t.euE.WUF.y6','Technicien','Technicien','0649185888','151',NULL,'23-12-2001',NULL,'123456789456123','OUJDA','BEN KHIRANE E18 N18','FATIMAZ','60000','12365'),(31,'allaoui','anass','F60088','fatima233zahra112@gmail.com','$2a$10$PMykfxHbyc0gpkSdhn8XXOjgol0p8G3EO.VyTwRoak9g0bjw/Cy/W','Technicien','Technicien','0687901139','1225',NULL,'23-12-2001',NULL,'123456789456123','OUJDA','BEN KHIRANE E18 N18','FATI','60000','12365'),(32,'benmed','mohmed','F600666','mohmed23zahra12@gmail.com','$2a$10$lcybiHpmvAlPBmZSh4KrZ.mOtSGIFUJ.2Qa2ZAv8Dg4Nfvt.DZGdG','Enseignant','Enseignant','06491999924','12',NULL,'23-12-2001',NULL,'1234567894561231442254125','OUJDA','BEN KHIRANE E18 N18','FATIMA ','60000','12365');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fourniture`
--

DROP TABLE IF EXISTS `fourniture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fourniture` (
  `id` bigint NOT NULL,
  `nombre` int NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  `fournisseur` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fourniture`
--

LOCK TABLES `fourniture` WRITE;
/*!40000 ALTER TABLE `fourniture` DISABLE KEYS */;
INSERT INTO `fourniture` VALUES (32,12,'imprimante','fourniseur'),(34,15,'glue','fourniseur1'),(30,2,'papier','fournisseur a'),(35,3,'eraser','fournisrrr'),(28,16,'stylos','fournisseur b');
/*!40000 ALTER TABLE `fourniture` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (36),(36),(1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materiel`
--

DROP TABLE IF EXISTS `materiel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materiel` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_acquisition` date DEFAULT NULL,
  `date_affectation` date DEFAULT NULL,
  `num_inventaire` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `id_employee` bigint DEFAULT NULL,
  `responsable` varchar(255) DEFAULT NULL,
  `fournisseur` varchar(255) DEFAULT NULL,
  `date_affectation_responsable` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKeg246noav5atpej36c0r3o0y7` (`id_employee`)
) ENGINE=MyISAM AUTO_INCREMENT=72 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materiel`
--

LOCK TABLES `materiel` WRITE;
/*!40000 ALTER TABLE `materiel` DISABLE KEYS */;
INSERT INTO `materiel` VALUES (70,'2024-01-31','2024-01-31','01','imprimante',23,'administration','fournis',NULL),(69,'2024-12-01',NULL,'15','clavier',NULL,'departementInformatique','fourniseur1',NULL),(57,'2024-01-28','2024-01-29','15','pc10',1,'departementInformatique','four',NULL),(58,'2024-01-28','2024-01-30','15','pc10',23,'departementInformatique','four',NULL),(68,'2024-01-31','2024-01-31','15','hp',1,'departementInformatique','fourniseur',NULL),(63,'2024-01-31','2024-01-31','I12','imprimante',1,'departementInformatique','fournisseur b',NULL),(64,'2024-01-31','2024-01-31','125','imprimante',1,'departementInformatique','fournisseur b',NULL),(65,'2024-01-31','2024-01-31','78','papier',1,'administration','fournisseur a',NULL),(66,'2024-01-31','2024-01-31','15','probook',23,'departementInformatique','fourniseur1',NULL),(67,'2024-01-31','2024-01-31','20','macbook',1,'administration','fournis',NULL),(71,'2024-01-31',NULL,'A14','pcmacbook',NULL,'departementInformatique','fournisseur2',NULL);
/*!40000 ALTER TABLE `materiel` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-02  0:14:25
