package com.moon.exception.exception;

public class SpringException extends RuntimeException {
	
	private String exceptionMsg;
	
	
	
	/**
	 * 重写 toString()函数
	 */
	@Override
	public String toString() {
		return "SpringException [exceptionMsg=" + exceptionMsg + "]";
	}
	
	/**
	 * 全参构造函数
	 * @param exceptionMsg
	 */
	public SpringException(String exceptionMsg) {
		super();
		this.exceptionMsg = exceptionMsg;
	}
	
	/**
	 * 无参构造函数
	 */
	public SpringException() {
		super();
	}
	
	
	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	
}
