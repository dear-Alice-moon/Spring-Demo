package com.moon.java.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {
	
	@Bean
	public TextEditor textEditor() {
		// TextEditor.java中需要含仅有 SpellChecker 参数的构造函数
		return new TextEditor( spellChecker() );  
	}
	
	@Bean
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}
	
}
