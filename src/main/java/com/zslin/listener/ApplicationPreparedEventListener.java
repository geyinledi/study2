package com.zslin.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent>{

	@Override
	public void onApplicationEvent(ApplicationPreparedEvent event) {
		System.out.println("spring boot 上下文context创建完成，但此时spring中的bean是没有完全加载完成的。");
	}

}
