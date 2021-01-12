package com.slm.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ModelAndView handler(Exception e){
        System.out.println("有异常");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("message",e.getMessage());
        System.out.println("异常信息"+e.getMessage());
        return mv;
    }
}
