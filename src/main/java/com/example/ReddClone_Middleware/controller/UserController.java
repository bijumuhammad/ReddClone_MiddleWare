package com.example.ReddClone_Middleware.controller;

import com.example.ReddClone_Middleware.model.User;
import com.example.ReddClone_Middleware.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.beans.PersistenceDelegate;

@RestController
public class UserController {

    @Autowired
    UserRepo  repo;

    @PostMapping("/addUser")
    public void addPerson(@RequestBody User user){
        repo.save(user);
    }
}
