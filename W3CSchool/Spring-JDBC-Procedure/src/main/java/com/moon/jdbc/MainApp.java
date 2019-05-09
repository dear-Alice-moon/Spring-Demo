package com.moon.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moon.jdbc.dao.impl.StudentJDBCTemplate;
import com.moon.jdbc.pojo.Student;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
		
		
		System.out.println("-------------- Records Creation --------------");
		studentJDBCTemplate.create(1011, "李雨菲", 18);
		studentJDBCTemplate.create(1012, "王红", 22);
		studentJDBCTemplate.create(1013, "赵晓燕", 25);
		
		
		System.out.println("-------------- Listing Multiple Records --------------");
		List<Student> listStudents = studentJDBCTemplate.listStudents();
		
		for (Student record : listStudents) {
			System.out.println("Student值为： " + record.toString());
		}
		
		
		System.out.println("-------------- Listing Multiple Records --------------");
		Student student = studentJDBCTemplate.getStudent(1001);
		System.out.println("Student值为： " + student.toString());
		
	}
	
}
