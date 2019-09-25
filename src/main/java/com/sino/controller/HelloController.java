package com.sino.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouchengliang
 * @description
 * @date
 **/
@RestController
@RequestMapping("hello")
public class HelloController {
    @RequestMapping(value = "world")
    @ResponseBody
    public String sayHelloToWorld(){
        return "hello world !";
    }
    @RequestMapping(value = "java")
    @ResponseBody
    public String sayHelloToJava(){
        return "hello java !";
    }
    @RequestMapping(value = "jenkins")
    @ResponseBody
    public String sayHelloToJenkins(){
        return "hello jenkins !";
    }
}
