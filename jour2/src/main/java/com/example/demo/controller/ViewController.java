package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController{
    @GetMapping("/view")
    public String viewTemplate(Model model){
        model.addAttribute("message","job 2 is finished now");
        return "view";
    }
}