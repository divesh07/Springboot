package com.example.springboot.TechBlogApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan

// By defaults Controllers are registered to Spring IOC
// COmponent Scan - registers services , repo, entities with IOC
public class TechBlogApp {
    public static void main(String[] args) {
        SpringApplication.run(TechBlogApp.class, args);
    }

}
