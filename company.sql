/*
SQLyog v10.2 
MySQL - 5.1.73-community : Database - company
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`company` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `company`;

/*Table structure for table `aos` */

DROP TABLE IF EXISTS `aos`;

CREATE TABLE `aos` (
  `id` int(11) NOT NULL,
  `name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `tel` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `aos` */

insert  into `aos`(`id`,`name`,`age`,`tel`,`address`) values (0,'dd',2,'dddgg','fff'),(1,'dd',2,'dddgg','fff');

/*Table structure for table `base_information` */

DROP TABLE IF EXISTS `base_information`;

CREATE TABLE `base_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) COLLATE utf8_unicode_ci DEFAULT '0',
  `message` varchar(500) COLLATE utf8_unicode_ci DEFAULT '0',
  `enable` bit(1) DEFAULT b'1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `base_information` */

insert  into `base_information`(`id`,`title`,`message`,`enable`) values (1,'简介','XX网站策划股份有限公司成立于20XX年,注册资金80万,是XX一家专业的网站策划公司。公司主要服务于中小企业,提供网站策划,网站设计制作建设,网络推广营销于一体的专业服务。公司以“专注网站,用心服务”为核心价值,希望通过我们的专业水平和不懈努力,重塑中小企业网络形象,为企业产品推广,文化建设传播提供服务指导。',''),(2,'产品','0',''),(3,'服务','0',''),(4,'联系我们','(800)1444 000 4040',''),(5,'图标','../images/logo.png',''),(6,'专注网站,用心服务','../images/quote-image1.jpg','');

/*Table structure for table `contact_us` */

DROP TABLE IF EXISTS `contact_us`;

CREATE TABLE `contact_us` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `contact_method` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `message` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `enable` bit(1) DEFAULT b'1',
  `subject` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `contact_us` */

insert  into `contact_us`(`id`,`name`,`contact_method`,`message`,`enable`,`subject`) values (1,'bin','ssss','xxxxx','','sfa'),(2,'1','2','3','','4'),(3,'1','2','3','','4'),(9,'段彬彬','1123','就困了就哭了','','绿色减肥可立即付款了对方就看了大家来看'),(10,'水电费是是是1213','222','22','','22'),(11,'水电费是是是1213','222','22','','22'),(12,'水电费是是是1213','222','22','','22'),(13,'张国强','18561324671','订购毛衣','','买三个毛何以'),(14,'Name','Email Address','Subject','','Message'),(15,'fg','dfg','dfg','','dfgdf');

/*Table structure for table `images_file` */

DROP TABLE IF EXISTS `images_file`;

CREATE TABLE `images_file` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `file_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_desc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_path` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_type` int(11) DEFAULT '1' COMMENT '1.大屏滚动，2.小页面展示，31.小,32,大图',
  `enable` bit(1) DEFAULT b'1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `images_file` */

insert  into `images_file`(`id`,`file_name`,`file_desc`,`file_path`,`file_type`,`enable`) values (18,'服装1','漂亮','../images/aaa.jpg',2,''),(19,'服装2','漂亮','../images/bbbb.jpg',2,''),(20,'服装三','漂亮','../images/sdf.jpg',2,''),(21,'服装4','漂亮','../images/eee.jpg',2,''),(22,'服装5','漂亮','../images/ffff.jpg',2,''),(23,'服装6','漂亮','../images/ccc.jpg',2,''),(24,'服装7','漂亮','../images/ddd.jpg',2,''),(26,'爱丽','阿狸','images/rBACE1KBtMiRftiIAABJjjHzuXo146.png',2,''),(31,'图片1','描述信息','../images/1sdfsdf.jpg',31,''),(32,'图片2','描述','../images/1sdfds.jpg',31,''),(33,'图片3','描述','../images/1sdfdsf.jpg',31,''),(34,'图片4','描述','../images/1sdfsf.jpg',31,''),(36,'图片1','描述','../images/2werwqer.jpg',32,''),(37,'图片2','描述','../images/2sfsd.jpg',32,''),(38,'图片3','描述','../images/2dsfsf.jpg',32,''),(39,'图片4','描述','../images/2dfsd.jpg',32,'');

/*Table structure for table `user_message` */

DROP TABLE IF EXISTS `user_message`;

CREATE TABLE `user_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_password` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `enable` bit(1) DEFAULT b'1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `user_message` */

insert  into `user_message`(`id`,`user_name`,`user_password`,`enable`) values (1,'admin','11','');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
