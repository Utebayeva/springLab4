package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private com.example.demo.user.UserService userService;

    @RequestMapping(value = "/users")
    public List<com.example.demo.user.User> getAllUsers() {
        return userService.getAllUsers();
    }
}
