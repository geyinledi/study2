package com.zslin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by 钟述林 393156105@qq.com on 2016/10/18 8:58.
 */
@SpringBootApplication
public class RootApplication {

    public static void main(String [] args) {
    	SpringApplication.run(RootApplication.class, args);
//    	SpringApplication app = new SpringApplication(RootApplication.class);
//    	app.addListeners(new MyApplicationStartedEventListener());
//    	app.addListeners(new MyApplicationEnvironmentPreparedEventListener());
//    	app.addListeners(new MyApplicationEnvironmentPreparedEventListener());
//    	app.addListeners(new MyApplicationFailedEventListener());
//    	app.run(args);
    }
}
