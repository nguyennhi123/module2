-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: fitnessgym
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,'Khóa tập yoga',700000.00000000,'yoga.jpg','Yoga là xu hướng thể thao thịnh hành nhất hiện nay, mang lại sự nhịp nhàng, dẻo dai và nhiều lợi ích cho sức khỏe.','2019-08-01 00:00:00',1,'2019-07-05 00:00:00','2019-07-05 00:00:00'),(2,'Khóa tập gym nữ',900000.00000000,'gymnu.jpg','Tập thể hình không chỉ là lựa chọn của nam giới mà rất nhiều nữ giới cũng yêu thích để có thân hình hoàn hảo.','2019-08-01 00:00:00',2,'2019-07-05 00:00:00','2019-07-05 00:00:00'),(3,'Khóa tập gym nam',900000.00000000,'gymnam.jpg','Bạn muốn có 1 cơ thể  săn chắc, cơ bụng 6 múi và sức khỏe tốt, hãy đến với chúng tôi.','2019-08-01 00:00:00',4,'2019-07-05 00:00:00','2019-07-05 00:00:00'),(4,'Khóa tập boxing',900000.00000000,'boxing.jpg','Bạn đam mê Boxing, muốn sở hữu “quả đấm thép” như các võ sĩ chuyên nghiệp? hãy đến với chúng tôi.','2019-08-01 00:00:00',5,'2019-07-05 00:00:00','2019-07-05 00:00:00');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `lesson`
--

LOCK TABLES `lesson` WRITE;
/*!40000 ALTER TABLE `lesson` DISABLE KEYS */;
INSERT INTO `lesson` VALUES (1,'7h00 - 9h00'),(2,'9h00 - 11h00'),(3,'13h00 - 15h00'),(4,'15h00 - 17h00'),(5,'17h00 - 19h00');
/*!40000 ALTER TABLE `lesson` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `personaltrainer`
--

LOCK TABLES `personaltrainer` WRITE;
/*!40000 ALTER TABLE `personaltrainer` DISABLE KEYS */;
INSERT INTO `personaltrainer` VALUES (1,'Nguyễn Văn Hùng','0973088977','Tp.Huế','Nam','pt6.jpg','2019-07-05 00:00:00','2019-07-05 00:00:00'),(2,'Nguyễn Văn Thanh','0974098777','Tp.Huế','Nam','pt7.jpg','2019-05-06 00:00:00','2019-05-06 00:00:00'),(3,'Nguyễn Văn Mạnh','0873098789','Tp.Huế','Nam','pt8.jpg','2019-06-08 00:00:00','2019-06-08 00:00:00'),(4,'Nguyễn Văn Hóa','0977880211','Tp.Huế','Nam','pt9.jpg','2019-07-01 00:00:00','2019-07-01 00:00:00'),(5,'Nguyễn Kiều Trinh','033209989','Tp.Huế','Nữ','pt1.jpg','2019-05-05 00:00:00','2019-05-05 00:00:00'),(6,'Nguyễn Thanh Thảo','0974099088','Tp.Huế','Nữ','pt3.jpg','2019-04-07 00:00:00','2019-04-07 00:00:00'),(7,'Nguyễn Thị Hiền','0977865890','Tp.Huế','Nữ','pt4.jpg','2019-07-02 00:00:00','2019-07-02 00:00:00'),(8,'Nguyễn Bá Chi','0982077888','Tp.Huế','Nữ','pt5.jpg','2019-05-02 00:00:00','2019-05-02 00:00:00');
/*!40000 ALTER TABLE `personaltrainer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','admin','2019-07-05 00:00:00','2019-07-05 00:00:00','admin');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'fitnessgym'
--

--
-- Dumping routines for database 'fitnessgym'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-05 16:37:53
