package com.vti.backend.service;

import com.vti.entity.Manager;
import com.vti.entity.User;

import java.util.List;

public interface IUserService {
    List<User> findAllUserByProjectId(int projectId);
     User login(String email,String passWord);
     List<Manager> getAllManagerForProject();
}
