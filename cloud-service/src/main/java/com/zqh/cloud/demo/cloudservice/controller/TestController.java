package com.zqh.cloud.demo.cloudservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: ZHANG root
 * @Date: 2022/04/15
 * @Time: 22:02:18
 * @Description: cloud-demo
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @RequestMapping("/test")
    public Map<String,Object> test(){
        return new HashMap<>();
    }
}
