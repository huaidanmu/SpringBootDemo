package com.slm.controller;

import com.slm.domain.Atm;
import com.slm.service.AtmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/atm")
public class AtmController {
    @Autowired
    private AtmService service;
    @GetMapping
    public String findAll(Model model){
        System.out.println("controller方法执行了");
        List<Atm> atmList = service.findAll();
        System.out.println(atmList);
        model.addAttribute("atmList",atmList);
        return "index";
    }
}
