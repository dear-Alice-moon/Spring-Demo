package com.moon.bean.extend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanTemplate.xml");
		
		HelloIndia objA = (HelloIndia) context.getBean("helloIndia");
		
		
		System.out.println("objA为：" + objA.toString());
	}
	
	
}
