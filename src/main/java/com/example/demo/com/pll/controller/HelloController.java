package com.example.demo.com.pll.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description: 测试
 * @author: puLiangLu
 * @create: 2023-03-11 11:05
 **/
@RestController
public class HelloController {

    @RequestMapping("/test")
    public String test( String str){
        return str + "test";
    }
}
