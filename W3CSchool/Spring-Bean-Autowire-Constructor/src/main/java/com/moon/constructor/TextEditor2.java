package com.moon.constructor;

public class TextEditor2 {
	
	private SpellChecker spellChecker;
	
	private String name;
	
	private Integer age;
	
	private Long id;
	
	
	public void spellCheck() {
		System.out.println("TextEditor.java文件中。  spellCheck()函数...");
		spellChecker.checkSpelling();
	}
	
	
	
	/**
	 * 重写 toString()函数
	 */
	@Override
	public String toString() {
		return "TextEditor2 [spellChecker=" + spellChecker + ", name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	
	public TextEditor2(SpellChecker spellChecker, String name, Integer age, Long id) {
		super();
		this.spellChecker = spellChecker;
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	
	/**
	 * 3个参数构造函数
	 * @param spellChecker
	 * @param name
	 * @param age
	 */
	public TextEditor2(SpellChecker spellChecker, String name, Integer age) {
		super();
		this.spellChecker = spellChecker;
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 仅含2个参数的构造函数
	 * @param name
	 * @param age
	 */
	public TextEditor2(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * 仅含一个参数的构造函数
	 * @param spellChecker
	 */
	public TextEditor2(SpellChecker spellChecker) {
		super();
		this.spellChecker = spellChecker;
	}
	
	/**
	 * 无参构造函数
	 */
	public TextEditor2() {
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
