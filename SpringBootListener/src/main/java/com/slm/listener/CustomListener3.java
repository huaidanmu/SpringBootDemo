package com.slm.listener;

import com.slm.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListener3 {
    @EventListener
    public void listenerEvent(CustomEvent customEvent){
        customEvent.printMessage("listener3监听到了");
    }
}
