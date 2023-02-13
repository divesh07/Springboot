package com.example.springboot.TechBlogApp.controller;
import com.example.springboot.TechBlogApp.model.Post;
import com.example.springboot.TechBlogApp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class TechBlogController {
    // Spring provides a model class in which we can pass data
    // from Controller to View ( Thymeleaf )

    /* Thymeleaf -
        - framework provided by Spring
        - It's a View template engine
        - provides View resolver
        - takes model returned by Controller and render it in HTML web page
     */

    public TechBlogController(){
        System.out.println("********* Home Controller *********");
    }
    @Autowired
    private PostService postService;
    // Gets instance of PostService to Controller

    @RequestMapping("/")
    public String getAllPosts(Model model){
        // Post class is not registered with IOC container , so we have to instantiate to use it
        // This is hard coded model object which represents data in the application


        // this model object needs to passed to view , so that view can render it
        // Model has 3 scope - application ( info available to all users )
        // Session scope - info available to one specific user
        // Request scope - within context of request ( Http request - response )


        ArrayList<Post> posts = postService.getAllPosts();
        // posts is the key which would be used by View resolver ( thymeleaf ) to render data
        model.addAttribute("posts", posts);

        return "index";
    }
}
