package com.demo;

import jdk.nashorn.internal.runtime.PrototypeObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype") // if we removed this line by default scope is sinngletone.
public class Alien {
    private int aid;
    private String name;
    private String tech;
    @Autowired
    @Qualifier("lap1")
    Laptop laptop;

    Alien(){
        System.out.println("Object created");
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void display(){
        System.out.println("Hey , m in display");
        laptop.compile();
    }
}
