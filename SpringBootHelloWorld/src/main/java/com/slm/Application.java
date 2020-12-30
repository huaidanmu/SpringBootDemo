package com.slm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        //调用SpringBoot静态方法启动主函数
        SpringApplication.run(Application.class,args);
    }
}
