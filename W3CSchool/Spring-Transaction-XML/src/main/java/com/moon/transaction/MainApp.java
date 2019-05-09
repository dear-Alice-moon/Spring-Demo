package com.moon.transaction;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moon.transaction.dao.StudentDao;
import com.moon.transaction.pojo.StudentMarks;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		StudentDao studentJDBCTemplate = (StudentDao) context.getBean("studentJDBCTemplate");
		
		System.out.println("------------- Records creation -------------");
		studentJDBCTemplate.create("Zara", 11, 99, 2010);
		studentJDBCTemplate.create("Nuha", 20, 97, 2012);
		studentJDBCTemplate.create("Ayan", 25, 100, 2008);
		
		System.out.println("------------- Listing all the records -------------");
		List<StudentMarks> studentMarksList = studentJDBCTemplate.listStudents();
		
		for (StudentMarks record : studentMarksList) {
			System.out.print("ID: " + record.getId());
			System.out.print(", Name: " + record.getName());
			System.out.print(", Marks: " + record.getMarks());
			System.out.print(", Year: " + record.getYear());
			System.out.println(", Age: " + record.getAge());
		}
		
		
		
	}
	
	
}
