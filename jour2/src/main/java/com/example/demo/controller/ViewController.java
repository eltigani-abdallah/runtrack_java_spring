package com.example.demo.controller;



import com.example.demo.classes.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ViewController{

    private final Animal cat = new Animal ("kitty", 5, false);
    private final Animal dog = new Animal ("doggo", 2, true );

    private final ArrayList<Animal> animalList = new ArrayList<Animal>();

    public ArrayList<Animal> addAnimals(){
        animalList.clear();
        animalList.add(cat);
        animalList.add(dog);

        return animalList;
    }

    @GetMapping("/view")
    public String viewTemplate(Model model){
        model.addAttribute("message","job 2 is finished now");
        model.addAttribute("animalList", addAnimals());
        return "view";
    }



}