package com.huce.backend.controller;

import com.huce.backend.service.UserService;
import com.huce.entity.User;

import java.util.List;

public class UserController {
    UserService userService = new UserService();
    public User login(String email, String passWord){
        return userService.login(email, passWord);
    }
    public User findEmployeeByProjectId(int id){
        return userService.findEmployeeByProjectId(id);
    }
    public List<User> getAllUserIsManager(){
        return userService.getAllUserIsManager();
    }
}
