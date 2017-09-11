# byteJta
1.jta修改是否起作用
2.jta添加作用不起作用
数据脚本

/*
 Navicat Premium Data Transfer

 Source Server         : 241
 Source Server Type    : MySQL
 Source Server Version : 50528
 Source Host           : 192.168.1.241
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50528
 File Encoding         : utf-8

 Date: 09/11/2017 15:25:19 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `tb_account`
-- ----------------------------
DROP TABLE IF EXISTS `tb_account`;
CREATE TABLE `tb_account` (
  `acct_id` int(11) DEFAULT NULL,
  `amount` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `tb_account`
-- ----------------------------
BEGIN;
INSERT INTO `tb_account` VALUES ('1', '7000.00');
COMMIT;

-- ----------------------------
--  Table structure for `tb_order`
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order` (
  `id` int(11) NOT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `tb_order`
-- ----------------------------
BEGIN;
INSERT INTO `tb_order` VALUES ('1', '1'), ('2', '1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
