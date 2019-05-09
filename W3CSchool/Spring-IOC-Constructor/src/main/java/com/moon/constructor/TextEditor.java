package com.moon.constructor;

public class TextEditor {
	
	private SpellChecker spellChecker;
	
	
	/**
	 * 测试函数： 验证 一个 Bean 含多个参数。  TextEditor.java  2018/11/22  15:38         
	 */
	public void testForMultiEntity() {
		System.out.println("打印 TextEditor 实体类参数");
	}
	
	
	/**
	 * 测试函数： 输出  SpellChecker.java 中 checkSpelling() 函数中内容.
	 */
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
	/**
	 * 重写toString()函数
	 */
	@Override
	public String toString() {
		return "TextEditor [spellChecker=" + spellChecker + "]";
	}

	/**
	 * 全参构造函数
	 * @param spellChecker
	 */
	public TextEditor(SpellChecker spellChecker) {
		super();
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}
	
	/**
	 * 无参构造函数
	 */
	public TextEditor() {
		super();
	}
	
}
