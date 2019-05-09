package com.moon.jdbc.pojo;

public class Student3 {
	
	private Integer te_Id;  // 主键
	
	private String te_Name;
	
	private Integer te_Age;
	
	private String te_sex;
	
	private String te_address;
	
	private String te_remark; // 备注
	
	
	
	
	
	/**
	 * 重写 toString()函数
	 */
	@Override
	public String toString() {
		return "Student3 [te_Id=" + te_Id + ", te_Name=" + te_Name + ", te_Age=" + te_Age + ", te_sex=" + te_sex
				+ ", te_address=" + te_address + ", te_remark=" + te_remark + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param te_Id
	 * @param te_Name
	 * @param te_Age
	 * @param te_sex
	 * @param te_address
	 * @param te_remark
	 */
	public Student3(Integer te_Id, String te_Name, Integer te_Age, String te_sex, String te_address, String te_remark) {
		super();
		this.te_Id = te_Id;
		this.te_Name = te_Name;
		this.te_Age = te_Age;
		this.te_sex = te_sex;
		this.te_address = te_address;
		this.te_remark = te_remark;
	}
	
	/**
	 * 无参构造函数
	 */
	public Student3() {
		super();
	}
	
	
	
	public Integer getTe_Id() {
		return te_Id;
	}

	public void setTe_Id(Integer te_Id) {
		this.te_Id = te_Id;
	}

	public String getTe_Name() {
		return te_Name;
	}

	public void setTe_Name(String te_Name) {
		this.te_Name = te_Name;
	}

	public Integer getTe_Age() {
		return te_Age;
	}

	public void setTe_Age(Integer te_Age) {
		this.te_Age = te_Age;
	}

	public String getTe_sex() {
		return te_sex;
	}

	public void setTe_sex(String te_sex) {
		this.te_sex = te_sex;
	}

	public String getTe_address() {
		return te_address;
	}

	public void setTe_address(String te_address) {
		this.te_address = te_address;
	}

	public String getTe_remark() {
		return te_remark;
	}

	public void setTe_remark(String te_remark) {
		this.te_remark = te_remark;
	}
	
}
