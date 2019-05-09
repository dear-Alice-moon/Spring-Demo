package com.moon.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import com.moon.jdbc.pojo.Student;

public interface StudentDao {
	
	/**
	 * 初始化数据源
	 * @param ds
	 */
	public void setDataSource(DataSource ds);
	
	/**
	 * 进行新增操作
	 * @param id
	 * @param name
	 * @param age
	 */
	public void create(Integer id, String name, Integer age);
	
	/**
	 * 通过主键查询 Student 信息
	 * @param id
	 * @return
	 */
	public Student getStudent(Integer id);
	
	
	/**
	 * 查询所有的 Student 信息
	 * @return
	 */
	public List<Student> listStudents();
	
	
}
