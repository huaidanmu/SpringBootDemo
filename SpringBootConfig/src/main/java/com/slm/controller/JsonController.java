package com.slm.controller;

import com.slm.config.CarConfig;
import com.slm.config.PersonConfig;
import com.slm.domain.Car;
import com.slm.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
//    @Value("${person.name}")
//    private String name;
//    @Value("${person.sex}")
//    private String sex;
    @Autowired
    private PersonConfig personConfig;
    @Autowired
    private CarConfig carConfig;
    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;
    @RequestMapping("/json")
    public Person testJson(){
        System.out.println("testJson方法执行了");
        //Person p = new Person(personConfig.getName(),personConfig.getSex());
        Person p = new Person(personConfig.getName(),personConfig.getSex(),personConfig.getHobby());
        return p;
    }
    //加密
    @RequestMapping("/jasypt")
    public String jasypt(){
        StringBuilder builder = new StringBuilder();
        builder.append("username:");
        builder.append(username);
        builder.append("\t");
        builder.append("password:");
        builder.append(password);
        return builder.toString();
    }
}
