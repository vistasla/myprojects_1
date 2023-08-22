/*
 Navicat Premium Data Transfer

 Source Server         : C#
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 15/04/2020 14:53:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for categoryurl
-- ----------------------------
DROP TABLE IF EXISTS `categoryurl`;
CREATE TABLE `categoryurl`  (
  `strCategoryUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `intSwitcher` tinyint(12) NOT NULL,
  `intSwitcher1` tinyint(12) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of categoryurl
-- ----------------------------
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.01.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.01.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.01.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.01.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.01.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.01.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.01.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.01.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.01.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.01.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.01.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.01.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.01.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.01.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.01.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.55.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.35.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.47.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.34.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.51.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.45.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.50.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.48.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.41.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.30.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.46.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.49.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.44.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.42.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.56.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.40.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.43.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.52.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.39.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.38.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.33.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.31.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.03.32.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.04.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.04.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.04.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.04.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.04.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.04.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.04.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.05.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.05.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.05.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.05.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.05.19.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.05.91.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.05.17.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.05.18.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.05.92.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.05.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.05.25.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.05.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.05.16.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.05.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.05.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.06.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.06.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.06.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.06.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.06.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.06.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.06.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.37.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.21.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.40.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.36.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.41.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.28.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.31.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.23.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.39.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.30.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.07.32.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.09.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.09.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.09.20.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.09.26.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.09.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.09.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.09.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.09.24.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.09.29.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.09.28.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.09.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.09.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.09.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.10.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.10.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.10.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.10.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.10.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.10.91.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.10.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.10.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.10.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.10.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.11.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.11.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.11.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.11.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.11.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.11.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.11.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.12.45.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.12.50.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.12.35.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.12.55.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.12.39.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.12.41.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.12.37.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.12.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.12.31.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.12.53.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.12.43.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.12.33.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.14.91.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.14.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.14.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.14.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.14.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.14.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.15.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.15.92.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.15.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.15.17.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.15.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.15.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.15.93.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.15.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.15.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.15.91.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.15.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.15.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.15.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.16.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.16.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.16.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.16.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.17.40.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.17.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.17.55.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.17.50.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.17.59.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.18.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.18.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.18.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.18.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.18.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.18.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.18.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.18.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.18.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.18.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.18.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.18.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.27.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.32.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.23.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.21.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.35.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.20.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.31.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.33.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.29.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.16.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.30.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.17.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.25.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.34.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.18.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.19.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.26.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.24.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.28.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.36.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.19.22.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.20.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.20.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.20.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.20.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.20.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.20.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.20.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.17.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.19.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.18.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.20.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.16.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.21.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.18.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.19.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.25.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.26.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.22.21.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.24.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.24.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.24.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.24.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.24.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.24.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.24.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.24.16.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.24.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.24.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.24.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.24.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.24.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.16.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.17.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.25.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.31.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.37.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.26.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.29.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.16.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.32.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.30.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.38.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.25.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.22.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.34.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.24.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.23.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.28.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.36.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.21.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.20.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.26.18.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.27.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.27.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.28.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.28.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.30.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.30.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.30.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.30.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.30.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.30.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.30.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.30.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.30.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.18.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.21.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.92.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.91.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.22.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.19.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.16.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.31.20.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.32.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.32.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.32.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.32.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.32.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.32.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.32.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.32.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.32.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.32.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.24.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.17.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.25.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.16.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.23.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.18.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.34.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.36.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.36.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.36.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.36.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.36.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.36.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.36.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.36.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.36.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.36.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.36.91.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.36.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.36.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.36.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.36.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.25.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.16.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.19.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.18.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.21.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.27.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.91.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.26.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.24.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.22.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.23.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.17.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.38.28.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.50.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.26.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.55.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.65.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.48.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.27.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.46.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.69.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.57.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.44.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.70.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.51.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.45.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.67.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.41.59.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.73.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.71.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.75.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.76.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.17.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.32.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.24.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.23.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.25.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.31.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.50.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.72.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.60.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.54.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.70.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.20.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.30.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.18.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.22.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.21.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.74.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.19.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.16.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.26.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.55.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.69.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.43.53.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.72.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.85.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.95.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.62.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.60.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.83.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.98.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.70.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.84.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.61.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.52.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.86.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.76.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.82.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.71.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.73.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.75.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.57.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.74.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.55.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.56.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.63.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.45.81.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.91.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.93.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.95.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.92.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.97.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.98.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.94.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.47.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.49.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.49.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.49.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.49.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.49.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.49.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.49.30.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.50.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.50.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.50.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.50.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.50.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.50.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.50.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.50.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.50.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.52.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.52.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.52.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.52.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.52.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.52.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.52.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.21.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.92.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.17.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.23.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.16.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.20.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.91.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.22.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.19.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.24.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.18.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.26.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.54.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.55.46.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.55.55.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.55.50.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.55.53.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.55.40.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.55.36.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.55.35.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.55.45.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.55.43.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.55.31.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.55.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.55.33.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.41.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.27.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.28.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.36.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.46.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.33.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.29.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.34.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.51.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.45.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.40.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.35.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.50.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.54.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.55.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.56.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.39.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.56.60.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.23.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.24.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.18.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.17.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.20.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.16.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.22.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.21.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.19.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.58.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.59.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.59.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.59.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.59.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.59.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.59.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.59.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.59.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.59.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.59.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.62.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.62.18.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.62.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.62.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.62.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.62.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.62.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.62.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.62.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.62.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.62.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.18.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.22.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.16.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.20.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.30.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.90.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.23.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.32.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.26.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.63.24.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.66.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.66.17.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.66.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.66.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.66.11.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.66.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.66.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.66.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.66.20.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.66.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.66.22.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.69.05.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.69.13.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.69.10.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.69.03.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.69.06.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.69.01.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.69.08.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.69.12.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.69.02.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.69.15.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.69.09.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.69.04.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.69.07.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.69.14.00.00.00.html', 0, 0);
INSERT INTO `categoryurl` VALUES ('http://category.dangdang.com/cp01.69.11.00.00.00.html', 0, 0);

-- ----------------------------
-- Table structure for htmldocumentinfo
-- ----------------------------
DROP TABLE IF EXISTS `htmldocumentinfo`;
CREATE TABLE `htmldocumentinfo`  (
  `strUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strTitle` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strFirstDegree` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strSecondDegree` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strOriginalTitle` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strArrayImage` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strArraySmallImage` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strTitleOriginal` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strAuthor` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strPublishingHouse` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strPublishingTime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strFormat` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strPaper` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strPackaging` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strIsbn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strContent` varchar(4096) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strAuthorIntroduction` varchar(4096) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strCatalog` varchar(4096) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strKeywords` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`strIsbn`, `strUrl`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for htmldocumentinfo0_copy
-- ----------------------------
DROP TABLE IF EXISTS `htmldocumentinfo0_copy`;
CREATE TABLE `htmldocumentinfo0_copy`  (
  `strUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `strtitle` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`strUrl`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `mail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `day` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `test` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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

SET FOREIGN_KEY_CHECKS = 1;
