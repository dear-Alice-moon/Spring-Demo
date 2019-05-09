package com.moon.jdbc.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.moon.jdbc.core.StudentMapper;
import com.moon.jdbc.dao.StudentDao;
import com.moon.jdbc.pojo.Student;

public class StudentJDBCTemplate implements StudentDao {
	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	
	/**
	 * 初始化数据源
	 * @param dataSource
	 */
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
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
		String sql = "INSERT INTO Student(id, name, age) VALUES(?,?,?)";
		jdbcTemplate.update(sql, id, name, age);
		System.out.println("Created Record Id = " + id + " Name = "  + name + " Age = " + age);
		return ;
	}
	
	/**
	 * 通过主键查询 Student 信息
	 * @param id
	 * @return
	 */
	@Override
	public Student getStudent(Integer id) {
		// 编写sql语句
		String sql = "SELECT id, name, age FROM Student WHERE id=?";
		// 执行的操作结果
		Student student = jdbcTemplate.queryForObject(sql, new Object[] {id}, new StudentMapper());
		// 返回 Student对象
		return student;
	}
	
	/**
	 * 查询所有的 Student 信息
	 * @return
	 */
	@Override
	public List<Student> listStudent() {
		// 编写 sql 语句
		String sql = "SELECT id, name, age FROM Student";
		// 执行的操作结果
		List<Student> studentList = jdbcTemplate.query(sql, new StudentMapper());
		// 返回一个List<T>集合对象
		return studentList;
	}
	
	/**
	 * 通过主键删除 Student 信息
	 * @param id
	 */
	@Override
	public void delete(Integer id) {
		String sql = "DELETE FROM Student WHERE id=?";
		jdbcTemplate.update(sql, id);
		System.out.println("Deleted Record with ID = " + id);
		return ;
	}
	
	/**
	 * 通过主键更新 Student中的 age信息
	 * @param id
	 * @param age
	 */
	@Override
	public void update(Integer id, Integer age) {
		String sql = "UPDATE Student SET age=? WHERE id=?";
		jdbcTemplate.update(sql, age, id);
		System.out.println("Update Record with ID = " + id);
		return ;
	}
	
}
