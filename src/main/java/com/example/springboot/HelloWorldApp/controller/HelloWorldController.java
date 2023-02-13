package com.example.springboot.HelloWorldApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @RequestMapping("/view")
    public String viewResolver(){
        return "index";
    }

	@RequestMapping("/spring")
	@ResponseBody
	public String helloSpring(){
		return "Hello Spring";
	}

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/test")
	public String test() {
		return "Hello World!";
	}
}
