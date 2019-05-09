package com.moon.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moon.jdbc.dao.impl.StudentJDBCTemplate;
import com.moon.jdbc.pojo.Student;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		StudentJDBCTemplate studentJDBCTem = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
		
		System.out.println("--------------- Records Creation -------------");
		studentJDBCTem.create(1001, "宋江", 230);
		studentJDBCTem.create(1002, "孙二娘", 210);
		studentJDBCTem.create(1003, "武松", 220);
		
		System.out.println("--------------- Listing Multiple Records -------------");
		List<Student> studentList = studentJDBCTem.listStudent();
		for (Student student : studentList) {
			System.out.println("student为： " + student.toString());
		}
		
		System.out.println("--------------- Updating Record with ID = 2 -------------");
		studentJDBCTem.update(2, 22);
		
		System.out.println("--------------- Listing Record with ID = 2 -------------");
		Student student = studentJDBCTem.getStudent(2);
		System.out.println("student值为：" + student.toString());
		
		
	}
	
}
