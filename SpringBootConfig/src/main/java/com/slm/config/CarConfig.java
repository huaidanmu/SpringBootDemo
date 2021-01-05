package com.slm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//表示该类为配置类
@Configuration
//前缀
@ConfigurationProperties(prefix = "car")
//去哪读文件
@PropertySource("classpath:CarConfig.properties")
public class CarConfig {
    @Value("brand")
    private String brand;
    @Value("price")
    private String price;

    public CarConfig() {
    }

    public CarConfig(String brand, String price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
