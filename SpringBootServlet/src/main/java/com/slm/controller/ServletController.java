package com.slm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServletController {
    @RequestMapping("/servlet")
    public String testServlet(){
        System.out.println("-----testServlet---------");
        return "hello servlet";
    }
}
