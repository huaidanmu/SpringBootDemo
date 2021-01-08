package com.slm.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source){
        super(source);
    }
    public void printMessage(String message){
        System.out.println("打印事件信息:"+message);
    }
}
