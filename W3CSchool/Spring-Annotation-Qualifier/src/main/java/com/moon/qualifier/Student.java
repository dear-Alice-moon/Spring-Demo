package com.moon.qualifier;

public class Student {
	
	private String name;
	
	private Integer age;
	
	
	
	
	/**
	 * 重写 toString()函数
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param name
	 * @param age
	 */
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 无参构造函数
	 */
	public Student() {
		super();
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
