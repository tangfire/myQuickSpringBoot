package com.fire.myquickspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @GetMapping("/hello")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        return "Hello World";
    }

    @RequestMapping(value = "/helloName",method = RequestMethod.GET)
    public String helloName(String nickname){
        return "Hello "+nickname;
    }

    @RequestMapping(value = "/helloPhone",method = RequestMethod.GET)
    public String helloPhone(String nickname,String phone){
        return "Hello "+nickname+" "+"phone "+phone;
    }




}
