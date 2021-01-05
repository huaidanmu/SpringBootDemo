package com.slm.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "person")
@Data
public class PersonConfig {
    @Value("name")
    private String name;
    @Value("sex")
    private String sex;
    @Value("hobby")
    private String[] hobby;

    public PersonConfig() {
    }

    public PersonConfig(String name, String sex,String[] hobby) {
        this.name = name;
        this.sex = sex;
        this.hobby = hobby;
    }

}
