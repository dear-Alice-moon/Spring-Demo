package com.moon.jdbc.core;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.moon.jdbc.pojo.Student;

/**
 * StudentMapper类实现 RowMapper类，可以很好的解决Java实体类中属性名与数据中表字段名名字不一致的问题。
 * 2018/12/09  16:54 
 *
 */
public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		
		return student;
	}
	
}
