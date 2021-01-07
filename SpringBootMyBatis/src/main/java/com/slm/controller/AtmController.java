package com.slm.controller;

import com.slm.domain.Atm;
import com.slm.service.AtmService;
import com.slm.service.AtmServicePlus;
import com.slm.service.AtmServicePlusImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/atm")
public class AtmController {
//    @Autowired
//    private AtmService service;
    @Autowired
    private AtmServicePlus service;
    @GetMapping
    public String findAll(Model model){
        List<Atm> atmList = service.list();
        model.addAttribute("atmList",atmList);
        return "index";
    }
    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }
    @Transactional
    @PostMapping
    public String add(Atm atm){
        service.save(atm);
        String s = null;
        s.length();
        return "redirect:/atm";
    }

}
