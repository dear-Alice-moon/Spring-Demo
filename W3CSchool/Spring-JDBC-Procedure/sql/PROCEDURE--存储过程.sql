
-- getRecord存储过程
DELIMITER $$
DROP PROCEDURE IF EXISTS `TEST`.`getRecord` $$
CREATE PROCEDURE `TEST`.`getRecord` (
IN in_id INTEGER,
OUT out_name VARCHAR(20),
OUT out_age  INTEGER)
BEGIN
   SELECT name, age
   INTO out_name, out_age
   FROM Student where id = in_id;
END $$
DELIMITER ;

-- -----------------------------------

-- getRecord2存储过程
CREATE PROCEDURE `getRecord2`(
IN in_name VARCHAR(32),
IN in_age INTEGER,
OUT out_id INTEGER,
OUT out_name VARCHAR(32),
OUT out_age INTEGER,
OUT out_sex VARCHAR(4),
OUT out_address VARCHAR(255))
BEGIN
	SELECT t.id, t.name, t.age, t.sex, t.address
	INTO out_id, out_name, out_age, out_sex, out_address
	FROM student t
	WHERE t.name LIKE CONCAT('%',in_name,'%')  
	AND t.age LIKE CONCAT('%',in_age,'%');
END


-- -----------------------------------

-- getRecord3存储过程
CREATE PROCEDURE `getRecord3`(
IN in_sex VARCHAR(4),
IN in_age INTEGER,
OUT out_id INTEGER,
OUT out_name VARCHAR(32),
OUT out_age INTEGER,
OUT out_sex VARCHAR(4),
OUT out_address VARCHAR(255))
BEGIN
	SELECT id, name, age, sex, address
	INTO out_id, out_name, out_age, out_sex, out_address
	FROM student 
	WHERE sex=in_sex AND age LIKE CONCAT('%',in_age,'%');
END


