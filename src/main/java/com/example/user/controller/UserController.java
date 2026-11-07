package com.example.user.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.usertesting.service.UserService;
import com.example.usertesting.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping
    public User getUser() {
        return service.getUser();
    }
}