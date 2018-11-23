package com.example.userservice.controller;

import com.example.userservice.application.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    @Autowired
    private UserService userService;


    @RequestMapping("/users")
    public String fetchUser() {
        return userService.fetchUser();
    }
}
