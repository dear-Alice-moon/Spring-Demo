package com.moon.bean.extend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		System.out.println("objA的为：" + objA.toString());
		
		System.out.println("--------------------------------------------");
		
		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		System.out.println("objB为：" + objB.toString());
		
	}
	
	
}
