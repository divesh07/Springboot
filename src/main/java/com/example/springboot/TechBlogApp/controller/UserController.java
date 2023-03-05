package com.example.springboot.TechBlogApp.controller;

import com.example.springboot.TechBlogApp.model.Post;
import com.example.springboot.TechBlogApp.model.User;
import com.example.springboot.TechBlogApp.service.PostService;
import com.example.springboot.TechBlogApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class UserController {

    @Autowired
    PostService postService;

    @Autowired
    UserService userService;

    @RequestMapping("/users/login")
    public String login(){
        return "users/login";
    }

    @RequestMapping("/users/registration")
    public String registration(){
        return "users/registration";
    }

    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public String loginUser(User user){
        if (userService.login(user)){
            return "redirect:/posts";
        }
        return "/users/login";
    }

    @RequestMapping(value = "/users/logout", method = RequestMethod.POST)
    public String logout(Model model){
        ArrayList<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);
        return "index";
    }

    @RequestMapping(value = "/users/registration", method=RequestMethod.POST)
    public String registerUser(User user) {
        return "users/login";
    }



}
