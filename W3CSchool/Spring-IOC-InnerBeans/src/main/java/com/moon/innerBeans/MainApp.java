package com.moon.innerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
		
		System.out.println("初始化TextEditor类，并调用spellCheck()函数...");
		textEditor.spellCheck();
		System.out.println("-------------------------");
		System.out.println("TextEditor.java值为：" + textEditor.toString());
	}
	
	
}
