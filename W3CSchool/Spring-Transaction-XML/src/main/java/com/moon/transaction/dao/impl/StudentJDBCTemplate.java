package com.moon.transaction.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.moon.transaction.core.StudentMarksMapper;
import com.moon.transaction.dao.StudentDao;
import com.moon.transaction.pojo.StudentMarks;

public class StudentJDBCTemplate implements StudentDao {
	
	private JdbcTemplate jdbcTemplateObject;
	
	private DataSource dataSource;
	
	public JdbcTemplate getJdbcTemplateObject() {
		return jdbcTemplateObject;
	}
	
	/** 该函数应该被注释掉，具体情况可参看Beans.xml文件配置    2018/12/31 16:46  
	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplateObject = jdbcTemplate;
	}
	*/
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	
	@Override
	public void create(String name, Integer age, Integer marks, Integer year) {
		
		try {
			
			String SQL1 = "INSERT INTO student(NAME, AGE) VALUES(?,?)";
			jdbcTemplateObject.update(SQL1, name ,age);
			
			String SQL2 = "SELECT MAX(id) FROM student";
			Integer sid = jdbcTemplateObject.queryForInt(SQL2);
			
			String SQL3 = "INSERT INTO marks(sid, marks, year) VALUES(?,?,?)";
			jdbcTemplateObject.update(SQL3, sid, marks, year);
			System.out.println("Create Name = " + name + ", Age = " + age);
			
			// 暂时添加下行代码
			throw new RuntimeException("simulate Error condition");
		} catch (Exception e) {
			System.out.println("Error in creating record, rolling back!");
			throw e;
		}
		
	}
	
	
	@Override
	public List<StudentMarks> listStudents() {
		
		String SQL = "SELECT * FROM student, marks WHERE student.id = marks.sid";
		List<StudentMarks> studentMarks = jdbcTemplateObject.query(SQL, new StudentMarksMapper());
		
		return studentMarks;
	}
	
	
}
