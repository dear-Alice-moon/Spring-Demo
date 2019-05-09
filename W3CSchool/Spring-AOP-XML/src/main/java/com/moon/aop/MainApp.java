package com.moon.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moon.aop.log.Logging;
import com.moon.aop.service.Student;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Student student = (Student) context.getBean("student");
		
		System.out.println("student的值为： " + student.toString());
		System.out.println("------------------------------------------------------------");
		
		
		String msg= student.printHello();
		System.out.println("msg为：" + msg);
		System.out.println("=============================================================");
		
		student.printThrowException();
		
		
	}
	
}
