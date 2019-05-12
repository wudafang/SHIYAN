/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : bookshop

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2019-04-12 16:45:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bookcate
-- ----------------------------
DROP TABLE IF EXISTS `bookcate`;
CREATE TABLE `bookcate` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bookcate
-- ----------------------------
INSERT INTO `bookcate` VALUES ('1', '小说');
INSERT INTO `bookcate` VALUES ('2', '文学');
INSERT INTO `bookcate` VALUES ('3', 'IT');

-- ----------------------------
-- Table structure for bookstore
-- ----------------------------
DROP TABLE IF EXISTS `bookstore`;
CREATE TABLE `bookstore` (
  `bisbn` int(11) NOT NULL AUTO_INCREMENT,
  `bname` varchar(60) NOT NULL,
  `author` varchar(60) NOT NULL,
  `tid` int(11) DEFAULT NULL,
  `pubid` int(11) DEFAULT NULL,
  `bprice` int(11) DEFAULT NULL,
  `bsum` int(11) DEFAULT NULL,
  `currcount` int(11) DEFAULT NULL,
  `bshelves` varchar(60) DEFAULT NULL,
  `bdesc` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`bisbn`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bookstore
-- ----------------------------
INSERT INTO `bookstore` VALUES ('1', '小时代', '郭敬明', '101', '13', '56', '10', '9', '一楼三排003列', '适合16~35岁人群');
INSERT INTO `bookstore` VALUES ('2', '雾都孤儿', '狄更斯', '102', '11', '49', '10', '10', '二楼四排001列', '适合12~45岁人群');
INSERT INTO `bookstore` VALUES ('3', '时间简史', '霍金', '103', '12', '59', '10', '10', '三楼四排005列', '适合14~45岁人群');
INSERT INTO `bookstore` VALUES ('4', 'java编程语言', 'java之父', '104', '13', '49', '15', '15', '二楼四排004列', '适合14~40岁人群');
INSERT INTO `bookstore` VALUES ('5', '呐喊', '鲁迅', '101', '11', '59', '30', '30', '一楼三排002列', '适合16~50岁人群');

-- ----------------------------
-- Table structure for newreader
-- ----------------------------
DROP TABLE IF EXISTS `newreader`;
CREATE TABLE `newreader` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `rname` varchar(20) NOT NULL,
  `rpwd` varchar(20) NOT NULL,
  `typeid` int(11) DEFAULT NULL,
  `rgender` varchar(20) NOT NULL,
  `rbirthday` varchar(20) NOT NULL,
  `regdate` varchar(20) NOT NULL,
  `idcard` varchar(20) NOT NULL,
  `rphone` varchar(20) DEFAULT NULL,
  `remail` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`rid`),
  UNIQUE KEY `idcard` (`idcard`),
  KEY `typeid` (`typeid`),
  CONSTRAINT `newreader_ibfk_1` FOREIGN KEY (`typeid`) REFERENCES `reader` (`typeid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of newreader
-- ----------------------------
INSERT INTO `newreader` VALUES ('1', '李欣', '1234565', '1', '女', '27-10月-1995', '22-12月-2015', '4130261957465464', '13454354', '1111@qq.com');
INSERT INTO `newreader` VALUES ('2', '李宇', '1234565', '2', '男', '27-10月-1995', '10-3月-2015', '4130261957465436', '13454354', '8888@qq.com');
INSERT INTO `newreader` VALUES ('3', '徐华然', '1234565', '3', '男', '27-10月-1995', '10-2月-2015', '4130261957465415', '13454354', '6666@qq.com');
INSERT INTO `newreader` VALUES ('4', '李玉', '1234565', '4', '男', '27-10月-1995', '22-12月-2015', '4130261957465454', '13454547', '9999@qq.com');

-- ----------------------------
-- Table structure for publish
-- ----------------------------
DROP TABLE IF EXISTS `publish`;
CREATE TABLE `publish` (
  `pubid` int(11) NOT NULL AUTO_INCREMENT,
  `pubname` varchar(100) NOT NULL,
  PRIMARY KEY (`pubid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of publish
-- ----------------------------
INSERT INTO `publish` VALUES ('1', '人民出版社');
INSERT INTO `publish` VALUES ('2', '北京出版社');
INSERT INTO `publish` VALUES ('3', '河北出版社');

-- ----------------------------
-- Table structure for reader
-- ----------------------------
DROP TABLE IF EXISTS `reader`;
CREATE TABLE `reader` (
  `typeid` int(11) NOT NULL AUTO_INCREMENT,
  `typename` varchar(20) NOT NULL,
  `foregift` int(11) NOT NULL,
  `otimecost` int(11) DEFAULT NULL,
  `borrsum` int(11) NOT NULL,
  `losepro` int(11) DEFAULT NULL,
  PRIMARY KEY (`typeid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reader
-- ----------------------------
INSERT INTO `reader` VALUES ('1', 'a', '1', '1', '1', '1');
INSERT INTO `reader` VALUES ('2', 'b', '2', '2', '2', '2');
INSERT INTO `reader` VALUES ('3', 'c', '2', '2', '2', '2');
INSERT INTO `reader` VALUES ('4', 'd', '3', '3', '3', '3');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(60) DEFAULT NULL,
  `userpwd` int(11) DEFAULT NULL,
  `roleid` int(11) DEFAULT '0',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'admin', '123123', '1');
INSERT INTO `users` VALUES ('2', 'tom', '456456', '0');
INSERT INTO `users` VALUES ('3', 'jerry', '789789', '0');
