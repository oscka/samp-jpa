CREATE TABLE `board` (
  `num` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL,
  `contents` text,
  `write_id` varchar(10) DEFAULT NULL,
  `write_name` varchar(30) DEFAULT NULL,
  `write_date` datetime DEFAULT NULL,
  `modify_id` varchar(10) DEFAULT NULL,
  `modify_name` varchar(30) DEFAULT NULL,
  `modify_date` datetime DEFAULT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;