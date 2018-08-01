-- MySQL Script generated by MySQL Workbench
-- Wed Aug  1 23:47:34 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`USER`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`USER` (
  `USER_ID` INT NOT NULL,
  `USER_FNAME` VARCHAR(45) NOT NULL,
  `USER_MNAME` VARCHAR(45) NULL,
  `USER_LNAME` VARCHAR(45) NOT NULL,
  `PLACE_OF_BIRTH` VARCHAR(45) NOT NULL,
  `DATE_OF_BIRTH` DATE NOT NULL,
  `EMAIL` VARCHAR(45) NOT NULL,
  `PHONE_NO` VARCHAR(45) NOT NULL,
  `ADDRESS` VARCHAR(150) NOT NULL,
  `NATIONALITY` VARCHAR(45) NOT NULL,
  `JOB` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`USER_ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`table1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`table1` (
)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`PASSPORT`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`PASSPORT` (
  `USER_ID` INT NOT NULL,
  `PASSPORT_NO` INT NOT NULL,
  `PASSPORT_ISSUE_DATE` DATE NOT NULL,
  `PASSPORT_EXPIRY_DATE` DATE NOT NULL,
  `PASSPORT_TYPE` VARCHAR(45) NOT NULL,
  `USER_USER_ID` INT NOT NULL,
  PRIMARY KEY (`USER_ID`, `USER_USER_ID`),
  INDEX `fk_PASSPORT_USER_idx` (`USER_USER_ID` ASC),
  CONSTRAINT `fk_PASSPORT_USER`
    FOREIGN KEY (`USER_USER_ID`)
    REFERENCES `mydb`.`USER` (`USER_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`visa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`visa` (
  `VISA_ID` INT NOT NULL,
  `VISA_TYPE` VARCHAR(45) NOT NULL,
  `ISSUE_DATE` DATE NOT NULL,
  `VALIDITY` INT NOT NULL,
  `DURATION_OF_STAY` INT NOT NULL,
  `ISSUE_OFFICE` VARCHAR(45) NOT NULL,
  `PURPOSE` VARCHAR(100) NOT NULL,
  `FEES` INT NOT NULL,
  `NUMBER_OF_ENTRIES` INT NOT NULL,
  `COMPANION` INT NOT NULL,
  `WORK_PERMIT` VARCHAR(45) NOT NULL,
  `VISA_OFFICER` VARCHAR(45) NOT NULL,
  `STATUES` VARCHAR(45) NOT NULL,
  `PASSPORT_USER_ID` INT NOT NULL,
  `PASSPORT_USER_USER_ID` INT NOT NULL,
  PRIMARY KEY (`VISA_ID`, `PASSPORT_USER_ID`, `PASSPORT_USER_USER_ID`),
  INDEX `fk_visa_PASSPORT1_idx` (`PASSPORT_USER_ID` ASC, `PASSPORT_USER_USER_ID` ASC),
  CONSTRAINT `fk_visa_PASSPORT1`
    FOREIGN KEY (`PASSPORT_USER_ID` , `PASSPORT_USER_USER_ID`)
    REFERENCES `mydb`.`PASSPORT` (`USER_ID` , `USER_USER_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
