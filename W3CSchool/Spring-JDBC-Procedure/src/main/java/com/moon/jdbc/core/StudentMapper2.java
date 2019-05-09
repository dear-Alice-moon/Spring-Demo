package com.moon.jdbc.core;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.moon.jdbc.pojo.Student;
import com.moon.jdbc.pojo.Student3;

/**
 * StudentMapper类实现 RowMapper类，可以很好的解决Java实体类中属性名与数据中表字段名名字不一致的问题。
 * 2018/12/09  16:54 
 *
 */
public class StudentMapper2 implements RowMapper<Student3> {

	@Override
	public Student3 mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student3 student3 = new Student3();
		student3.setTe_Id(rs.getInt("id"));         // setId(rs.getInt("id"));
		student3.setTe_Name(rs.getString("name")); //setName(rs.getString("name"));
		student3.setTe_Age(rs.getInt("age")); // setAge(rs.getInt("age"));
		student3.setTe_sex(rs.getString("sex"));
		student3.setTe_address(rs.getString("address"));
		
		// 在这里，Student3中的remark属性未被设置，这也是测试的先决条件之一。      2018/12/09  17:06   
		
		return student3;
	}
	
}
