package com.moon.aop.log;

public class Logging {
	
	private String message;
	
	private Integer num;
	
	
	
	public void printHello() {
		System.out.println("您好，世界.....");
	}
	
	
	/**
	 * 前置通知
	 * This is the method which I would like to execute
	 * before a selected method execution. 
	 */
	public void beforeAdvice() {
		System.out.println("Logging.java文件中，beforeAdvice()函数，Going to setup student profile.");
	}
	
	
	/**
	 * 后置通知
	 * This is the method which I would like to execute
	 * after a selected method execution.
	 */
	public void afterAdvice() {
		System.out.println("Logging.java文件中，afterAdvice()函数，  Student profile has been setup.");
	}
	
	
	/**
	 * 返回后通知
	 * This is the method which I would like to execute
	 * when any method returns.
	 * @param retVal
	 */
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Logging.java文件中，afterReturningAdvice()函数， Returning：" + retVal.toString());
	}
	
	
	/**
	 * 抛出异常后通知
	 * This is the method which I would like to execute
	 * if there is an exception raised.
	 * @param ex
	 */
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("Logging.java文件中，AfterThrowingAdvice()函数， There has been an exception: " + ex.toString());
	}
	
	
	
	/**
	 * 重写 toString() 函数
	 */
	@Override
	public String toString() {
		return "Logging [message=" + message + ", num=" + num + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param message
	 * @param num
	 */
	public Logging(String message, Integer num) {
		super();
		this.message = message;
		this.num = num;
	}
	
	/**
	 * 无参构造函数
	 */
	public Logging() {
		super();
	}
	
	
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
	
}
