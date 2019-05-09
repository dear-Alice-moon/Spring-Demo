package com.moon.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moon.aspectj.service.Student;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Student student = (Student) context.getBean("student");
		System.out.println("student的值为: " + student.toString());
		
		System.out.println("--------------------------------------");
		student.printThrowException();
		
	}
	
}
