package com.tutorialspoint.controll;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.dao.StudentDAO;
import com.tutorialspoint.pojo.StudentMarks;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		StudentDAO studentJDBCTemplate = (StudentDAO) context.getBean("studentJDBCTemplate");
		
		System.out.println("------------ Records creation ---------------");
		studentJDBCTemplate.create("zhangSan", 11, 99, 2010);
		studentJDBCTemplate.create("liSi", 20, 97, 2010);
		studentJDBCTemplate.create("wangWu", 25, 100, 2011);
		
		List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
		
		for (StudentMarks record : studentMarks) {
			System.out.print("ID：" + record.getId() );
			System.out.print(", Name：" + record.getName() );
			System.out.print(", Marks：" + record.getMarks());
			System.out.print(", Year：" + record.getYear());
			System.out.println(", Age：" + record.getAge());
		}
		
		
	}
	
}
