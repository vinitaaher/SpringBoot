package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        System.out.println("Hi i m learning springboot");
        Alien obj=context.getBean(Alien.class);
        obj.display();
//        Alien obj1=context.getBean(Alien.class);
//        obj1.display();


    }

}
