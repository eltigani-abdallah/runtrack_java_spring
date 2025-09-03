package com.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


public class HelloController {


    public String hello(){
        return "Hello World!";
    }


    /*public String hello(@RequestParam(value= "name", defaultValue="World") String name){
        return String.format("Hello %s!", name);
    }*/
}
