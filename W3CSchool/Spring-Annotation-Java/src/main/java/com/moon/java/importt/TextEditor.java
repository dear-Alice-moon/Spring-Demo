package com.moon.java.importt;

public class TextEditor {
	
	private SpellChecker spellChecker;
	
	private String name;
	
	private Integer age;
	
	
	
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
	
	/**
	 * 仅含 SpellChecker 的构造函数
	 * @param spellChecker
	 */
	public TextEditor(SpellChecker spellChecker) {
		super();
		System.out.println("TextEditor.java文件中，仅含一个SpellChecker参数的构造函数.  Inside TextEditor constructor......");
		this.spellChecker = spellChecker;
	}
	
	
	
	/**
	 * 重写 toString() 函数
	 */
	@Override
	public String toString() {
		return "TextEditor [spellChecker=" + spellChecker + ", name=" + name + ", age=" + age + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param spellChecker
	 * @param name
	 * @param age
	 */
	public TextEditor(SpellChecker spellChecker, String name, Integer age) {
		super();
		this.spellChecker = spellChecker;
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 无参构造函数       
	 */
	public TextEditor() {
		super();
	}
	
	
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
