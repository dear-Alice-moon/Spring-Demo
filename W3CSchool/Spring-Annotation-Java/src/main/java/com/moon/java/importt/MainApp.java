package com.moon.java.importt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		
		TextEditor text = context.getBean(TextEditor.class);
		SpellChecker spell = context.getBean(SpellChecker.class);
		
		text.spellCheck();
		System.out.println("----------------------------");
		spell.hello();
		
	}
	
}
