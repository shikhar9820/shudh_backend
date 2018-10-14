
CREATE DATABASE `shudhdb`;
USE `shudhdb`;

CREATE TABLE `shudhdb`.`shudh_user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(45) NOT NULL,
  `user_password` VARCHAR(45) NOT NULL,
  `user_email` VARCHAR(45) NOT NULL,
  `created_time` DATETIME NOT NULL,
  PRIMARY KEY (`id`));