package com.huce.backend.service;

import com.huce.backend.repository.UserRepository;
import com.huce.entity.User;

import java.util.List;

public class UserService  implements IUserService{
         UserRepository userRepository= new UserRepository();

    @Override
    public User login(String email, String passWord) {
        return userRepository.login(email, passWord);
    }

    @Override
    public User findEmployeeByProjectId(int id) {
        return userRepository.findEmployeeByProjectId(id);
    }

    @Override
    public List<User> getAllUserIsManager() {
        return userRepository.getAllUserIsManager();
    }
}
