package com.moon.java.importt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SpellCheckerConfig.class)
public class TextEditorConfig {
	
	@Bean
	public TextEditor textEditor() {
		// TextEditor.java中需要含仅有 SpellChecker 参数的构造函数
		// return new TextEditor( spellChecker() );  
		return new TextEditor( new SpellChecker() );  
	}
	
	
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}
	
}
