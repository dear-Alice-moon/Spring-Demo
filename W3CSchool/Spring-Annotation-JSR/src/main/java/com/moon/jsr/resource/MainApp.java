package com.moon.jsr.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans-Resources.xml");
		
		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
		
		textEditor.spellCheck();
		System.out.println("-------------------------");
		System.out.println("textEditor中的值为：" + textEditor.toString());
	}
	
	
}
