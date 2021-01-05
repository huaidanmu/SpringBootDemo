package com.slm.controller;

import com.slm.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class TemplateController {
    @RequestMapping("ftl")
    public String testFtl(Model model){
        model.addAttribute("now",new Date().toString());
        System.out.println("ftl方法执行了");
        return "/freemarker/test";
    }
    @RequestMapping("testThymeleaf")
    public String testThymeleaf(Model model){
        System.out.println("testThymeleaf方法执行了");
        model.addAttribute("now","<h1>"+new Date().toString()+"</h1>");
        Person p = new Person();
        p.setName("刘阿毛");
        p.setSex("男");
        model.addAttribute("person",p);
        return "/thymeleaf/index";
    }
    @RequestMapping("welcome")
    public String welcome(){
        return "/thymeleaf/welcome";
    }
}
