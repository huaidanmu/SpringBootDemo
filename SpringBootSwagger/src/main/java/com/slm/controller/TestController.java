package com.slm.controller;

import com.slm.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

@RestController
//tags接口名
@Api(tags = "测试接口")
public class TestController {
    //声明具体接口的功能
    @ApiOperation("查询全部用户的信息")
    @GetMapping("/findAll")
    public String findAll(){
        return "list";
    }
    @ApiOperation("删除信息")
    @ApiImplicitParam(name = "name",value = "用户名")
    @DeleteMapping("/delete")
    public String delete(String name){
        return "delete";
    }
    @ApiOperation("更新")
    @PutMapping("update")
    public String update(User user){
        return "update";
    }
    @ApiOperation("新增用户")
    @PostMapping("/add")
    public String add(User user){
        return "add";
    }
}
