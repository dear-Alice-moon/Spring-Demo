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
import com.moon.jdbc.core.StudentMapper2;
import com.moon.jdbc.dao.StudentDao2;
import com.moon.jdbc.pojo.Student;
import com.moon.jdbc.pojo.Student2;
import com.moon.jdbc.pojo.Student3;

public class StudentJDBCTemplate2 implements StudentDao2 {
	
	private DataSource dataSource;
	// 用于执行 '存储过程' 的 JDBC 
	// private SimpleJdbcCall jdbcCall;
	// 用于执行普通SQL的JDBC
	private JdbcTemplate jdbcTemplate;
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		// this.jdbcCall = new SimpleJdbcCall(dataSource);
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/*
	public void setJdbcCall(SimpleJdbcCall jdbcCall) {
		this.jdbcCall = jdbcCall;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	*/
	
	
	/**
	 * 通过主键查询 Student 信息，直接使用JDBCTemplate来实现。
	 * @param id
	 * @return
	 */
	@Override
	public Student3 selectStudent(Integer id) {
		
		Student3 student3 = new Student3();
		
		try {
			String sql = "SELECT id, name, age, sex, address FROM student WHERE id=?";
			
			// 该行代码错误， 数据库表中查询出来的字段无法与Java实体类中属性自动映射。 2018/12/09  17:16 
			// student3 = jdbcTemplate.queryForObject(sql, new Object[] {id}, Student3.class);  
			
			student3 = jdbcTemplate.queryForObject(sql, new Object[] {id}, new StudentMapper2());
			System.out.println("Student3值为： " + student3);
			
		} catch (Exception e) {
			System.out.println("StudentJDBCTemplate2.java类--->selectStudent(...)函数报错，错误信息是：" + e.toString());
			e.printStackTrace();
			throw e;
		}
		
		return student3;
	}
	
	
	public List<Student2> selectStudent2(Integer id) {
		
		List<Student2> stuList = new ArrayList<Student2>();
		
		try {
			String sql = "SELECT id, name, age, sex, address FROM student WHERE id=?";
			
			// 该行代码错误， 数据库表中查询出来的字段无法与Java实体类中属性自动映射。 2018/12/09  17:16 
			//student2 = jdbcTemplate.queryForObject(sql, new Object[] {id}, Student2.class);
			
			// jdbcTemplate.queryForList(sql, Object obj...); // 可传递多个参数
			List<Map<String, Object>> list = jdbcTemplate.queryForList(sql, id);
			// list为： [{id=1011, name=李雨菲, age=18, sex=女, address=河北--石家庄}]
			System.out.println("list为： " + list.toString());
			
			for (Map<String, Object> map : list) {
				
				Student2 student2 = new Student2();
				
				student2.setId( (Integer)map.get("id") );
				student2.setName( (String)map.get("name") );
				student2.setAge( (Integer)map.get("age") );
				student2.setAddress( (String)map.get("address") );
				
				System.out.println("Student2值为： " + student2);
				
				stuList.add(student2);
			}
			
		} catch (Exception e) {
			System.out.println("StudentJDBCTemplate2.java类--->selectStudent(...)函数报错，错误信息是：" + e.toString());
			e.printStackTrace();
			throw e;
		}
		
		return stuList;
	}
	
	
	
	/**
	 * 通过主键查询 Student 信息
	 * @param id
	 * @return
	 */
	@Override
	public Student getStudent(Integer id) {
		
		 SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
		
		// 初始化 Student
		Student student = new Student();
		// 设置需要调用执行的存储过程。
		// this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
		// jdbcCall.withProcedureName("getRecord");
		
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
	 * 通过模糊匹配姓名、年龄来查询 Student信息
	 * @param name
	 * @param age
	 * @return
	 */
	@Override
	public Student getStudent2(String name, Integer age) {
		
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord2");
		
		// 初始化 Student
		Student student = new Student();
		// 设置需要调用执行的存储过程。
		//this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord2");
		// jdbcCall.withProcedureName("getRecord2");
		
		try {
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("in_name", name);
			map.put("in_age", age);
			// 设置传入存储过程的参数
			SqlParameterSource in = new MapSqlParameterSource().addValues(map);  // 传递 Map<K,V>集合参数，可行。
			// 执行存储过程
			Map<String, Object> out = jdbcCall.execute(in);
			System.out.println("执行存储过程后，返回的Map<String, Object>集合out为：" + out.toString());
			System.out.println("------------------------------------------------------");
			
			// 为 Student赋值
			student.setId( (Integer)out.get("out_id") );
			student.setName( (String)out.get("out_name") );
			student.setAge( (Integer)out.get("out_age") );
			// System.out.println("------------------------------------------------------");
			
			// jdbcCall.executeObject(returnType, args);
			
			
		} catch (Exception e) {
			System.out.println("StudentJDBCTemplate.java类--->getStudent(...)函数报错, 错误信息是： " + e.toString());
			e.printStackTrace();
			throw e;
		}
		
		return student;
	}
	
	
	/**
	 * 通过模糊匹配姓名、年龄来查询 Student信息
	 * @param name
	 * @param age
	 * @return
	 */
	@Override
	public Student getStudent3(String name, Integer age) {
		
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord3");
		
		// 初始化 Student
		Student student = new Student();
		// 设置需要调用执行的存储过程。
		// jdbcCall.withProcedureName("getRecord3");
		
		
		
		return null;
	}
	
	
}
