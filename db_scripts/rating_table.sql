CREATE TABLE `RATING` (
  `rating_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `rating` double NOT NULL,
  `description` varchar(500) NOT NULL,
  `reservation_id` bigint(20) DEFAULT NULL,
  `location_id` bigint(20) NOT NULL,
  PRIMARY KEY (`rating_id`),
  KEY `RATING_LOCATION_FK` (`location_id`),
  KEY `RATING_RESERVATION_FK` (`reservation_id`),
  CONSTRAINT `RATING_LOCATION_FK` FOREIGN KEY (`location_id`) REFERENCES `LOCATION` (`location_id`),
  CONSTRAINT `RATING_RESERVATION_FK` FOREIGN KEY (`reservation_id`) REFERENCES `RESERVATION` (`reservation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
