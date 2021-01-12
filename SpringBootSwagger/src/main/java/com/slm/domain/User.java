package com.slm.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
//声明实体类
@ApiModel("用户")
public class User {
    //声明属性 用于接口参数展示
    @ApiModelProperty("用户名")
    private String name;
    @ApiModelProperty("性别")
    private String sex;
}
