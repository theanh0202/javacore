package com.huce.backend.service;

import com.huce.entity.User;

import java.util.List;

public interface IUserService {
     User login(String email, String passWord);
     User findEmployeeByProjectId(int id);
     List<User> getAllUserIsManager();
}
