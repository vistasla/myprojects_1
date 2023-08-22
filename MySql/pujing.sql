/*
Navicat MySQL Data Transfer

Source Server         : C#
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : pujing

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2020-02-14 07:03:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `mail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `day` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `test` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('test', '123456', 'test1', '0', 'test2');
INSERT INTO `user` VALUES ('test1', '123456', 'test1', '1', 'test2');
INSERT INTO `user` VALUES ('test2', '123456', 'test1', '2', 'test2');
INSERT INTO `user` VALUES ('test3', '123456', 'test1', '3', 'test2');
INSERT INTO `user` VALUES ('test4', '123456', 'test', '4', 'test2');
INSERT INTO `user` VALUES ('test5', '123456', 'test', '4', 'test2');
INSERT INTO `user` VALUES ('test6', '123456', 'test', '4', 'test2');
INSERT INTO `user` VALUES ('test8', '123456', 'test', '4', 'test2');
