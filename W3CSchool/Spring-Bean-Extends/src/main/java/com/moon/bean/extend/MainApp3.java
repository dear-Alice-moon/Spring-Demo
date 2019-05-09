package com.moon.bean.extend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp3 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		User1 objA = (User1) context.getBean("user1");
		System.out.println("objA的为：" + objA.toString());
		
		
	}
	
	
}
