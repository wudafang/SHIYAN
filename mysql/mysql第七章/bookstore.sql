/*
Navicat MySQL Data Transfer

Source Server         : localhost_3307
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : bookstore

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2019-04-25 11:37:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `bookname` varchar(60) DEFAULT NULL,
  `bookautor` varchar(60) DEFAULT NULL,
  `bookid` int(11) DEFAULT NULL,
  `bookpeople` varchar(60) DEFAULT NULL,
  `bookbh` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES ('小时代', '郭敬明', '13', '适合16~35岁人群', '101');
INSERT INTO `books` VALUES ('雾都孤儿', '狄更斯', '11', '适合12~35岁人群', '102');
INSERT INTO `books` VALUES ('时间简史', '霍金', '12', '适合14~45岁人群', '103');
INSERT INTO `books` VALUES ('java编程语言', 'java之父', '13', '适合14~40岁人群', '104');
INSERT INTO `books` VALUES ('呐喊', '鲁迅', '11', '适合16~50岁人群', '105');
INSERT INTO `books` VALUES ('丧钟为谁而鸣', '海明威', '11', '适合16~40岁人群', '106');
INSERT INTO `books` VALUES ('失控', '凯文凯利', '12', '适合14~40岁人群', '107');
INSERT INTO `books` VALUES ('java编程思想', 'BruceEckel', '13', '适合14~40岁人群', '108');
INSERT INTO `books` VALUES ('红与黑', '司汤达', '11', '适合16~35岁人群', '109');
INSERT INTO `books` VALUES ('长尾理论', '克里斯安德森', '12', '适合14~40岁人群', '110');
INSERT INTO `books` VALUES ('java核心技术', 'cayhorstmann', '13', '适合12~50岁人群', '111');
INSERT INTO `books` VALUES ('女神', '郭沫若', '13', '适合16~55岁人群', '112');
INSERT INTO `books` VALUES ('悲惨世界', '雨果', '12', '适合16~45岁人群', '113');
INSERT INTO `books` VALUES ('未来湿是', '克莱舎基', '13', '适合14~40岁人群', '114');
INSERT INTO `books` VALUES ('精通struts', '孙卫琴', '12', '适合14~40岁人群', '115');
INSERT INTO `books` VALUES ('骆驼祥子', '老舍', '11', '适合16~50岁人群', '116');
INSERT INTO `books` VALUES ('战争与和平', '托尔斯泰', '11', '适合5~15岁人群', '117');

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
  `gender` char(2) DEFAULT NULL,
  PRIMARY KEY (`bisbn`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bookstore
-- ----------------------------
INSERT INTO `bookstore` VALUES ('1', '小时代', '郭敬明', '101', '13', '56', '10', '9', '一楼三排003列', '适合16~35岁人群', '男');
INSERT INTO `bookstore` VALUES ('2', '雾都孤儿', '狄更斯', '102', '11', '49', '10', '10', '二楼四排001列', '适合12~45岁人群', '女');
INSERT INTO `bookstore` VALUES ('3', '时间简史', '霍金', '103', '12', '59', '10', '10', '三楼四排005列', '适合14~45岁人群', '男');
INSERT INTO `bookstore` VALUES ('4', 'java编程语言', 'java之父', '104', '13', '49', '15', '15', '二楼四排004列', '适合14~40岁人群', '男');
INSERT INTO `bookstore` VALUES ('5', 'java语言', 'java', '104', '13', '20', '15', '15', '二楼四排004列', '适合14~40岁人群', '男');
INSERT INTO `bookstore` VALUES ('6', '呐喊', '鲁迅', '101', '11', '59', '30', '30', '一楼三排002列', '适合16~50岁人群', '女');

-- ----------------------------
-- Table structure for bumen
-- ----------------------------
DROP TABLE IF EXISTS `bumen`;
CREATE TABLE `bumen` (
  `deptno` int(11) NOT NULL,
  `dname` varchar(45) NOT NULL,
  `loc` varchar(45) NOT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bumen
-- ----------------------------
INSERT INTO `bumen` VALUES ('10', 'accounting', 'new york');
INSERT INTO `bumen` VALUES ('20', 'research', 'dallas');
INSERT INTO `bumen` VALUES ('30', 'sales', 'chicago');
INSERT INTO `bumen` VALUES ('40', 'operations', 'boston');

-- ----------------------------
-- Table structure for classinfo
-- ----------------------------
DROP TABLE IF EXISTS `classinfo`;
CREATE TABLE `classinfo` (
  `cId` int(11) NOT NULL,
  `className` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classinfo
-- ----------------------------
INSERT INTO `classinfo` VALUES ('1601', '网开1班');
INSERT INTO `classinfo` VALUES ('1602', '网开2班');
INSERT INTO `classinfo` VALUES ('1603', '电商1班');
INSERT INTO `classinfo` VALUES ('1604', '电商2班');

-- ----------------------------
-- Table structure for exam
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `studentId` int(11) NOT NULL COMMENT '学生编号',
  `subjectId` int(11) NOT NULL COMMENT '科目编号',
  `score` int(11) DEFAULT NULL COMMENT '分数',
  PRIMARY KEY (`id`),
  KEY `subjectId` (`subjectId`),
  KEY `studentId` (`studentId`),
  CONSTRAINT `exam_ibfk_1` FOREIGN KEY (`subjectId`) REFERENCES `subject` (`subjectId`),
  CONSTRAINT `exam_ibfk_2` FOREIGN KEY (`studentId`) REFERENCES `studentinfo` (`sId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam
-- ----------------------------
INSERT INTO `exam` VALUES ('4', '6', '1', '100');
INSERT INTO `exam` VALUES ('5', '6', '2', '42');
INSERT INTO `exam` VALUES ('6', '6', '3', '94');
INSERT INTO `exam` VALUES ('7', '7', '1', '100');
INSERT INTO `exam` VALUES ('8', '7', '2', '66');
INSERT INTO `exam` VALUES ('9', '7', '3', '79');
INSERT INTO `exam` VALUES ('10', '12', '1', '80');
INSERT INTO `exam` VALUES ('11', '12', '2', '60');
INSERT INTO `exam` VALUES ('12', '12', '3', '90');

-- ----------------------------
-- Table structure for gongzi
-- ----------------------------
DROP TABLE IF EXISTS `gongzi`;
CREATE TABLE `gongzi` (
  `grade` int(11) NOT NULL,
  `losal` int(11) DEFAULT NULL,
  `hisal` int(11) DEFAULT NULL,
  PRIMARY KEY (`grade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gongzi
-- ----------------------------
INSERT INTO `gongzi` VALUES ('1', '700', '1200');
INSERT INTO `gongzi` VALUES ('2', '1201', '1400');
INSERT INTO `gongzi` VALUES ('3', '1401', '2000');
INSERT INTO `gongzi` VALUES ('4', '2001', '3000');
INSERT INTO `gongzi` VALUES ('5', '3001', '9999');

-- ----------------------------
-- Table structure for guyuan
-- ----------------------------
DROP TABLE IF EXISTS `guyuan`;
CREATE TABLE `guyuan` (
  `empno` int(11) NOT NULL,
  `ename` varchar(45) DEFAULT NULL,
  `job` varchar(45) DEFAULT NULL,
  `mgr` int(11) DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `sal` int(11) DEFAULT NULL,
  `comm` int(11) DEFAULT NULL,
  `deptno` int(11) DEFAULT NULL,
  PRIMARY KEY (`empno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of guyuan
-- ----------------------------
INSERT INTO `guyuan` VALUES ('7369', 'smith', 'clerk', '7902', '1980-12-17', '800', null, '20');
INSERT INTO `guyuan` VALUES ('7499', 'allen', 'salesman', '7698', '1981-02-20', '1600', '300', '30');
INSERT INTO `guyuan` VALUES ('7521', 'ward', 'salesman', '7698', '1981-02-22', '1250', '500', '30');
INSERT INTO `guyuan` VALUES ('7566', 'jones', 'manager', '7839', '1981-04-02', '3975', null, '20');
INSERT I