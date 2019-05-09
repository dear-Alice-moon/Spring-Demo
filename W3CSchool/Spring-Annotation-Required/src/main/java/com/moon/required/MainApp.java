package com.moon.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Student student = (Student) context.getBean("student");
		
		System.out.println("Student.java中，name值为: " + student.getName());
		System.out.println("Student.java中，age值为: " + student.getAge());
		
	}
	
}
