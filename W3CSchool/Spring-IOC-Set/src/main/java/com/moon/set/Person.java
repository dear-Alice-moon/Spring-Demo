package com.moon.set;

public class Person {
	
	private String name;
	
	private Person spouse;
	
	private Integer age;
	
	
	
	/**
	 * 重写toString()函数
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", spouse=" + spouse + ", age=" + age + "]";
	}
	
	
	/**
	 * 全参构造函数
	 * @param name
	 * @param spouse
	 * @param age
	 */
	public Person(String name, Person spouse, Integer age) {
		super();
		this.name = name;
		this.spouse = spouse;
		this.age = age;
	}
	
	
	/**
	 * 无参构造函数
	 */
	public Person() {
		super();
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Person getSpouse() {
		return spouse;
	}
	
	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
