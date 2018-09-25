package com.hacker.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Hacker
 * @date：2018/9/25
 * @project SpringBootTest
 * @describe
 */
@Controller
public class HelloWorldController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
