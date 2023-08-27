package com.example.ReddClone_Middleware.controller;

import com.example.ReddClone_Middleware.model.User;
import com.example.ReddClone_Middleware.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserRepo  repo;

    @PostMapping("/addUser")
    public ResponseEntity<String> addPerson(@RequestBody User user){
//        repo.save(user);
        String responseMessage = "User added successfully";

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(responseMessage);
    }
}
