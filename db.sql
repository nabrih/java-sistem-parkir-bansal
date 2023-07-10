/*
SQLyog Ultimate v12.5.1 (32 bit)
MySQL - 10.1.39-MariaDB : Database - sistemparkir
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `parkir` */

CREATE TABLE `parkir` (
  `nopol` varchar(10) NOT NULL,
  `jenis_kendaraan` varchar(10) NOT NULL,
  `waktu_masuk` timestamp NULL DEFAULT NULL,
  `waktu_keluar` timestamp NULL DEFAULT NULL,
  `biaya` int(11) DEFAULT NULL,
  `operator_masuk` varchar(20) DEFAULT NULL,
  `operator_keluar` varchar(20) DEFAULT NULL,
  KEY `nopol` (`nopol`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `parkir` */

insert  into `parkir`(`nopol`,`jenis_kendaraan`,`waktu_masuk`,`waktu_keluar`,`biaya`,`operator_masuk`,`operator_keluar`) values 
('B123ABC','Mobil','2023-07-10 11:57:03','2023-07-10 17:48:58',NULL,'admin',NULL),
('B1AB','Mobil','2023-07-10 11:58:05',NULL,NULL,'op',NULL),
('B123A','Mobil','2023-07-10 17:25:11',NULL,NULL,'admin',NULL),
('B123C','Motor','2023-07-10 11:58:05','2023-07-10 19:02:05',14000,'admin','admin');

/*Table structure for table `user` */

CREATE TABLE `user` (
  `kode` varchar(20) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `jenis_user` varchar(20) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`kode`,`nama`,`jenis_user`,`password`) values 
('admin','joni123','Admin','123'),
('op','OP 1','Operator','123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
