package com.moon.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
	
	public static void main(String[] args) {
		
		// ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");
		
		Person person = (Person) context.getBean("john-classic");
		
		System.out.println("Person中信息参数为：" + person.toString());
		
	}
	
	
}
