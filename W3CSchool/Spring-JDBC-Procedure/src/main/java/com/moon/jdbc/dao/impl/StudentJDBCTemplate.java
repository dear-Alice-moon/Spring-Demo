package com.moon.jdbc.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.moon.jdbc.core.StudentMapper;
import com.moon.jdbc.dao.StudentDao;
import com.moon.jdbc.pojo.Student;

public class StudentJDBCTemplate implements StudentDao {
	
	private DataSource dataSource;
	// 用于执行 '存储过程' 的 JDBC 
	private SimpleJdbcCall jdbcCall;
	// 用于执行普通SQL的JDBC
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		// 在数据库中，有名为 'getRecord' 的存储过程。
		this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
		// 对 jdbcTemplate 赋值  
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	/**
	 * 进行新增操作
	 * @param id
	 * @param name
	 * @param age
	 */
	@Override
	public void create(Integer id, String name, Integer age) {
		
		try {
			
			String sql  = "INSERT INTO student(id, name, age) VALUES(?,?,?)";
			jdbcTemplate.update(sql, id, name, age);
			System.out.println("Created Record Id= " + id + " Name = " + name  + " age = " + age);
		} catch (Exception e) {
			System.out.println("StudentJDBCTemplate.java类--->create(...)函数报错，错误信息是：" + e.toString());
			e.printStackTrace();
			throw e;
		}
	}
	
	
	/**
	 * 通过主键查询 Student 信息
	 * @param id
	 * @return
	 */
	@Override
	public Student getStudent(Integer id) {
		
		// 初始化 Student
		Student student = new Student();
		
		try {
			
			// 传入单个参数
			SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
			Map<String, Object> out = jdbcCall.execute(in);
			
			student.setId(id);
			student.setName((String) out.get("out_name"));
			student.setAge((Integer) out.get("out_age"));
			
		} catch (Exception e) {
			System.out.println("StudentJDBCTemplate.java类--->getStudent(...)函数报错, 错误信息是： " + e.toString());
			e.printStackTrace();
			throw e;
		}
		
		return student;
	}
	
	
	/**
	 * 查询所有的 Student 信息
	 * @return
	 */
	@Override
	public List<Student> listStudents() {
		
		List<Student> studentList = new ArrayList<Student>();
		
		try {
			
			String sql  = "SELECT id, name, age FROM student"; 
			studentList = jdbcTemplate.query(sql, new StudentMapper());
			
		} catch (Exception e) {
			System.out.println("StudentJDBCTemplate.java类--->listStudents(...)函数报错, 错误信息是： " + e.toString());
			e.printStackTrace();
			throw e;
		}
		
		return studentList;
	}
	
	
}
