package com.moon.constructor;

public class MultiEntity {
	
	private SpellChecker spellChecker;
	
	private TextEditor textEditor;
	
	private int num;
	
	private String name;
	
	
	/**
	 * 测试函数： Spring中依赖注入--验证调用多个实体类参数 。
	 */
	public void speck() {
		spellChecker.testForMultiEntity();
		textEditor.testForMultiEntity();
		System.out.println("num值为：" + num);
		System.out.println("name值为：" + name);
	}
	
	
	/**
	 * 4个参数构造函数
	 * @param spellChecker
	 * @param textEditor
	 */
	public MultiEntity(SpellChecker spellChecker, TextEditor textEditor, int num, String name) {
		super();
		this.spellChecker = spellChecker;
		this.textEditor = textEditor;
		this.num = num;
		this.name = name;
	}
	
	
	/**
	 * 重写 toString() 函数
	 */
	@Override
	public String toString() {
		return "MultiEntity [spellChecker=" + spellChecker + ", textEditor=" + textEditor + ", num=" + num + ", name="
				+ name + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param spellChecker
	 * @param textEditor
	 */
	public MultiEntity(SpellChecker spellChecker, TextEditor textEditor) {
		super();
		this.spellChecker = spellChecker;
		this.textEditor = textEditor;
	}
	
	/**
	 * 无参构造函数
	 */
	public MultiEntity() {
		super();
	}
	
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public TextEditor getTextEditor() {
		return textEditor;
	}

	public void setTextEditor(TextEditor textEditor) {
		this.textEditor = textEditor;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
