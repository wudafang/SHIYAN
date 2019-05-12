/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : bookshop

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2019-04-11 13:40:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for newreader
-- ----------------------------
DROP TABLE IF EXISTS `newreader`;
CREATE TABLE `newreader` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `rname` varchar(20) NOT NULL,
  `rpwd` varchar(2) NOT NULL,
  `typeid` int(11) NOT NULL,
  `rGender` varchar(20) NOT NULL,
  `rbirthday` varchar(20) NOT NULL,
  `regdate` varchar(20) NOT NULL,
  `idcard` varchar(20) NOT NULL,
  `rphone` varchar(20) DEFAULT NULL,
  `remail` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`rid`),
  UNIQUE KEY `idcard` (`idcard`),
  KEY `typeid` (`typeid`),
  CONSTRAINT `newreader_ibfk_1` FOREIGN KEY (`typeid`) REFERENCES `reader` (`typeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of newreader
-- ----------------------------
