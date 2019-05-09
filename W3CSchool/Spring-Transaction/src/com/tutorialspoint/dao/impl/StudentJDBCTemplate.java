package com.tutorialspoint.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.tutorialspoint.dao.StudentDAO;
import com.tutorialspoint.pojo.StudentMarks;
import com.tutorialspoint.service.StudentMarksMapper;

public class StudentJDBCTemplate implements StudentDAO {
	
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, Integer age, Integer marks, Integer year) {
		try {
			
			String sql1 = "INSERT INTO student(name, age) VALUES(?, ?)";
			jdbcTemplateObject.update(sql1, name, age);
			
			// Get the latest student id to be used in Marks table
			String sql2 = "SELECT MAX(id) FROM student";
			int sid = jdbcTemplateObject.queryForInt(sql2);
			
			String sql3 = "INSERT INTO marks(sid, marks, year) VALUES(?, ?, ?)";
			jdbcTemplateObject.update(sql3, sid, marks, year);
			System.out.println("Created Name = " + name + ", Age = " + age);
			
			// to simulate the exception.
			throw new RuntimeException("simulate Error condition");
			
		} catch (DataAccessException e) {
			System.out.println("Error in creating record, rolling back");
			throw e;
		}

	}
	
	
	@Override
	public List<StudentMarks> listStudents() {
		String sql = "SELECT * FROOM student, marks WHERE student.id = marks.sid";
		List<StudentMarks> studentMarks = jdbcTemplateObject.query(sql, new StudentMarksMapper());
		
		return studentMarks;
	}

}
