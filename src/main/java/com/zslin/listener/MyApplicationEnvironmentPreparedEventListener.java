package com.zslin.listener;

import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class MyApplicationEnvironmentPreparedEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent>{

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
		System.out.println("spring boot对应Environment已经准备完毕，但此时上下文context还没有创建");
	}

}
