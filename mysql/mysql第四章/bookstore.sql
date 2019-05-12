/*
Navicat MySQL Data Transfer

Source Server         : localhost_3307
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : bookstore

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2019-04-16 15:38:57
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
-- Table structure for studentinfo
-- ----------------------------
DROP TABLE IF EXISTS `studentinfo`;
CREATE TABLE `studentinfo` (
  `studentid` char(10) DEFAULT NULL,
  `studentname` varchar(10) NOT NULL,
  `gender` char(2) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `birthday` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of studentinfo
-- ----------------------------
INSERT INTO `studentinfo` VALUES ('2015001006', '司志清', '男', null, '1971');
INSERT INTO `studentinfo` VALUES ('2015001001', '赵六', '女', '19', '1963');
INSERT INTO `studentinfo` VALUES ('2015001005', '丁青', '女', null, '1971');
INSERT INTO `studentinfo` VALUES ('2015001002', '张翰', '男', '20', '1986');
INSERT INTO `studentinfo` VALUES ('2015001003', '张三', '女', '20', '1971');
INSERT INTO `studentinfo` VALUES ('2015001004', '张耀仁', '男', '20', '1972');
INSERT INTO `studentinfo` VALUES ('2015001007', '李四', '男', '25', '1992');
INSERT INTO `studentinfo` VALUES ('2015001009', '王俊', '男', '22', '1986');
INSERT INTO `studentinfo` VALUES ('2015001010', '李勇', '男', '22', '1992');
INSERT INTO `studentinfo` VALUES ('2015001011', '王五', '男', '22', '1979');
INSERT INTO `studentinfo` VALUES ('2015001012', '许名瑶', '女', '21', '1986');

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `studentid` char(10) DEFAULT NULL,
  `studentname` varchar(16) DEFAULT NULL,
  `gender` char(2) DEFAULT '男',
  `age` int(11) DEFAULT NULL,
  `city` varchar(60) DEFAULT NULL,
  `province` varchar(60) DEFAULT NULL,
  `classid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of students
-- ----------------------------
INSERT INTO `students` VALUES ('2015001002', '张耀仁', '男', '20', '商丘', '河南', '1');
INSERT INTO `students` VALUES ('2015001004', '徐明耀', '女', '21', '周口', '河南', '2');
INSERT INTO `students` VALUES ('2015001005', '张韩', '男', '20', '郑州', '河南', '1');
INSERT INTO `students` VALUES ('2015001006', '司志清', '男', null, null, '河南', '1');
