-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: estacion_espacial_sofka
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `categoria_nave_espacial`
--

DROP TABLE IF EXISTS `categoria_nave_espacial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria_nave_espacial` (
  `id_categoria_nave_espacial` int NOT NULL,
  `tipo` varchar(150) NOT NULL,
  `potencia_id_potencia` int NOT NULL,
  PRIMARY KEY (`id_categoria_nave_espacial`,`potencia_id_potencia`),
  KEY `fk_categoria_nave_espacial_potencia_idx` (`potencia_id_potencia`),
  CONSTRAINT `fk_categoria_nave_espacial_potencia` FOREIGN KEY (`potencia_id_potencia`) REFERENCES `potencia` (`id_potencia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria_nave_espacial`
--

LOCK TABLES `categoria_nave_espacial` WRITE;
/*!40000 ALTER TABLE `categoria_nave_espacial` DISABLE KEYS */;
INSERT INTO `categoria_nave_espacial` VALUES (1,'VehiuloLanzadera',1),(2,'NaveRobotica',2),(3,'NaveEspacialTripulada',3);
/*!40000 ALTER TABLE `categoria_nave_espacial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `combustible`
--

DROP TABLE IF EXISTS `combustible`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `combustible` (
  `id_combustible` int NOT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id_combustible`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `combustible`
--

LOCK TABLES `combustible` WRITE;
/*!40000 ALTER TABLE `combustible` DISABLE KEYS */;
INSERT INTO `combustible` VALUES (1,'Solido*+Queroseno+N(liq)'),(2,'Solido+N(liq)+O(liq)'),(3,'UDMH+N2O4'),(4,'MMM**+NO'),(5,'N2O4+UDMH'),(6,'Solido+liquido******'),(7,'NO4+UDMH'),(8,'NO+Amina'),(9,'N/A');
/*!40000 ALTER TABLE `combustible` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nave_espacial`
--

DROP TABLE IF EXISTS `nave_espacial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nave_espacial` (
  `id_nave_espacial` int NOT NULL,
  `id_categoria_nave_espacial` int NOT NULL,
  `id_combustible` int NOT NULL,
  `id_pais_de_origen` int NOT NULL,
  PRIMARY KEY (`id_nave_espacial`,`id_categoria_nave_espacial`,`id_combustible`,`id_pais_de_origen`),
  KEY `fk_nave_espacial_categoria_nave_espacial1_idx` (`id_categoria_nave_espacial`),
  KEY `fk_nave_espacial_combustible1_idx` (`id_combustible`),
  KEY `fk_nave_espacial_pais_de_origen1_idx` (`id_pais_de_origen`),
  CONSTRAINT `fk_nave_espacial_categoria_nave_espacial1` FOREIGN KEY (`id_categoria_nave_espacial`) REFERENCES `categoria_nave_espacial` (`id_categoria_nave_espacial`),
  CONSTRAINT `fk_nave_espacial_combustible1` FOREIGN KEY (`id_combustible`) REFERENCES `combustible` (`id_combustible`),
  CONSTRAINT `fk_nave_espacial_pais_de_origen1` FOREIGN KEY (`id_pais_de_origen`) REFERENCES `pais_de_origen` (`id_pais_de_origen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nave_espacial`
--

LOCK TABLES `nave_espacial` WRITE;
/*!40000 ALTER TABLE `nave_espacial` DISABLE KEYS */;
INSERT INTO `nave_espacial` VALUES (1,1,1,1),(2,1,2,2),(3,1,3,3),(4,2,4,2),(5,2,5,4),(6,2,6,1),(7,3,7,1),(8,3,8,4),(9,3,9,6);
/*!40000 ALTER TABLE `nave_espacial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pais_de_origen`
--

DROP TABLE IF EXISTS `pais_de_origen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pais_de_origen` (
  `id_pais_de_origen` int NOT NULL,
  `pais` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_pais_de_origen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pais_de_origen`
--

LOCK TABLES `pais_de_origen` WRITE;
/*!40000 ALTER TABLE `pais_de_origen` DISABLE KEYS */;
INSERT INTO `pais_de_origen` VALUES (1,'EE.UU'),(2,'Europa'),(3,'China'),(4,'Rusia'),(5,'Japon'),(6,'Canada');
/*!40000 ALTER TABLE `pais_de_origen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `potencia`
--

DROP TABLE IF EXISTS `potencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `potencia` (
  `id_potencia` int NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  PRIMARY KEY (`id_potencia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `potencia`
--

LOCK TABLES `potencia` WRITE;
/*!40000 ALTER TABLE `potencia` DISABLE KEYS */;
INSERT INTO `potencia` VALUES (1,'Alta'),(2,'Media'),(3,'Minima');
/*!40000 ALTER TABLE `potencia` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-15  1:41:26
