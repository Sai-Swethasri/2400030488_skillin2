package com.example.usertesting.service;

import org.springframework.stereotype.Service;
import com.example.usertesting.model.User;

@Service
public class UserService {

    public User getUser() {
        return new User(1, "Swetha");
    }
}