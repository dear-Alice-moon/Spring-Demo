package com.moon.set;

public class TextEditor {
	
	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("TextEditor set spellChecker function......");
		this.spellChecker = spellChecker;
	}
	
	
	public void spellCheck() {
		spellChecker.printSpelling();
	}
	
	
}
