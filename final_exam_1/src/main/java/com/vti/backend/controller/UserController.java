package com.vti.backend.controller;

import com.vti.backend.service.UserService;
import com.vti.entity.Manager;
import com.vti.entity.User;

import java.util.List;

public class UserController {
    UserService userService=new UserService();
    public List<User> findAllUserByProjectId(int projectId){
        return userService.findAllUserByProjectId(projectId);
    }
    public User login(String email, String passWord) {
        return userService.login(email, passWord);
    }
    public List<Manager> getAllManagerForProject(){
        return userService.getAllManagerForProject();
    }

}
