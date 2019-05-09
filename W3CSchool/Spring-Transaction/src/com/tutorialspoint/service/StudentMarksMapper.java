package com.tutorialspoint.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tutorialspoint.pojo.StudentMarks;

public class StudentMarksMapper implements RowMapper<StudentMarks> {

	@Override
	public StudentMarks mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		StudentMarks studentMarks = new StudentMarks();
		
		studentMarks.setAge(rs.getInt("age"));
		studentMarks.setName(rs.getString("name"));
		studentMarks.setId(rs.getInt("id"));
		studentMarks.setMarks(rs.getInt("marks"));
		studentMarks.setYear(rs.getInt("year"));
		studentMarks.setSid(rs.getInt("sid"));
		
		
		return studentMarks;
	}
	
	
	
	
	
}
