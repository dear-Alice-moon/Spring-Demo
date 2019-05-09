package com.moon.java.scope;

public class Student {
	
	private String name;
	
	private Integer age;
	
	private String address;
	
	
	
	
	/**
	 * 重写 toString()函数
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param name
	 * @param age
	 * @param address
	 */
	public Student(String name, Integer age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
