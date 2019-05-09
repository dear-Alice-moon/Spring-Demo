package com.moon.innerBeans;

public class SpellChecker {
	
	private String name;
	
	private Integer age;
	
	
	
	public void printSpelling() {
		System.out.println("Today is Thursday. 周四，你好。");
	}
	
	/**
	 * 重写 toString()函数
	 */
	@Override
	public String toString() {
		return "SpellChecker [name=" + name + ", age=" + age + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param name
	 * @param age
	 */
	public SpellChecker(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 无参构造函数
	 */
	public SpellChecker() {
		super();
		System.out.println("SpellChecker无参构造函数");
		System.out.println("Insid SpellChecker constructor.");
		System.out.println("--------------------------------------");
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
