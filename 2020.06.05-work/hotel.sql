/*
Navicat MySQL Data Transfer

Source Server         : java86
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : hotel

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2020-06-08 00:31:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `5121001type`
-- ----------------------------
DROP TABLE IF EXISTS `5121001type`;
CREATE TABLE `5121001type` (
  `id` int(11) NOT NULL DEFAULT '0' COMMENT '汉庭（苏州国际博览中心店）',
  `typeId` int(11) DEFAULT NULL COMMENT '房型id',
  `num` int(11) DEFAULT NULL COMMENT '房型数量',
  `price` double DEFAULT NULL COMMENT '房型价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 5121001type
-- ----------------------------
INSERT INTO `5121001type` VALUES ('0', '3', '10', '68');
INSERT INTO `5121001type` VALUES ('1', '2', '36', '188');
INSERT INTO `5121001type` VALUES ('2', '1', '30', '158');

-- ----------------------------
-- Table structure for `5121002type`
-- ----------------------------
DROP TABLE IF EXISTS `5121002type`;
CREATE TABLE `5121002type` (
  `id` int(11) NOT NULL DEFAULT '0' COMMENT '莫泰酒店（苏州园区博览中心唐庄地铁站）',
  `typeId` int(11) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 5121002type
-- ----------------------------
INSERT INTO `5121002type` VALUES ('1', '1', '65', '178');
INSERT INTO `5121002type` VALUES ('2', '2', '35', '188');
INSERT INTO `5121002type` VALUES ('3', '3', '15', '88');
INSERT INTO `5121002type` VALUES ('4', '4', '25', '228');

-- ----------------------------
-- Table structure for `5121003type`
-- ----------------------------
DROP TABLE IF EXISTS `5121003type`;
CREATE TABLE `5121003type` (
  `id` int(11) NOT NULL DEFAULT '0' COMMENT '维也纳国际酒店（苏州蠡口地铁站）',
  `typeId` int(11) DEFAULT NULL,
  `num` int(11) DEFAULT NULL COMMENT '酒店数量',
  `price` double DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of 5121003type
-- ----------------------------
INSERT INTO `5121003type` VALUES ('0', '1', '26', '158');
INSERT INTO `5121003type` VALUES ('1', '2', '35', '208');
INSERT INTO `5121003type` VALUES ('2', '4', '38', '308');

-- ----------------------------
-- Table structure for `customer`
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '客户id',
  `cutomerName` varchar(255) NOT NULL COMMENT '客户名称',
  `hotelId` int(11) DEFAULT NULL COMMENT '入住的酒店编号',
  `phone` varchar(255) DEFAULT NULL COMMENT '客户电话号码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', '姚鑫', '5121001', '17693121776');
INSERT INTO `customer` VALUES ('2', '梁建设', '5121002', '17693108625');

-- ----------------------------
-- Table structure for `hotelname`
-- ----------------------------
DROP TABLE IF EXISTS `hotelname`;
CREATE TABLE `hotelname` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '酒店id',
  `hotelName` varchar(255) DEFAULT NULL COMMENT '酒店名称',
  `address` varchar(255) DEFAULT NULL COMMENT '酒店地址',
  `score` double DEFAULT NULL COMMENT '酒店评分',
  `level` int(11) DEFAULT NULL COMMENT '酒店星级',
  `hId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotelname
-- ----------------------------
INSERT INTO `hotelname` VALUES ('1', '汉庭（苏州国际博览中心店）', '和众街106号（西沈浒路与众街西交叉口，建行银行旁）金鸡湖景区', '4.5', '3', '5121001');
INSERT INTO `hotelname` VALUES ('2', '莫泰酒店（苏州园区博览中心唐庄地铁站）', '跨阳路与阳东路交叉口南150米临芳苑商业广场', '4.8', '3', '5121002');
INSERT INTO `hotelname` VALUES ('3', '维也纳国际酒店（苏州蠡口地铁站）', '安元路221号 （相城高铁新城开发区/苏州北站）', '5', '4', '5121003');

-- ----------------------------
-- Table structure for `typehouse`
-- ----------------------------
DROP TABLE IF EXISTS `typehouse`;
CREATE TABLE `typehouse` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '房型编号',
  `type` varchar(255) DEFAULT NULL COMMENT '房型名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of typehouse
-- ----------------------------
INSERT INTO `typehouse` VALUES ('1', '大床房');
INSERT INTO `typehouse` VALUES ('2', '双床房');
INSERT INTO `typehouse` VALUES ('3', '钟点房');
INSERT INTO `typehouse` VALUES ('4', '家庭房');
