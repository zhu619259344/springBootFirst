package com.forezp.sbf.controller;

import com.forezp.sbf.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({User.class})
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @Autowired
    User user;

    @RequestMapping("/user")
    public String user(){
        return user.getName()+":"+user.getAge();
    }
}
