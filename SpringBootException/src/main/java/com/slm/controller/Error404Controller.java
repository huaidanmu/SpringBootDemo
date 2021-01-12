package com.slm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Error404Controller {
    @RequestMapping("/error404")
    public String error404(){
        return "error404";
    }
    @RequestMapping("/testError")
    public String testError(){
        String s = null;
        s.length();
        return "";
    }
}
