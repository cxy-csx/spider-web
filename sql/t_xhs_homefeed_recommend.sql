/*
 Navicat Premium Data Transfer

 Source Server         : 122.152.234.161
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : 122.152.234.161:3306
 Source Schema         : ry-vue

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 12/09/2023 00:16:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_xhs_homefeed_recommend
-- ----------------------------
DROP TABLE IF EXISTS `t_xhs_homefeed_recommend`;
CREATE TABLE `t_xhs_homefeed_recommend`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `note_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '笔记id',
  `note_cover` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '笔记封面',
  `note_title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '笔记标题',
  `note_user_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '发布用户id',
  `note_user_nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '发布用户昵称',
  `note_user_avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '发布用户头像',
  `note_like_count` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '笔记喜欢数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_xhs_homefeed_recommend
-- ----------------------------
INSERT INTO `t_xhs_homefeed_recommend` VALUES (1, '64f6ab84000000001f005e99', 'http://sns-webpic-qc.xhscdn.com/202309112205/5b39fa51f3464f9f7c1a9fe615ec90c6/1040g00830okilpr1j05g5ool80qkg0ptpe94m9g!nd_whlt34_webp_wm_1', '刷到了一个视频就是觉得这个网友说的不错， 甚得我心（个人觉得）', '63154035000000001200033d', '毕生忠于原耽', 'https://sns-avatar-qc.xhscdn.com/avatar/1040g2jo30o95p81ai43g5ool80qkg0ptmkh6qu8', '100+');

SET FOREIGN_KEY_CHECKS = 1;
