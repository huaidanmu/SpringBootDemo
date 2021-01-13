package com.slm.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Component
//声明是一个端点 id表示名字
@Endpoint(id = "custom")
public class CustomPoint {

    @ResponseBody
    //端点访问处理时通过该注解查找
    @ReadOperation
    public Map<String,String> custom(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("name","hello");
        return map;
    }
}
