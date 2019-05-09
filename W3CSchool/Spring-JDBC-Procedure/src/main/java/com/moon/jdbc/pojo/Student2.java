package com.moon.jdbc.pojo;

public class Student2 {
	
	private Integer id;  // 主键
	
	private String name;
	
	private Integer age;
	
	private String sex;
	
	private String address;
	
	// private String remark; // 备注
	
	
	
	
	/**
	 * 重写toString()函数
	 */
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", address=" + address + "]";
	}
	
	/**
	 * 5个参数构造函数，不含 remark 参数。
	 * @param id
	 * @param name
	 * @param age
	 * @param sex
	 * @param address
	 */
	public Student2(Integer id, String name, Integer age, String sex, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
	}
	
	/**
	 * 无参构造函数        
	 */
	public Student2() {
		super();
	}
	
	
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	/*
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	*/
	
}
