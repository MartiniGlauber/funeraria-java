CREATE DATABASE  IF NOT EXISTS `funeraria_um_irmao` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `funeraria_um_irmao`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: funeraria_um_irmao
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `automovel`
--

DROP TABLE IF EXISTS `automovel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `automovel` (
  `id` int NOT NULL AUTO_INCREMENT,
  `modelo` varchar(50) NOT NULL,
  `km` varchar(50) NOT NULL,
  `ano_fabricacao` varchar(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `automovel`
--

LOCK TABLES `automovel` WRITE;
/*!40000 ALTER TABLE `automovel` DISABLE KEYS */;
INSERT INTO `automovel` VALUES (1,'Saveiro','15000','2020'),(2,'Montana','18000','2021'),(3,'Strada','15000','2020');
/*!40000 ALTER TABLE `automovel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cemiterio_capela`
--

DROP TABLE IF EXISTS `cemiterio_capela`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cemiterio_capela` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefone` varchar(25) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cemiterio_capela`
--

LOCK TABLES `cemiterio_capela` WRITE;
/*!40000 ALTER TABLE `cemiterio_capela` DISABLE KEYS */;
INSERT INTO `cemiterio_capela` VALUES (1,'Capela São João','saojoao@email.com','51 30213216','Porto Alegre ZN'),(2,'Capela Partenon','partenon@email.com','51 30214567','Porto Alegre ZL'),(3,'Capela Tristeza','tristeza@email.com','51 30217894','Porto Alegre ZS');
/*!40000 ALTER TABLE `cemiterio_capela` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `cpf` varchar(50) NOT NULL,
  `telefone` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (4,'João Silva','12345678911','(51) 33225544','joao@email.com','Av. Venâncio Aires, 123','Porto Alegre'),(5,'Maria Souza','98745632111','(51)32326598','maria@email.com','Av. Lima e Silva, 236 ','Porto Alegre'),(6,'Felipe Didio','45678912333','(51) 36547896','felipe@email.com','Rua Morro Santana, 564','Porto Alegre'),(7,'Celso Juarez','78965412333','(51)923456987','juarez@Rothmail.com','Av. Padre Cacique, 01','Porto Alegre'),(8,'Eduardo Pena','45678932122','(51) 32789461','eduardo@email.com','Av. 24 de outubro, 15','Porto Alegre');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `defunto`
--

DROP TABLE IF EXISTS `defunto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `defunto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `genero` varchar(50) NOT NULL,
  `data_nascimento` date NOT NULL,
  `data_obito` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `defunto`
--

LOCK TABLES `defunto` WRITE;
/*!40000 ALTER TABLE `defunto` DISABLE KEYS */;
INSERT INTO `defunto` VALUES (1,'João Oliveira','Masculino','1956-10-02','2021-11-12'),(2,'Kurt Cobain','Masculino','1971-05-02','1994-02-09'),(3,'Jimi Hendrix','Masculino','1943-02-16','1970-05-18'),(4,'Janis Joplin','Feminino','1943-01-19','1970-10-04'),(5,'Amy Winehouse','Feminino','1983-09-14','2011-07-23');
/*!40000 ALTER TABLE `defunto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fornecedor_flores`
--

DROP TABLE IF EXISTS `fornecedor_flores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedor_flores` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefone` varchar(50) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedor_flores`
--

LOCK TABLES `fornecedor_flores` WRITE;
/*!40000 ALTER TABLE `fornecedor_flores` DISABLE KEYS */;
INSERT INTO `fornecedor_flores` VALUES (1,'Floricultura Flor de Lis','flordelis@email.com','51 30212223','Porto Alegre ZN'),(2,'Floricultura Matsunaga','matsunaga@email.com','51 30216543','Porto Alegre ZL'),(3,'Floricultura Von Richtoffen','richtoffen@email.com','51 30219876','Porto Alegre ZS');
/*!40000 ALTER TABLE `fornecedor_flores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servico`
--

DROP TABLE IF EXISTS `servico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servico` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idCliente` int NOT NULL,
  `idDefunto` int NOT NULL,
  `idTipo_servico` int NOT NULL,
  `valor` float(7,2) NOT NULL,
  `idAutomovel` int NOT NULL,
  `idFornecedor_flores` int NOT NULL,
  `idCemiterio_capela` int NOT NULL,
  `idUrna_funeraria` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_cliente_servico` (`idCliente`),
  KEY `FK_defunto_servico` (`idDefunto`),
  KEY `FK_tipo_servico_servico` (`idTipo_servico`),
  KEY `FK_automovel_servico` (`idAutomovel`),
  KEY `FK_fornecedor_flores_servico` (`idFornecedor_flores`),
  KEY `FK_cemiterio_capela_servico` (`idCemiterio_capela`),
  KEY `FK_urna_funeraria_servico` (`idUrna_funeraria`),
  CONSTRAINT `FK_automovel_servico` FOREIGN KEY (`idAutomovel`) REFERENCES `automovel` (`id`),
  CONSTRAINT `FK_cemiterio_capela_servico` FOREIGN KEY (`idCemiterio_capela`) REFERENCES `cemiterio_capela` (`id`),
  CONSTRAINT `FK_cliente_servico` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`id`),
  CONSTRAINT `FK_defunto_servico` FOREIGN KEY (`idDefunto`) REFERENCES `defunto` (`id`),
  CONSTRAINT `FK_fornecedor_flores_servico` FOREIGN KEY (`idFornecedor_flores`) REFERENCES `fornecedor_flores` (`id`),
  CONSTRAINT `FK_tipo_servico_servico` FOREIGN KEY (`idTipo_servico`) REFERENCES `tipo_servico` (`id`),
  CONSTRAINT `FK_urna_funeraria_servico` FOREIGN KEY (`idUrna_funeraria`) REFERENCES `urna_funeraria` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servico`
--

LOCK TABLES `servico` WRITE;
/*!40000 ALTER TABLE `servico` DISABLE KEYS */;
INSERT INTO `servico` VALUES (5,4,1,2,12800.00,1,3,1,2);
/*!40000 ALTER TABLE `servico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_servico`
--

DROP TABLE IF EXISTS `tipo_servico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_servico` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `valor` float(7,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_servico`
--

LOCK TABLES `tipo_servico` WRITE;
/*!40000 ALTER TABLE `tipo_servico` DISABLE KEYS */;
INSERT INTO `tipo_servico` VALUES (1,'funeral',7000.00),(2,'cremação',10000.00);
/*!40000 ALTER TABLE `tipo_servico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `urna_funeraria`
--

DROP TABLE IF EXISTS `urna_funeraria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `urna_funeraria` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tamanho` varchar(50) NOT NULL,
  `categoria` varchar(50) NOT NULL,
  `valor` float(7,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `urna_funeraria`
--

LOCK TABLES `urna_funeraria` WRITE;
/*!40000 ALTER TABLE `urna_funeraria` DISABLE KEYS */;
INSERT INTO `urna_funeraria` VALUES (1,'Infantil','Standard',1500.00),(2,'Infantil','Luxo',2800.00),(3,'Adulto','Standard',3500.00),(4,'Adulto','Luxo',5500.00);
/*!40000 ALTER TABLE `urna_funeraria` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-17 23:19:02
