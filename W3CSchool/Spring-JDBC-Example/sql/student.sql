
CREATE TABLE `student` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键, id.',
  `NAME` varchar(20) NOT NULL COMMENT '姓名',
  `AGE` int(11) NOT NULL COMMENT '年龄',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8;


INSERT INTO `test`.`student` (`ID`, `NAME`, `AGE`) VALUES ('1', '张三', '12');
INSERT INTO `test`.`student` (`ID`, `NAME`, `AGE`) VALUES ('2', '李四', '22');
INSERT INTO `test`.`student` (`ID`, `NAME`, `AGE`) VALUES ('3', '小红', '21');
INSERT INTO `test`.`student` (`ID`, `NAME`, `AGE`) VALUES ('4', '黑旋风', '220');






