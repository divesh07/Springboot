package com.example.springboot.TechBlogApp.service;

import com.example.springboot.TechBlogApp.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean login(User user){
        if ( user.getUsername().equals("validuser")){
            return true;
        }

        return false;
    }
}
