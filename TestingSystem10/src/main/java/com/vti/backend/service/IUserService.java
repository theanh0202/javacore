package com.vti.backend.service;

import com.vti.entity.Department;
import com.vti.entity.User;

import java.util.List;

public interface IUserService {
    User login(String username, String password);

    List<User> getAllUser();

    User findUserById(int id);

    List<User> findUser(String key);

    void deleteUserById(int  id);

    void updateUser(int id, String oldPassWord, String newPassWord);

    void createUser(String userName,String email, String birthdate , int departmentid);

     List<Department> getAllDepartment();

     Department findDepartmentById(int id);

    List<Department> findDepartment(String key);

    void deleteDepartmentById(int id);

    void updateDepartment(int id, String newDepartmentName);

    void createDepartment( String departmentName);
}
