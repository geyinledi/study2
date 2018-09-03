package com.zslin.controller;

import com.zslin.config.MyWebConfig;
import com.zslin.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 钟述林 393156105@qq.com on 2016/10/18 10:33.
 */
@RestController
@RequestMapping(value = "config") //rest接口风格，需要将类里的每个映射前加在/config之前
public class ConfigController {

    @Autowired
    private MyWebConfig myWebConfig;
    
    @Autowired
    private User user;

    
    @RequestMapping(value = "index1", method = RequestMethod.GET)
    public String index() {
    	
        return "webName: "+myWebConfig.getName()+", webVersion: "+
                myWebConfig.getVersion()+", webAuthor: "+myWebConfig.getAuthor()+
                ", title: "+myWebConfig.getTitle();
    }
    
    @RequestMapping(value = "/user/{user}",method = RequestMethod.GET)
    @ResponseBody
    public String sayWorld(@PathVariable("user") String name) {
    	System.out.println("userName:" + user.getName());
    	return "Hello" + name;
    }
}
