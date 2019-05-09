package com.moon.autowired.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans-Constructor.xml");
		
		TextEditor te = (TextEditor) context.getBean("textEditor");
		
		te.spellCheck();
		System.out.println("-----------------------");
		System.out.println("TextEditor.java中的值为：" + te.toString());
	}
	
	
}
