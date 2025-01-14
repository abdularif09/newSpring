package com.mobile.controller;


import com.mobile.entity.UserModel;

import com.mobile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/getAllUser")
    public List<UserModel> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping(path = "/userAddtion")
    public UserModel addUser(@RequestBody UserModel userModel){
        userService.insertUser(userModel);
       return userModel;
    }

    @PostMapping(path = "/deleteUser")
    public UserModel deletedUser(@RequestBody UserModel userModel){
        userService.deleteUser(userModel);
        return userModel;
    }

    @PostMapping(path = "/updateUser")
    public UserModel updateUser(@RequestBody UserModel userModel){
        userService.updateUser(userModel);
        return userModel;
    }
}
