package com.moon.event;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent event) {
		
		System.out.println("CustomEventHandler.java文件，  " + event.toString());
	}
	
	
}
