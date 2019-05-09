package com.moon.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;


/**
 * ContextStartedEvent
 * 当使用 ConfigurableApplicationContext 接口中的 start() 方法启动 ApplicationContext 时，
 * 该事件被发布。你可以调查你的数据库，或者你可以在接受到这个事件后重启任何停止的应用程序.
 * 
 */
public class ContextStartEventHandler implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		
		System.out.println("ContextStartEventHandler.java文件中， ContextStartedEvent Received...");
		
	}
	
}
