package com.moon.java.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 基于 Java 的配置
 * 注入 Bean 的依赖性
 *
 */
public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		
		TextEditor text = context.getBean(TextEditor.class);
		text.spellCheck();
	}
	
}
