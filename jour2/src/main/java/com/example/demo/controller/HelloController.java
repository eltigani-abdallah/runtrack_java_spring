package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }

    @Value("${greeting.message}")
    private String greetingMessage;

    @Value("${greeting.tools}")
    private String toolsMessage;

    @GetMapping("/profile")
    @ResponseBody
    public String greet(){
        return greetingMessage + toolsMessage;
    }



}
