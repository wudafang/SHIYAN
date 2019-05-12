/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : schooldb

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2019-04-29 16:17:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `ClassID` int(11) DEFAULT NULL,
  `ClassName` varchar(9) DEFAULT NULL,
  `BeginTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `EndTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `GradeID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('1', 'S101', '2011-05-07 00:00:00', '2011-09-10 00:00:00', '1');
INSERT INTO `class` VALUES ('3', 'S102', '2011-05-07 00:00:00', '2011-09-10 00:00:00', '1');
INSERT INTO `class` VALUES ('4', 'S103', '2011-05-20 00:00:00', '2011-10-10 00:00:00', '1');
INSERT INTO `class` VALUES ('5', 'GS201', '2011-05-05 00:00:00', '2011-12-01 00:00:00', '2');
INSERT INTO `class` VALUES ('6', 'GS202', '2011-06-10 00:00:00', '2012-01-10 00:00:00', '2');
INSERT INTO `class` VALUES ('7', 'S210', '2011-03-11 00:00:00', '2011-09-11 00:00:00', '2');
INSERT INTO `class` VALUES ('8', 'Y247', '2011-04-01 00:00:00', '2012-03-10 00:00:00', '3');
INSERT INTO `class` VALUES ('9', 'S103', '2011-05-20 00:00:00', '2011-10-10 00:00:00', '1');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `DepartmentId` int(11) DEFAULT NULL,
  `DepartmentName` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '计算机系');
INSERT INTO `department` VALUES ('2', '英语系');
INSERT INTO `department` VALUES ('3', '电气自动化系');
INSERT INTO `department` VALUES ('4', '物理系');
INSERT INTO `department` VALUES ('5', '数学系');
INSERT INTO `department` VALUES ('6', '导演系');

-- ----------------------------
-- Table structure for exam
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam` (
  `ExamID` int(11) DEFAULT NULL,
  `StudentID` char(10) DEFAULT NULL,
  `SubjectId` int(11) DEFAULT NULL,
  `Exam` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam
-- ----------------------------
INSERT INTO `exam` VALUES ('1', '2011001002', '1', '67');
INSERT INTO `exam` VALUES ('2', '2011001002', '2', '73');
INSERT INTO `exam` VALUES ('3', '2011001002', '4', '80');
INSERT INTO `exam` VALUES ('4', '2011001003', '1', '50');
INSERT INTO `exam` VALUES ('5', '2011001003', '2', '60');
INSERT INTO `exam` VALUES ('6', '2011001003', '4', '85');
INSERT INTO `exam` VALUES ('7', '2011001004', '1', '90');
INSERT INTO `exam` VALUES ('8', '2011001004', '2', '95');
INSERT INTO `exam` VALUES ('9', '2011001004', '4', '100');
INSERT INTO `exam` VALUES ('10', '2011001006', '1', '70');
INSERT INTO `exam` VALUES ('11', '2011001006', '2', '75');
INSERT INTO `exam` VALUES ('12', '2011001006', '4', '65');
INSERT INTO `exam` VALUES ('13', '2011001008', '1', '80');
INSERT INTO `exam` VALUES ('14', '2011001008', '2', '75');
INSERT INTO `exam` VALUES ('15', '2011001008', '4', '90');
INSERT INTO `exam` VALUES ('16', '2011001009', '1', '75');
INSERT INTO `exam` VALUES ('17', '2011001009', '2', '80');
INSERT INTO `exam` VALUES ('18', '2011001009', '4', '85');
INSERT INTO `exam` VALUES ('19', '2011001010', '1', '65');
INSERT INTO `exam` VALUES ('20', '2011001010', '2', '75');
INSERT INTO `exam` VALUES ('21', '2011001010', '4', '85');
INSERT INTO `exam` VALUES ('22', '2011001011', '1', '40');
INSERT INTO `exam` VALUES ('23', '2011001011', '2', '50');
INSERT INTO `exam` VALUES ('24', '2011001011', '4', '60');

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `GradeID` int(11) DEFAULT NULL,
  `GradeName` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES ('1', 'S1');
INSERT INTO `grade` VALUES ('2', 'S2');
INSERT INTO `grade` VALUES ('3', 'Y2');
INSERT INTO `grade` VALUES ('4', 'Android');

-- ----------------------------
-- Table structure for mytest
-- ----------------------------
DROP TABLE IF EXISTS `mytest`;
CREATE TABLE `mytest` (
  `tid` int(11) DEFAULT NULL,
  `TName` varchar(10) DEFAULT NULL,
  `TAge` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mytest
-- ----------------------------
INSERT INTO `mytest` VALUES ('1', '张三', '21');

-- ----------------------------
-- Table structure for newsinfo
-- ----------------------------
DROP TABLE IF EXISTS `newsinfo`;
CREATE TABLE `newsinfo` (
  `NewsId` int(11) DEFAULT NULL,
  `NewsTitle` varchar(150) DEFAULT NULL,
  `NewsAuthor` varchar(50) DEFAULT NULL,
  `NewsContent` longtext,
  `Clicks` int(11) DEFAULT NULL,
  `AddTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of newsinfo
-- ----------------------------
INSERT INTO `newsinfo` VALUES ('3', '房价继续上涨，刚需者连连叫苦', '管理员', '今年国家调控政策，房价依然坚挺，让老百姓苦不堪言，安居才能乐页，连生活温饱都得不到满足，还能有什么更高的追求', '145', '2012-01-01 00:00:00');
INSERT INTO `newsinfo` VALUES ('4', '物价连续上涨，工资不见提高', '管理员', '中国社会矛盾重重，一斤葱的价格让人望而却步，有人说一顿饭吃上一根葱那绝对是富人，哎，老百姓日子苦呀，物价轮番涨，是否也该轮到涨工资了呢？我看难于上青天', '1000', '2012-02-01 16:39:20');
INSERT INTO `newsinfo` VALUES ('5', '王立军事件引发的思考', '管理员', '是人变了，还是社会体制的原因呢？', '100', '2012-03-17 16:40:33');
INSERT INTO `newsinfo` VALUES ('6', '汽车烧的不是油，是钱', '管理员', '国际油价上涨，发改委称与世界接轨，国际油价下跌，发改委称中国国情与国外不同', '123', '2012-03-18 08:54:41');
INSERT INTO `newsinfo` VALUES ('7', '春天咋暖还寒，气温继续走低', '管理员', '市民出行注意防雨保暖', '350', '2012-03-19 10:19:32');

-- ----------------------------
-- Table structure for replyinfo
-- ----------------------------
DROP TABLE IF EXISTS `replyinfo`;
CREATE TABLE `replyinfo` (
  `Id` int(11) DEFAULT NULL,
  `Content` varchar(150) DEFAULT NULL,
  `NewsId` int(11) DEFAULT NULL,
  `ReplyTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `StudentId` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of replyinfo
-- ----------------------------
INSERT INTO `replyinfo` VALUES ('1', '没法活了，练***到极乐世界吧', '6', '2012-03-20 14:42:25', '2011001002');
INSERT INTO `replyinfo` VALUES ('2', '不买车，让他随便涨', '6', '2012-03-20 14:42:52', '2011001003');
INSERT INTO `replyinfo` VALUES ('3', '涨价会带动其他产业涨价', '6', '2012-03-20 14:43:12', '2011001004');
INSERT INTO `replyinfo` VALUES ('4', '接轨了', '6', '2012-03-20 14:43:36', '2011001006');
INSERT INTO `replyinfo` VALUES ('5', '真希望国民党回来多党轮流执政', '6', '2012-03-20 14:44:07', '2011001008');
INSERT INTO `replyinfo` VALUES ('6', '天气变化无常', '7', '2012-03-20 14:44:19', '2011001002');
INSERT INTO `replyinfo` VALUES ('7', '注意保暖了', '7', '2012-03-20 14:44:29', '2011001008');

-- ----------------------------
-- Table structure for studentinfo
-- ----------------------------
DROP TABLE IF EXISTS `studentinfo`;
CREATE TABLE `studentinfo` (
  `StudentID` char(10) DEFAULT NULL,
  `StudentName` varchar(10) DEFAULT NULL,
  `Gender` varchar(2) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Birthday` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `StudentNO` varchar(18) DEFAULT NULL,
  `ClassID` int(11) DEFAULT NULL,
  `BeginTime` varchar(20) DEFAULT NULL,
  `Phone` varchar(20) DEFAULT NULL,
  `Province` varchar(10) DEFAULT NULL,
  `City` varchar(10) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of studentinfo
-- ----------------------------
INSERT INTO `studentinfo` VALUES ('2011001002', '马钰', '男', '20', '1991-02-21 00:00:00', '410702199102210213', '1', '2011-5-6', '15125741526', '河南', '商丘', 'my91@263.com');
INSERT INTO `studentinfo` VALUES ('2011001003', '谭处端', '男', '21', '1990-06-21 00:00:00', '410303199006210215', '1', '2011-5-6', '15890172541', '河南', '洛阳', 'tcd@163.com');
INSERT INTO `studentinfo` VALUES ('2011001004', '黄蓉', '女', '21', '1990-02-11 00:00:00', '412701199002110618', '1', '2011-5-6', '18637165241', '河南', '周口', 'huangrong@263.com');
INSERT INTO `studentinfo` VALUES ('2011001006', '刘处玄', '男', '18', '1990-10-14 00:00:00', '410102199010140317', '1', '2011-5-6', '15569852141', '河南', '郑州', 'LCX90@hotmail.com');
INSERT INTO `studentinfo` VALUES ('2011001008', '丘处机', '男', '20', '1991-06-21 00:00:00', '410103199106210613', '1', '2011-5-6', '15142153256', '河南', '郑州', 'qcj@163.com');
INSERT INTO `studentinfo` VALUES ('2011001009', '王处一', '男', '20', '1991-11-15 00:00:00', '410702199111150517', '1', '2011-5-6', '15125741529', '河南', '洛阳', '王99@sina.com.cn');
INSERT INTO `studentinfo` VALUES ('2011001010', '郝大通', '男', '19', '1992-05-06 00:00:00', '410306199205060719', '1', '2011-5-6', '15125471535', '河南', '洛阳', 'hdt@sohu.com');
INSERT INTO `studentinfo` VALUES ('2011001011', '孙不二', '男', '20', '1991-08-19 00:00:00', '412702199108090103', '1', '2011-5-6', '15125471539', '河南', '周口', 'sun1991@163.com');
INSERT INTO `studentinfo` VALUES ('2011003001', '刘瑛', '女', '20', '1991-11-07 00:00:00', '410106199111070412', '3', '2011-5-6', '18854215874', '河南', '郑州', 'liuying@sohu.com');
INSERT INTO `studentinfo` VALUES ('2011003002', '曲灵风', '女', '16', '1989-06-04 00:00:00', '411303198906040102', '3', '2011-5-6', '17878452365', '河南', '南阳', 'qlf@taohuadao.com');
INSERT INTO `studentinfo` VALUES ('2011003003', '陈玄风', '男', '21', '1990-05-29 00:00:00', '410522199005290213', '3', '2011-5-6', '18878452361', '河南', '安阳', 'cxf@163.com');
INSERT INTO `studentinfo` VALUES ('2011003004', '梅超风', '女', '21', '1990-09-16 00:00:00', '410104199009160416', '3', '2011-5-6', '16878452397', '河南', '郑州', 'mcf@sohu.com');
INSERT INTO `studentinfo` VALUES ('2011003007', '裘千尺', '女', '19', '1992-01-07 00:00:00', '410102199201070317', '3', '2011-5-6', '13852417412', '河南', '郑州', 'jueqingdan@163.com');

-- ----------------------------
-- Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `SubjectId` int(11) DEFAULT NULL,
  `SubjectName` varchar(100) DEFAULT NULL,
  `CreditHour` int(11) DEFAULT NULL,
  `Credit` int(11) DEFAULT NULL,
  `GradeID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subject
-- ----------------------------
INSERT INTO `subject` VALUES ('1', '基于C语言理解软件编程', '44', '2', '1');
INSERT INTO `subject` VALUES ('2', '基于Java语言深入理解程序逻辑', '44', '2', '1');
INSERT INTO `subject` VALUES ('3', 'Photoshop&Flash程序界面美工设计', '22', '1', '1');
INSERT INTO `subject` VALUES ('4', '网页设计与Web开发基础', '40', '2', '1');
INSERT INTO `subject` VALUES ('5', '基于SQL Server管理和查询数据', '34', '2', '1');
INSERT INTO `subject` VALUES ('6', 'C# WinForm 数据库应用设计', '44', '2', '1');
INSERT INTO `subject` VALUES ('7', 'SQL Server数据库高级查询和管理', '34', '3', '2');
INSERT INTO `subject` VALUES ('8', 'Java面向对象编程', '56', '3', '2');
INSERT INTO `subject` VALUES ('9', '网站页面布局DIV+CSS设计', '26', '3', '2');
INSERT INTO `subject` VALUES ('10', '基于JavaScript的WEB表单验证和客户端特效制作', '30', '3', '2');
INSERT INTO `subject` VALUES ('11', 'Android平台手机图形应用开发', '52', '4', '2');
INSERT INTO `subject` VALUES ('12', '基于JSP搭建WEB应用程序', '48', '4', '2');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `TeacherID` int(11) DEFAULT NULL,
  `TeacherName` varchar(20) DEFAULT NULL,
  `Gender` varchar(2) DEFAULT NULL,
  `GraduatedSchool` varchar(50) DEFAULT NULL,
  `Major` varchar(20) DEFAULT NULL,
  `Education` varchar(4) DEFAULT NULL,
  `GradeuatedTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `TeachTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `DepartmentId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '王重阳', '男', '全真研究院', '阵法', '博士', '2000-06-01 00:00:00', '2000-08-15 00:00:00', '1');
INSERT INTO `teacher` VALUES ('2', '黄药师', '男', '桃花岛大学', '格斗', '博士', '1999-06-01 00:00:00', '1999-08-18 00:00:00', '2');
INSERT INTO `teacher` VALUES ('3', '段智兴', '男', '大理皇家学院', '格斗', '博士', '1998-06-01 00:00:00', '1999-08-01 00:00:00', '1');
INSERT INTO `teacher` VALUES ('4', '欧阳锋', '男', '西域理工', '生物', '博士', '1999-06-01 00:00:00', '1999-08-01 00:00:00', '3');
INSERT INTO `teacher` VALUES ('5', '洪七公', '男', '丐帮职业学院', '掌法', '博士', '1994-06-01 00:00:00', '1994-10-01 00:00:00', '2');

-- ----------------------------
-- Table structure for teachsubject
-- ----------------------------
DROP TABLE IF EXISTS `teachsubject`;
CREATE TABLE `teachsubject` (
  `TeacherID` int(11) DEFAULT NULL,
  `SubjectID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teachsubject
-- ----------------------------
INSERT INTO `teachsubject` VALUES ('1', '1');
INSERT INTO `teachsubject` VALUES ('1', '2');
INSERT INTO `teachsubject` VALUES ('1', '4');
INSERT INTO `teachsubject` VALUES ('1', '5');
INSERT INTO `teachsubject` VALUES ('1', '6');
INSERT INTO `teachsubject` VALUES ('2', '2');
INSERT INTO `teachsubject` VALUES ('2', '4');
INSERT INTO `teachsubject` VALUES ('2', '5');
INSERT INTO `teachsubject` VALUES ('3', '3');
INSERT INTO `teachsubject` VALUES ('3', '4');
INSERT INTO `teachsubject` VALUES ('3', '9');
INSERT INTO `teachsubject` VALUES ('4', '2');
INSERT INTO `teachsubject` VALUES ('4', '5');
INSERT INTO `teachsubject` VALUES ('4', '7');
INSERT INTO `teachsubject` VALUES ('4', '11');
INSERT INTO `teachsubject` VALUES ('5', '5');
INSERT INTO `teachsubject` VALUES ('5', '7');
INSERT INTO `teachsubject` VALUES ('5', '9');
INSERT INTO `teachsubject` VALUES ('5', '10');
INSERT INTO `teachsubject` VALUES ('5', '12');

-- ----------------------------
-- Table structure for t_a
-- ----------------------------
DROP TABLE IF EXISTS `t_a`;
CREATE TABLE `t_a` (
  `A1` varchar(10) DEFAULT NULL,
  `A2` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_a
-- ----------------------------
INSERT INTO `t_a` VALUES ('A11', 'A21');
INSERT INTO `t_a` VALUES ('A12', 'A22');
INSERT INTO `t_a` VALUES ('A13', 'A23');
INSERT INTO `t_a` VALUES ('A14', 'A24');

-- ----------------------------
-- Table structure for t_b
-- ----------------------------
DROP TABLE IF EXISTS `t_b`;
CREATE TABLE `t_b` (
  `B1` varchar(10) DEFAULT NULL,
  `B2` varchar(10) DEFAULT NULL,
  `A1` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_b
-- ----------------------------
INSERT INTO `t_b` VALUES ('B11', 'B21', 'A11');
INSERT INTO `t_b` VALUES ('B12', 'B22', 'A12');
INSERT INTO `t_b` VALUES ('B13', 'B23', 'A11');
INSERT INTO `t_b` VALUES ('B14', 'B24', 'A16');
