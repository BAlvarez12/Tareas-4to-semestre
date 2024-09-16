CREATE DATABASE  IF NOT EXISTS `actividad_3` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `actividad_3`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: actividad_3
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `docente`
--

DROP TABLE IF EXISTS `docente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `docente` (
  `id_docente` int NOT NULL AUTO_INCREMENT,
  `codigo_docente` varchar(15) DEFAULT NULL,
  `salario` decimal(10,2) DEFAULT NULL,
  `ingreso_laboral` date DEFAULT NULL,
  `fecha_registro` datetime DEFAULT NULL,
  PRIMARY KEY (`id_docente`),
  KEY `codigo_docente_idx` (`codigo_docente`),
  CONSTRAINT `Docente_persona` FOREIGN KEY (`codigo_docente`) REFERENCES `persona` (`codigo_docente`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docente`
--

LOCK TABLES `docente` WRITE;
/*!40000 ALTER TABLE `docente` DISABLE KEYS */;
INSERT INTO `docente` VALUES (1,'D0001',3000.00,'2024-09-15','2024-09-15 21:18:24'),(2,'D0002',3000.00,'2024-09-16','2024-09-15 00:00:00'),(3,'D0003',5000.00,'2024-09-20','2024-09-15 15:22:12'),(4,'D0004',5000.00,'1999-08-08','2024-09-15 19:11:10'),(5,'D0005',5000.00,'1999-08-10','2024-09-15 19:12:02'),(6,'D0006',5233.00,'2023-01-01','2024-09-15 19:31:09'),(7,'D0007',52221.00,'1999-08-19','2024-09-15 19:33:10'),(8,'D0008',1358.00,'2000-08-08','2024-09-15 19:34:24'),(9,'D0009',1358.00,'2000-08-08','2024-09-15 19:34:53');
/*!40000 ALTER TABLE `docente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `id_persona` int NOT NULL AUTO_INCREMENT,
  `nombres` varchar(60) DEFAULT NULL,
  `apellidos` varchar(60) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `nit` varchar(15) DEFAULT NULL,
  `telefono` varchar(9) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `codigo_docente` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_persona`),
  KEY `codigo_docente_idx` (`codigo_docente`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,'Juana','Herrera','Guatemala','12235645','23564512','1998-05-20','D0001'),(2,'Maria','Gonzales','Mexico','232145','23124565','2001-03-16','D0002'),(3,'Julio','Perez','Ciudad','32564512','21326545','1999-09-20','D0003'),(6,'Carlos','Juano','Argentina','212121','3265651','1999-08-08','D0004'),(7,'Marcos','Trumba','Mexico','484814','518919','1999-08-10','D0005'),(9,'Bryann','Alvarez','Guatemala','265151','5151518','2000-09-09','D0006'),(10,'5515','15','5','5151','5','1999-08-19','D0007'),(11,'5','5','5','5','5','2000-08-08','D0008'),(12,'5','5','5','5','5','2000-08-08','D0009');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'actividad_3'
--

--
-- Dumping routines for database 'actividad_3'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-15 21:47:55
