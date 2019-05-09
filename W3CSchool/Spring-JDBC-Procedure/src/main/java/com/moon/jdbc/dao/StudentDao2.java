package com.moon.jdbc.dao;

import com.moon.jdbc.pojo.Student;
import com.moon.jdbc.pojo.Student3;

public interface StudentDao2 {
	
	
	/**
	 * 通过主键查询 Student 信息，直接使用JDBCTemplate来实现。
	 * @param id
	 * @return
	 */
	public Student3 selectStudent(Integer id);
	
	
	/**
	 * 通过主键查询 Student 信息，调用存储过程实现。
	 * @param id
	 * @return
	 */
	public Student getStudent(Integer id);
	
	/**
	 * 通过模糊匹配姓名、年龄来查询 Student信息，调用存储过程实现。
	 * @param name
	 * @param age
	 * @return
	 */
	public Student getStudent2(String name, Integer age);
	
	
	/**
	 * 通过模糊匹配姓名、年龄来查询 Student信息，调用存储过程实现。
	 * @param name
	 * @param age
	 * @return
	 */
	public Student getStudent3(String name, Integer age);
	
}
