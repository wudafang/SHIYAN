-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: depdb
-- ------------------------------------------------------
-- Server version	5.7.9-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `guyuan`
--

DROP TABLE IF EXISTS `guyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guyuan` (
  `empno` int(11) NOT NULL,
  `ename` varchar(45) DEFAULT NULL,
  `job` varchar(45) DEFAULT NULL,
  `mgr` int(11) DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `sal` int(11) DEFAULT NULL,
  `comm` int(11) DEFAULT NULL,
  `deptno` int(11) DEFAULT NULL,
  PRIMARY KEY (`empno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guyuan`
--

LOCK TABLES `guyuan` WRITE;
/*!40000 ALTER TABLE `guyuan` DISABLE KEYS */;
INSERT INTO `guyuan` VALUES (7369,'smith','clerk',7902,'1980-12-17',800,NULL,20),(7499,'allen','salesman',7698,'1981-02-20',1600,300,30),(7521,'ward','salesman',7698,'1981-02-22',1250,500,30),(7566,'jones','manager',7839,'1981-04-02',3975,NULL,20),(7654,'martin','salesman',7698,'1981-09-28',1250,1400,30),(7698,'blake','manager',7839,'1981-05-01',2850,NULL,30),(7788,'scott','analyst',7566,'1987-04-19',3000,NULL,20),(7844,'turner','salesman',7698,'1981-09-08',1500,0,30),(7876,'adams','clerk',7788,'1987-05-23',1100,NULL,20),(7900,'james','clerk',7698,'1981-12-03',950,NULL,30),(7902,'ford','analyst',7566,'1981-12-03',3000,NULL,20);
/*!40000 ALTER TABLE `guyuan` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-23 11:04:55
