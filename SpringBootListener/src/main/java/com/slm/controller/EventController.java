package com.slm.controller;

import com.slm.event.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    @Autowired
    private ApplicationEventPublisher publisher;
    @RequestMapping("/event")
    public String event(){
        publisher.publishEvent(new CustomEvent(this));
        return "事件执行";
    }
}
