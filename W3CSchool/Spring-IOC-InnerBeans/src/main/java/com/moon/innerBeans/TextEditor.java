package com.moon.innerBeans;

public class TextEditor {
	
	private String test;
	
	private SpellChecker spellChecker;
	
	
	public void spellCheck() {
		spellChecker.printSpelling();
	}
	
	
	
	@Override
	public String toString() {
		return "TextEditor [test=" + test + ", spellChecker=" + spellChecker + "]";
	}
	
	public TextEditor(String test, SpellChecker spellChecker) {
		super();
		this.test = test;
		this.spellChecker = spellChecker;
	}
	
	public TextEditor() {
		super();
	}
	

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("TextEditor set spellChecker function......");
		this.spellChecker = spellChecker;
	}
	
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
}
