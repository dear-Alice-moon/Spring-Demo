
-- 创建 marks表      
CREATE TABLE `marks` (
  `SID` int(11) NOT NULL,
  `MARKS` int(11) NOT NULL,
  `YEAR` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- 创建 student表       
CREATE TABLE `student` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键, id.',
  `NAME` varchar(20) NOT NULL COMMENT '姓名',
  `AGE` int(11) NOT NULL COMMENT '年龄',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1011 DEFAULT CHARSET=utf8;

