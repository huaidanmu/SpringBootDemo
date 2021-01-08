package com.slm.listener;

import com.slm.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListener2 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("listener2监听到了");
    }
}
