package com.moon.scope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		System.out.println("执行1......");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans-Prototype.xml");
		System.out.println("执行2......");
		
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		
		objA.setMessage("I'm object A");
		
		System.out.println("objA为：" + objA);  // 返回： I'm object A
		System.out.println("objB为：" + objB);  // 返回：null
		
	}
	
	
}
