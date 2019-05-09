package com.moon.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("postProcessBeforeInitialization(..)函数中，参数bean值为：" + bean.toString());
		System.out.println("postProcessBeforeInitialization(..)函数中，参数beanName值为：" + beanName);
		
		System.out.println("---------------------------------------------------");
		
		return bean;
	}
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("postProcessAfterInitialization(..)函数中，参数bean值为：" + bean.toString());
		System.out.println("postProcessAfterInitialization(..)函数中，参数beanName值为：" + beanName);
		
		System.out.println("---------------------------------------------------");
		
		return null;
	}
	
	
	
}
