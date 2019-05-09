package com.moon.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;


/**
 * 	ContextStoppedEvent
 *  当使用 ConfigurableApplicationContext 接口中的 stop() 方法停止 ApplicationContext 时，
 *  发布这个事件。你可以在接受到这个事件后做必要的清理的工作。
 * 	
 */
public class ContextStopEventHandler implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("ContextStopEventHandler.java文件中， ContextStoppedEvent Received......");
		
	}
	
	
	
}
 