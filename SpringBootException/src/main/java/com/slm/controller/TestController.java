package com.slm.controller;

import com.slm.domain.Atm;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(@Valid Atm atm, BindingResult result){
        System.out.println("test方法执行了");
        if(result.getErrorCount() > 0){
            List<FieldError> list = result.getFieldErrors();
            StringBuilder builder = new StringBuilder();
            for(FieldError error : list){
                builder.append(error.getField());
                builder.append("\t");
                builder.append(error.getDefaultMessage());
                builder.append("\n");
            }
            return builder.toString();
        }
        return "测试";
    }

}
