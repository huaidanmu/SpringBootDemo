package com.slm.listener;

import com.slm.event.CustomEvent;
import org.springframework.context.ApplicationListener;

public class CustomListener4 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("listener4监听到了");
    }
}
