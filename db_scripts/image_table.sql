CREATE TABLE `IMAGE` (
  `image_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `location_id` bigint(20) NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  `url` varchar(1000) NOT NULL,
  PRIMARY KEY (`image_id`),
  KEY `IMAGES_LOCATION_FK` (`location_id`),
  CONSTRAINT `IMAGES_LOCATION_FK` FOREIGN KEY (`location_id`) REFERENCES `LOCATION` (`location_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
