package com.web.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class WebConfig {
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> customizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(9999);
            }
        };
    }
    @Bean
    public ApplicationRunner runner(WebServerApplicationContext context){
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
                System.out.println("runner当前web实现类为"+context.getWebServer().getClass().getName());
            }
        };
    }
    @EventListener
    public void onWebServer(WebServerInitializedEvent event){
        System.out.println("onWebServer当前web实现类为"+event.getWebServer().getClass().getName());
    }
}
