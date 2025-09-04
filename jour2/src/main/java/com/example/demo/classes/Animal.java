package com.example.demo.classes;

public class Animal {

    private String name;
    private int age;
    private boolean vax;


    public Animal (String name, int age, boolean vax){
        this.name =name;
        this.age=age;
        this.vax=vax;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean getVax(){
        return vax;
    }



}
