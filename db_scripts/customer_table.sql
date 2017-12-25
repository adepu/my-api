CREATE TABLE `CUSTOMER` (
	`first_name` varchar(100) NOT NULL,
	`last_name` varchar(100) NOT NULL,
	`address_1` varchar(500) NOT NULL,
	`address_2` varchar(100) DEFAULT NULL,
	`city` varchar(100) NOT NULL,
	`state` varchar(100) NOT NULL,
	`zip` varchar(10) NOT NULL,
	`phone_number` varchar(100) NOT NULL,
	`email` varchar(250) NOT NULL,
	`date_created` datetime NOT NULL,
	`last_login` datetime NOT NULL,
	`last_updated` datetime NOT NULL,
	`customer_id` bigint(20) NOT NULL AUTO_INCREMENT,
	`renter` varchar(100) DEFAULT NULL,
	`rentee` varchar(100) DEFAULT NULL,
	PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;