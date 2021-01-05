package com.slm;

import com.slm.config.CarConfig;
import com.slm.config.PersonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//告诉主入口要引入配置文件
@EnableConfigurationProperties({PersonConfig.class})
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
