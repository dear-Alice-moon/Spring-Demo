package com.moon.lifecycle;

public class HelloUser {
	
	private String msg;
	
	
	/**
	 * 初始化 HelloUser的Bean
	 */
	public void init() {
		System.out.println("HelloUser Bean is going through init.");
	}
	
	/**
	 * 销毁  HelloUser的Bean
	 */
	public void destroy() {
		System.out.println("HelloUser Bean will destroy now.");
	}
	
	
	
	// 重写toString()函数
	@Override
	public String toString() {
		return "HelloUser [msg=" + msg + "]";
	}
	
	// 全参构造函数
	public HelloUser(String msg) {
		super();
		this.msg = msg;
	}
	
	// 无参构造函数
	public HelloUser() {
		super();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
