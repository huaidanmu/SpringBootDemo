package com.slm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello方法执行了");
        return "Hello slm";
    }
}
