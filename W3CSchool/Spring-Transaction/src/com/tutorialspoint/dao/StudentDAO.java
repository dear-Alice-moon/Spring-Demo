package com.tutorialspoint.dao;

import java.util.List;

import javax.sql.DataSource;

import com.tutorialspoint.pojo.StudentMarks;

public interface StudentDAO {
	
	
	public void setDataSource(DataSource dataSource);
	
	
	public void create(String name, Integer age, Integer marks, Integer year);
	
	
	public List<StudentMarks> listStudents();
	
}
