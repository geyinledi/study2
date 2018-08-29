package com.zslin.listener;

import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent>{

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
//		System.out.println(SpringApplicationRunListener.class);
	}

}
