DROP DATABASE IF EXISTS `hotel-booking`;
CREATE DATABASE `hotel-booking`;
USE `hotel-booking`;


DROP TABLE IF EXISTS `customers`;
CREATE TABLE `customers` (
                               `customer_id` int NOT NULL AUTO_INCREMENT,
                               'customer_identity_no' int NOT NULL,
                               `customer_name ` varchar(255) DEFAULT NULL,
                               `customer_surname ` varchar(255) DEFAULT NULL,
                               `customer_phone` int DEFAULT NULL,
                               `address` varchar(255) DEFAULT NULL,
                               `room_no` int DEFAULT NULL,
                               PRIMARY KEY (`customer_id`),
                               KEY `FKdwl5vjb9x3rm7pjgyamd9ge8e` (`customer_id`),
                               --CONSTRAINT `FKdwl5vjb9x3rm7pjgyamd9ge8e` FOREIGN KEY (`reservation_user_id`) REFERENCES `user` (`user_id`)
--) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `customers` WRITE;
UNLOCK TABLES;


DROP TABLE IF EXISTS `rooms`;
CREATE TABLE `rooms` (
                               `room_no` int NOT NULL AUTO_INCREMENT,
                               `room_floor ` int DEFAULT NULL,
                               `room_status` varchar DEFAULT NULL,
                               `address` varchar(255) DEFAULT NULL,
                               `room_type` varchar(255) DEFAULT NULL,
                               'room_description' varchar(255) DEFAULT NULL,
                               PRIMARY KEY (`room_no`),
                               KEY `FKdwl5vjb9x3rm7pjgyamd9ge8e` (`room_no`),
                               --CONSTRAINT `FKdwl5vjb9x3rm7pjgyamd9ge8e` FOREIGN KEY (`reservation_user_id`) REFERENCES `user` (`user_id`)
--) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `rooms` WRITE;
UNLOCK TABLES;


DROP TABLE IF EXISTS `reservation`;
CREATE TABLE `reservation` (
                               `reservation_id` int NOT NULL AUTO_INCREMENT,
                               `reservation_from_date` datetime(6) DEFAULT NULL,
                               `reservation_num_of_children` int DEFAULT NULL,
                               `reservation_open_buffet` varchar(255) DEFAULT NULL,
                               `reservation_num_of_persons` int DEFAULT NULL,
                               `reservation_price` int DEFAULT NULL,
                               `reservation_room` varchar(255) DEFAULT NULL,
                               `reservation_num_of_rooms` int DEFAULT NULL,
                               `reservation_stay_days` int DEFAULT NULL,
                               'check_in_date' datetime(6) DEFAULT NULL ,
                               'check_out_date' datetime(6) DEFAULT NULL ,
                               `reservation_user_id` int DEFAULT NULL,
                               PRIMARY KEY (`reservation_id`),
                               KEY `FKdwl5vjb9x3rm7pjgyamd9ge8e` (`reservation_user_id`),
                               CONSTRAINT `FKdwl5vjb9x3rm7pjgyamd9ge8e` FOREIGN KEY (`reservation_user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `reservation` WRITE;
UNLOCK TABLES;

DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
                               `order_id` int NOT NULL AUTO_INCREMENT,
                               `customer_id ` int DEFAULT NULL,
                               `room_id ` int DEFAULT NULL,
                               `order_date ` datetime(6) DEFAULT NULL,
                               `order_status` varchar DEFAULT NULL,
                               `address` varchar(255) DEFAULT NULL,
                               `order_delivery_date` datetime(6) DEFAULT NULL,
                               'order_description' varchar(255) DEFAULT NULL,
                               PRIMARY KEY (`order_id`),
                               KEY `FKdwl5vjb9x3rm7pjgyamd9ge8e` (`order_id`));
                               --CONSTRAINT `FKdwl5vjb9x3rm7pjgyamd9ge8e` FOREIGN KEY (`reservation_user_id`) REFERENCES `user` (`user_id`)
--) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `orders` WRITE;
UNLOCK TABLES;


DROP TABLE IF EXISTS `order_details`;
CREATE TABLE `order_details` (
                               `order_details_id` bigint NOT NULL AUTO_INCREMENT,
                               `order_id ` bigint DEFAULT NULL,
                               `food_id ` bigint DEFAULT NULL,
                               `food_count` int DEFAULT NULL,
                               `food_price` double DEFAULT NULL,
                               `order_delivery_description` varchar(255) DEFAULT NULL,
                               PRIMARY KEY (`order_details_id`),
                               KEY `FKdwl5vjb9x3rm7pjgyamd9ge8e` (`order_details_id`));
                               --CONSTRAINT `FKdwl5vjb9x3rm7pjgyamd9ge8e` FOREIGN KEY (`reservation_user_id`) REFERENCES `user` (`user_id`)
--) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `order_details` WRITE;
UNLOCK TABLES;

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
                        `role_id` bigint NOT NULL AUTO_INCREMENT,
                        `role_name` varchar(255) DEFAULT NULL,
                        PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `role` WRITE;
INSERT INTO `role` VALUES (1,'ROLE_EMPLOYEE'),(2,'ROLE_MANAGER'),(3,'ROLE_ADMIN');
UNLOCK TABLES;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
                        `user_id` int NOT NULL AUTO_INCREMENT,
                        `user_username` varchar(45) DEFAULT NULL,
                        `user_email` varchar(45) DEFAULT NULL,
                        `user_password` varchar(60) DEFAULT NULL,
                        PRIMARY KEY (`user_id`),
                        UNIQUE KEY `client_email_UNIQUE` (`user_email`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `user` WRITE;
UNLOCK TABLES;

DROP TABLE IF EXISTS `users_roles`;
CREATE TABLE `users_roles` (
                               `user_id` int NOT NULL,
                               `role_id` bigint NOT NULL,
                               KEY `FKt4v0rrweyk393bdgt107vdx0x` (`role_id`),
                               KEY `FKgd3iendaoyh04b95ykqise6qh` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `users_roles` WRITE;
INSERT INTO `users_roles` VALUES (35,1);
UNLOCK TABLES;