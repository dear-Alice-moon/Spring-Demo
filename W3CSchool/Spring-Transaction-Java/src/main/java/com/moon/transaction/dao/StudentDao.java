package com.moon.transaction.dao;

import java.util.List;


import com.moon.transaction.pojo.StudentMarks;

public interface StudentDao {
	
	void create(String name, Integer age, Integer marks, Integer year);
	
	List<StudentMarks> listStudents();
	
	
}
