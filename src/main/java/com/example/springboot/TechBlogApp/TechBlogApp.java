package com.example.springboot.TechBlogApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
//@ComponentScan
//@EnableAutoConfiguration
// By defaults Controllers are registered to Spring IOC
// Component Scan - registers services , repo, entities with IOC
public class TechBlogApp {
    public static void main(String[] args) {
        SpringApplication.run(TechBlogApp.class, args);
    }

}
