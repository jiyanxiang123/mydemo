package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FreemakerDemo {
    @RequestMapping("/index")
    public String index(ModelMap map){
        map.put("name","季琰翔");
        return "free";
    }

    @RequestMapping("/except")
    @ResponseBody
    public String exce(){
        throw new RuntimeException("全局异常测试");

    }
}
