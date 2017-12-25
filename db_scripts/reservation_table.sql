CREATE TABLE `RESERVATION` (
  `reservation_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `booking_date` datetime NOT NULL,
  `reservation_start_time` datetime NOT NULL,
  `reservation_end_date` datetime NOT NULL,
  `payment_total` double NOT NULL,
  `location_id` bigint(20) NOT NULL,
  `customer_id` bigint(20) NOT NULL,
  `surge_percentage` double DEFAULT NULL,
  `rating_id` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`reservation_id`),
  KEY `RESERVATION_CUSTOMER_FK` (`customer_id`),
  KEY `RESERVATION_LOCATION_FK` (`location_id`),
  CONSTRAINT `RESERVATION_CUSTOMER_FK` FOREIGN KEY (`customer_id`) REFERENCES `CUSTOMER` (`customer_id`),
  CONSTRAINT `RESERVATION_LOCATION_FK` FOREIGN KEY (`location_id`) REFERENCES `LOCATION` (`location_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
