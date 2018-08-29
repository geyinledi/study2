package com.zslin.listener;

import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

public class MyApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent>{

	@Override
	public void onApplicationEvent(ApplicationFailedEvent event) {
		System.out.println("spring boot启动异常时执行事件！");
	}

}
