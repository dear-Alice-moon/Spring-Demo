package com.moon.transaction.core;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.moon.transaction.pojo.StudentMarks;

public class StudentMarksMapper implements RowMapper<StudentMarks> {

	@Override
	public StudentMarks mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		// 在这里，如果少一个 set函数，会得到一个怎样的结果 ？    2018/12/22 11:30
		System.out.println("ResultSet值为： " + rs.toString());
		
		StudentMarks studentMarks = new StudentMarks();
		
		studentMarks.setId(rs.getInt("id"));
		studentMarks.setName(rs.getString("name"));
		studentMarks.setAge(rs.getInt("age"));
		studentMarks.setSid(rs.getInt("sid"));
		studentMarks.setMarks(rs.getInt("marks"));
		studentMarks.setYear(rs.getInt("year"));
		
		return studentMarks;
	}
	
	
}
