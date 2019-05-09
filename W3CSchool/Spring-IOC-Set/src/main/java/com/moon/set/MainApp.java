package com.moon.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
		
		System.out.println("初始化TextEditor类，并调用spellCheck()函数...");
		textEditor.spellCheck();
	}
	
	
}
