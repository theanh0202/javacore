package com.vti.backend.service;

import com.vti.backend.repository.UserRepository;
import com.vti.entity.Department;
import com.vti.entity.User;

import java.util.List;

public class UserService implements IUserService {
    UserRepository userRepository = new UserRepository();

    @Override
    public User login(String username, String password) {
        return userRepository.login(username, password);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.getAllUser();
    }

    @Override
    public User findUserById(int id) {
        return userRepository.findUserById(id);
    }

    @Override
    public List<User> findUser(String key) {
        return userRepository.findUser(key);
    }

    @Override
    public void deleteUserById(int id) {
        userRepository.deleteUserById(id);
    }

    @Override
    public void updateUser(int id, String oldPassWord, String newPassWord) {
         userRepository.updateUser(id, oldPassWord, newPassWord);
    }

    @Override
    public void createUser(String userName, String email, String birthdate, int departmentid) {
        userRepository.createUser(userName, email, birthdate, departmentid);
    }

    @Override
    public List<Department> getAllDepartment() {
        return userRepository.getAllDepartment();
    }

    @Override
    public Department findDepartmentById(int id) {
        return userRepository.findDepartmentById(id);
    }

    @Override
    public List<Department> findDepartment(String key) {
        return userRepository.findDepartment(key);
    }

    @Override
    public void deleteDepartmentById(int id) {
        userRepository.deleteDepartmentById(id);
    }

    @Override
    public void updateDepartment(int id, String newDepartmentName) {
        userRepository.updateDepartment(id, newDepartmentName);
    }

    @Override
    public void createDepartment(String departmentName) {
        userRepository.createDepartment(departmentName);
    }

}

