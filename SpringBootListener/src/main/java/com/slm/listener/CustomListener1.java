package com.slm.listener;

import com.slm.event.CustomEvent;
import org.springframework.context.ApplicationListener;

public class CustomListener1 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("listener1监听到了");
    }
}
