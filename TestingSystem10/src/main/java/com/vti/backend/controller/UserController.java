package com.vti.backend.controller;

import com.vti.backend.service.UserService;
import com.vti.entity.Department;
import com.vti.entity.User;

import java.util.List;

public class UserController {
    UserService userService = new UserService();

    public User login(String username, String password) {
        return userService.login(username, password);
    }

    public List<User> getAllUser() {
        return userService.getAllUser();
    }
    public User findUserById(int id){
        return (User) userService.findUserById(id);
    }
    public List<User> findUser(String key){
        return userService.findUser(key);
    }
    public void deleteUserById(int  id){
        userService.deleteUserById(id);
    }
    public void updateUser(int id, String oldPassWord, String newPassWord){
        userService.updateUser(id, oldPassWord, newPassWord);
    }
    public void createUser(String userName,String email, String birthdate , int departmentid){
        userService.createUser(userName, email, birthdate, departmentid);
    }
    public List<Department> getAllDepartment(){
        return  userService.getAllDepartment();
    }
    public Department findDepartmentById(int id){
        return userService.findDepartmentById(id);
    }
    public List<Department> findDepartment(String key){
        return userService.findDepartment(key);
    }
    public void deleteDepartmentById(int id){
        userService.deleteDepartmentById(id);
    }
    public void updateDepartment(int id , String newDepartmentName){
        userService.updateDepartment(id, newDepartmentName);
    }
    public void createDepartment( String departmentName){
        userService.createDepartment(departmentName);
    }
}
