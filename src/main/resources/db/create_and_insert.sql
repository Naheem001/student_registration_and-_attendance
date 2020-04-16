USE `db_student`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `student_registration`;

CREATE TABLE `student_registration` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `registration_date`	date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `student_registration` VALUES 
	(1,'Leslie','Andrews','leslie@luv2code.com', '2018-01-01'),
	(2,'Emma','Baumgarten','emma@luv2code.com', '2018-01-02'),
	(3,'Avani','Gupta','avani@luv2code.com', '2018-01-04'),
	(4,'Yuri','Petrov','yuri@luv2code.com', '2018-01-05'),
	(5,'Juan','Vega','juan@luv2code.com', '2018-01-01');

DROP TABLE IF EXISTS `students_daily_attendance`;

CREATE TABLE `students_daily_attendance` (
  `id` varchar(50) NOT NULL,
  `date` date NOT NULL,
  `isPresent` boolean NOT NULL,
  `student_id` int NOT NULL,
  CONSTRAINT `students_daily_attendance_fk` FOREIGN KEY (`student_id`) REFERENCES `student_registration` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `students_daily_attendance` VALUES 
	(1,'2018-05-01',true, 1),
	(2,'2018-05-01',false, 2),
    (3,'2018-05-01',false, 3),
    (4,'2018-05-01',true, 4),
    (5,'2018-05-01',true, 5),
	(6,'2018-05-02',true, 1),
	(7,'2018-05-02',true, 2),
    (8,'2018-05-02',true, 3),
    (9,'2018-05-02',false, 4),
    (10,'2018-05-02',false, 5),
    (11,'2018-05-03',false, 1),
	(12,'2018-05-03',false, 2),
    (13,'2018-05-03',true, 3),
    (14,'2018-05-03',true, 4),
    (15,'2018-05-03',true, 5);
   