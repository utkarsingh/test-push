package com.docster.internal.controller;

import com.docster.internal.entity.UserEntity;
import com.docster.internal.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @Autowired
    UserEntity user;


    @GetMapping(path="/{id}")
    public Optional<UserEntity> findUserById(@PathVariable int id){
        return userRepo.findById(id);

    }

    @PostMapping("/save")
    public String saveUser(@RequestBody UserEntity user1){
        userRepo.save(user1);
        return "Success";

    }

}
