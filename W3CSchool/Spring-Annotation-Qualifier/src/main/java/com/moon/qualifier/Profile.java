package com.moon.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	
	@Autowired
	@Qualifier("student1")
	private Student student;
	
	
	public void printAge() {
		System.out.println("Profile.java中，printAge()函数。  Age: " + student.getAge());
	}
	
	public void printName() {
		System.out.println("Profile.java中，printName()函数。  Name: " + student.getName());
	}
	
	
	/**
	 * 重写 toString()函数
	 */
	@Override
	public String toString() {
		return "Profile [student=" + student + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param student
	 */
	public Profile(Student student) {
		super();
		this.student = student;
	}
	
	/**
	 * 无参构造函数
	 */
	public Profile() {
		super();
	}
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}
