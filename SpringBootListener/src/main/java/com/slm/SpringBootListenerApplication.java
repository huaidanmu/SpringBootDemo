package com.slm;

import com.slm.listener.CustomListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootListenerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootListenerApplication.class, args);
        applicationContext.addApplicationListener(new CustomListener1());
    }

}
