package com.vti.backend.service;

import com.vti.backend.repository.UserRepository;
import com.vti.entity.Manager;
import com.vti.entity.User;

import java.util.List;

public class UserService implements IUserService{
    UserRepository userRepository=new UserRepository();


    @Override
    public List<User> findAllUserByProjectId(int projectId) {
        return userRepository.findAllUserByProjectId(projectId);
    }

    @Override
    public User login(String email, String passWord) {
        return userRepository.login(email, passWord);
    }

    @Override
    public List<Manager> getAllManagerForProject() {
        return userRepository.getAllManagerForProject();
    }


}
