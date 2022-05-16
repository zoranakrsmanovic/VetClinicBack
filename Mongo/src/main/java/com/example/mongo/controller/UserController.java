package com.example.mongo.controller;


import com.example.mongo.entity.User;
import com.example.mongo.repository.iUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public iUserRepository userRepository;

    @GetMapping("/all")
    @CrossOrigin(origins="*")
    private List<User> findAll() {return userRepository.findAll();}

    @PostMapping(path = "/login")
    public User loginUser(@RequestBody User user) throws Exception {
        String tempEmail = user.getEmail();
        String tempPassword= user.getPassword();
        User userObj = null;
        if(tempEmail != null && tempPassword != null){
            userObj =userRepository.findByEmailAndPassword(tempEmail,tempPassword);
        }
        if(userObj == null){
            throw new Exception("This user does not exists");
        }
        return userObj;

    }




}
