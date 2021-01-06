package com.slm.controller;

import com.slm.domain.Staff;
import com.slm.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private StaffService service;
    @GetMapping
    public String list(Model model){
        List<Staff> staffList = service.findAll();
        model.addAttribute("staffList",staffList);
        return "index";
    }
    //跳转添加
    @GetMapping("/toAdd")
    public String toAdd(){
        System.out.println("toAdd方法执行了");
        return "add";
    }
    //添加
    @PostMapping
    public String add(Staff staff){
        System.out.println("Add方法执行了");
        service.add(staff);
        return "redirect:/staff";
    }
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        System.out.println("toUpdate方法执行了"+name);
        Staff staff = service.findOne(name);
        model.addAttribute("staff",staff);
        return "update";
    }
    @PutMapping
    public String update(Staff staff){
        System.out.println("Update方法执行了");
        service.update(staff);
        return "redirect:/staff";
    }
    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        service.delete(name);
        return "redirect:/staff";
    }
}
