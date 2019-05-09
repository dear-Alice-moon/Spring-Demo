package com.moon.transaction.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.moon.transaction.core.StudentMarksMapper;
import com.moon.transaction.dao.StudentDao;
import com.moon.transaction.pojo.StudentMarks;

public class StudentJDBCTemplate implements StudentDao {

	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplateObject;
	
	// 使用PlatformTransactionManager来实现编程式方法进行实现事务。
	private PlatformTransactionManager transactionManager;
	

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	/*
	 * 该函数应该被注释掉
	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject = jdbcTemplateObject;
	}
	*/
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public void create(String name, Integer age, Integer marks, Integer year) {
		
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		
		System.out.println("初始化'TransactionStatus'后status的值为: " + status.toString());
		System.out.println("-----------------------------------------------------");
		
		try {
			
			String SQL1 = "INSERT INTO student(name, age) VALUES(?,?)";
			jdbcTemplateObject.update(SQL1, name, age);
			
			// 获取 student表中最大的 id值
			String SQL2 = "SELECT MAX(id) FROM student";
			// Integer sid = jdbcTemplateObject.queryForInt(SQL2);  // jdbcTemplateObject.queryForInt(SQL2)，该函数显示被弃用.
			Integer sid = jdbcTemplateObject.queryForInt(SQL2);
			
			String SQL3 = "INSERT INTO marks(sid, marks, year) VALUES(?,?,?)";
			jdbcTemplateObject.update(SQL3, sid, marks, year);
			System.out.println("Created Name = " + name + ", Age = " + age);
			
			System.out.println("-----------------------------------------------------");
			System.out.println("在进行提交事务之前，'status'的值为：" + status.toString());
			transactionManager.commit(status);
			
		} catch (Exception e) {
			System.out.println("Error in creating record, rolling back...");
			
			System.out.println("-----------------------------------------------------");
			System.out.println("出现异常后，'status'的值为：" + status.toString());
			transactionManager.rollback(status);
			throw e;  // 抛出异常， 在XML中通过AOP切面，才能够捕获异常，进行事务回滚。
		}
		
		// 在这里，也可以使用 'return' 关键字, (^__^)  2018/12/31 12:56
		return ;
	}
	
	
	@Override
	public List<StudentMarks> listStudents() {
		// 在这里，这个'*'号代表什么？     2018/12/22 11:27        
		String SQL = "SELECT * FROM student, marks WHERE student.id = marks.sid";
		List<StudentMarks> studentMarks = jdbcTemplateObject.query(SQL, new StudentMarksMapper());
		
		return studentMarks;
	}
	
}
