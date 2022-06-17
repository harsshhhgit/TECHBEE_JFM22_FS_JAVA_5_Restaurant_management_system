-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: restaurant_management_system
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking` (
  `booking_id` bigint NOT NULL,
  `date` date DEFAULT NULL,
  `full_name` varchar(255) DEFAULT NULL,
  `people` int DEFAULT NULL,
  `phone_number` bigint DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `venue` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`booking_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (8001,'2020-02-20','Ajith',4,1313131313,'10:08 PM','BAR'),(8051,'2019-04-14','Noah',5,1313122222,'8:03 PM','TABLE'),(8052,'2019-04-15','Sadie Sink',4,3333322222,'6:00 PM','LOUNGE'),(8053,'2019-06-15','Suzie',10,4444422222,'8:30 PM','BAR'),(8054,'2019-06-29','Gabriella Pizzolo',2,4444466666,'8:30 PM','TABLE'),(8102,'2022-06-17','Mike',2,9999988888,'20:30','BAR');
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking_seq`
--

DROP TABLE IF EXISTS `booking_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking_seq`
--

LOCK TABLES `booking_seq` WRITE;
/*!40000 ALTER TABLE `booking_seq` DISABLE KEYS */;
INSERT INTO `booking_seq` VALUES (8200);
/*!40000 ALTER TABLE `booking_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `feedback_id` bigint NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`feedback_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES (8000,'The food served was of best quality','harsha@gmail.com','Harsha','Good Food');
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback_seq`
--

DROP TABLE IF EXISTS `feedback_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback_seq`
--

LOCK TABLES `feedback_seq` WRITE;
/*!40000 ALTER TABLE `feedback_seq` DISABLE KEYS */;
INSERT INTO `feedback_seq` VALUES (8050);
/*!40000 ALTER TABLE `feedback_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (3);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventory` (
  `ingredient_id` bigint NOT NULL,
  `ingredient_name` varchar(255) DEFAULT NULL,
  `ingredient_quantity` varchar(255) DEFAULT NULL,
  `supplier_id` bigint DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ingredient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES (2000,'Salt','12',4001,'Spices'),(2001,'pepper','10',4002,'Spices'),(2002,'Vinegar','11',4003,'Sauces'),(2003,'Soya sauce','11',4004,'Sauces'),(2004,'Ketchup','14',4005,'Sauces'),(2005,'Mustard','13',4006,'Spices'),(2006,'Sugar','12',4007,'Spices'),(2007,'Bay Leaves','123',4008,'Spices'),(2008,'Cheese','20',4001,'Dairy'),(2009,'Milk','30',4002,'Dairy'),(2010,'Eggs','100',4003,'Non Veg'),(2011,'Yogurt','3',4006,'Dairy'),(2012,'Butter','32',4005,'Dairy'),(2013,'Banana','33',4006,'Fruits'),(2014,'Apple','44',4007,'Fruits'),(2015,'Guava','34',4000,'Fruits'),(2016,'Grapes','34',4008,'Fruits'),(2017,'Orange','13',4003,'Fruits'),(2018,'Kiwi','13',4006,'Fruits'),(2019,'Cherry','13',4005,'Fruits');
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory_seq`
--

DROP TABLE IF EXISTS `inventory_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventory_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory_seq`
--

LOCK TABLES `inventory_seq` WRITE;
/*!40000 ALTER TABLE `inventory_seq` DISABLE KEYS */;
INSERT INTO `inventory_seq` VALUES (2100);
/*!40000 ALTER TABLE `inventory_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menu` (
  `menu_id` bigint NOT NULL,
  `menu_name` varchar(255) DEFAULT NULL,
  `menu_price` bigint DEFAULT NULL,
  `menu_quantity` bigint DEFAULT NULL,
  `menu_status` varchar(255) DEFAULT NULL,
  `menu_url` varchar(255) DEFAULT NULL,
  `cook_time` varchar(255) DEFAULT NULL,
  `favorite` varchar(255) DEFAULT NULL,
  `star_rating` varchar(255) DEFAULT NULL,
  `origin` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1000,'Aloo Prantha',47,30,'Available','https://drive.google.com/thumbnail?id=1e1OrW7I9Hl_YMFEYaWG4ikUVZDdPnryn','20-30','true','4','Lucknow'),(1001,'Masala Dosa',16,15,'Unavailable','https://drive.google.com/thumbnail?id=1sfLKQXTDRBpl8AV5jkG68p9AYe7XnaHe','10-20','true','4.5','Delhi'),(1002,'Poha',43,20,'Available','https://drive.google.com/thumbnail?id=1WoJvd58bK1FIYjBDuwBlfhG6zM5DeJfk','20-30','false','3.5','Lucknow'),(1003,'Sandwich',3,25,'Available','https://drive.google.com/thumbnail?id=1b3EyJBvuAgdwCiYrwkU60n2Pn9mpCj2e','10-20','false','4','Dharamshala'),(1004,'Pasta',85,10,'Unavailable','https://drive.google.com/thumbnail?id=149SmGOM2PeMfnBaCGEixavRXpCRxPWzc','10-20','true','4.5','Mumbai'),(1005,'Oats',21,12,'Available','https://drive.google.com/thumbnail?id=1O8Y7NGaO-K9-ygWn4TnD11E4FPGiB3QX','5-10','true','3.5','Indore'),(1006,'Idli Sambar',32,22,'Unavailable','https://drive.google.com/thumbnail?id=1XgGisSGCf1c5D9ocGhYrQmzvhQ-ch4sb','10-20','true','4.5','Delhi'),(1007,'Avocado Toast',10,19,'Available','https://drive.google.com/thumbnail?id=1CAIxwOhy3Lo-rAag5DvEru-Ho0pDtmY7','10-20','false','3','Shimla'),(1008,'Manchurian',13,27,'Available','https://drive.google.com/thumbnail?id=17weNmu-M36ChT5-jv6eOmnw0bEaoL66W','20-25','true','4','Kanpur'),(1009,'Kadai Paneer',37,50,'Unavailable','https://drive.google.com/thumbnail?id=1bIyMYg3YcLRimTsOAww4syI_qg_CzbnK','30-40','false','4.5','Lucknow'),(1010,'Veg Biryani',13,23,'Available','https://drive.google.com/thumbnail?id=1jxhu2tE0h9Zn261Q2U2s_n0HhEb5DFTA','20-25','false','4.3','Kolkata'),(1011,'Dal Makhni',37,12,'Unavailable','https://drive.google.com/thumbnail?id=1CTfN4i9psV0hXmH7J1_hex6jOBEp16s5','20-25','false','4.3','Delhi'),(1012,'Omlet',17,50,'Available','https://drive.google.com/thumbnail?id=1HE0IYYZLj1Zek25GxJ239mJjROHJKq5Z','10-20','true','4','Chennai'),(1013,'Egg Toast',20,25,'Available','https://drive.google.com/thumbnail?id=1t9JEzYUGqUJ0bvKB6zXmxlY0WTfR9mqW','20-30','false','3.4','Hyderabad'),(1014,'Eggs',45,40,'Available','https://drive.google.com/thumbnail?id=1uOFiLkUDy1QziJ2QiwFazHv7yUC8h7Q_','10-20','false','3','Jaipur');
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_seq`
--

DROP TABLE IF EXISTS `menu_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menu_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_seq`
--

LOCK TABLES `menu_seq` WRITE;
/*!40000 ALTER TABLE `menu_seq` DISABLE KEYS */;
INSERT INTO `menu_seq` VALUES (1100);
/*!40000 ALTER TABLE `menu_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_seq`
--

DROP TABLE IF EXISTS `order_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_seq`
--

LOCK TABLES `order_seq` WRITE;
/*!40000 ALTER TABLE `order_seq` DISABLE KEYS */;
INSERT INTO `order_seq` VALUES (6000);
/*!40000 ALTER TABLE `order_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_status`
--

DROP TABLE IF EXISTS `order_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_status` (
  `order_id` bigint NOT NULL,
  `customer_id` bigint DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_status`
--

LOCK TABLES `order_status` WRITE;
/*!40000 ALTER TABLE `order_status` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `designation` varchar(255) DEFAULT NULL,
  `email_id` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone_number` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (2,'Chef','harsh@gmail.com','Harsha','...',1111122231),(3,'Staff','ashishyadav@gmail.com','Ashish ','yadav',5639748939),(4,'Staff','sankalpy2@mail.com','Sankalp ','yadav',56472910),(5,'Chef','arpita.sin@gmail.com','Arpita','singh',9128764523),(6,'Chef','sap.choudhary@gmail.com','Sapna','Choudhary',78985643),(7,'Staff','cr.7@gmail.com','Cristian ','Ronaldo',8976453221),(8,'Staff','mess.pot@gmail.com','Messi','pots',87654532),(9,'Chef','rdjunior@gmail.com','Robert d','junior',78954362),(10,'Chef','an.bassi@gmail.com','anubhav','bassi',78653298);
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `supplier` (
  `supplier_id` bigint NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `email_id` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone_number` bigint DEFAULT NULL,
  PRIMARY KEY (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (4000,'allahabad','aarush@gmail.com','Aarush','sharma',78654312),(4001,'Chandigarh','abhay.du@gmail.com','Abhay','dubey',987645512),(4002,'Mirzapur','aadi.singh@gmail.com','Aaditya','singh',63126728),(4003,'aagra','madhverma@gmail.com','Madhav','Verma',64532189),(4004,' Renukoot','Kanha.krishn@gmail.com','Krishan','Kanha',78564312),(4005,'Delhi','kartik@gmail.com','Kartik','rajput',67876543),(4006,'Jaipur','shoury.s@gmail.com','Shourya','soni',6754213),(4007,'Hyderabad','chris.eva@gmail.com','Chris','Evan',78789780),(4008,'Lucknow','lux.man@gmail.com','Laxman','Marco',98987655);
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier_seq`
--

DROP TABLE IF EXISTS `supplier_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `supplier_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier_seq`
--

LOCK TABLES `supplier_seq` WRITE;
/*!40000 ALTER TABLE `supplier_seq` DISABLE KEYS */;
INSERT INTO `supplier_seq` VALUES (4100);
/*!40000 ALTER TABLE `supplier_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Dhanbad','harsha@gmail.com','9090909090','Harsha','Harsh@123'),(2,'Oracle','Sunilsir@gmail.com','8080808080','Sunil Sir','Sunil@123');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-16  9:25:39
