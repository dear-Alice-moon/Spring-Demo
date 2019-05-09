package com.moon.autowired.constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	private SpellChecker spellChecker;
	
	private String name;
	
	private Integer age;
	
	
	public void spellCheck() {
		System.out.println("TextEditor.java文件中。  spellCheck()函数...");
		spellChecker.checkSpelling();
	}
	
	
	
	/**
	 * 重写 toString()函数
	 */
	@Override
	public String toString() {
		return "TextEditor [spellChecker=" + spellChecker + ", name=" + name + ", age=" + age + "]";
	}
	
	
	/**
	 * 仅含一个参数的构造函数
	 * @param spellChecker
	 */
	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		super();
		this.spellChecker = spellChecker;
	}
	
	/**
	 * 全参构造函数
	 * @param spellChecker
	 * @param name
	 * @param age
	 */
	// @Autowired  // 根据Beans-Constructor.xml配置，不可在该构造函数上添加 @Autowired注解，否则报错。
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
