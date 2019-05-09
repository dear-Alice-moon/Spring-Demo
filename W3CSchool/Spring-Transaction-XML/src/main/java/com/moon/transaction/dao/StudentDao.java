package com.moon.transaction.dao;

import java.util.List;

import com.moon.transaction.pojo.StudentMarks;

public interface StudentDao {
	
	// 创建信息
	void create(String name, Integer age, Integer marks, Integer year);
	
	// 查询信息
	List<StudentMarks> listStudents();
	
}
