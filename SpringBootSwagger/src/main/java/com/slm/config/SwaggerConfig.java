package com.slm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                //查找生成哪些controller接口
                //RequestHandlerSelectors.any()获取所有接口
                //RequestHandlerSelectors.basePackage("com.slm.controller")获取指定包下面的接口
                .apis(RequestHandlerSelectors.basePackage("com.slm.controller"))
                //在查找出来的接口筛选
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }
    //自定义文档
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                //设置标题
                .title("SpringBootSwagger")
                //设置文档描述
                .description("这是一个简单的demo文档")
                //设置版本号
                .version("1.0")
                .build();
    }
}
