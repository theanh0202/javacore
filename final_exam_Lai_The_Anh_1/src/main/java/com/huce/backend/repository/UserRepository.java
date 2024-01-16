package com.huce.backend.repository;

import com.huce.entity.Manager;
import com.huce.entity.Role;
import com.huce.entity.User;
import com.huce.utils.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public User login(String email, String passWord){
        String sql ="SELECT * FROM final_java.user where email = ? and password = ? ";
        Connection connection = JdbcUtils.getConnection();

        try {
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,email);
            preparedStatement.setString(2,passWord);
            ResultSet resultSet=preparedStatement.executeQuery();
            if (resultSet.next()){
                User user = new User();
                user.setEmail(email);
                user.setEmail(resultSet.getString("email"));
                String roleString = resultSet.getString("role");
                user.setRole(Role.valueOf(roleString));
                return user;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            JdbcUtils.closeConnection();
        }
        return null;
    }
    public User findEmployeeByProjectId(int id){
        String sql = "SELECT * FROM final_java.user where project_id =? and role =employee";

        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                String roleString = resultSet.getString("role");
                user.setRole(Role.valueOf(roleString));
                user.setFullName(resultSet.getString("full_name"));
                user.setEmail(resultSet.getString("email"));
                return user;
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            ;
        } finally {
            JdbcUtils.closeConnection();
        }
        return null;
    }
    public List<User> getAllUserIsManager()  {
        List<User> userList = new ArrayList<>();
        String sql = "SELECT * FROM final_java.user where role = manager";
        Connection connection = JdbcUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                User user = new User();
                Manager manager=new Manager();
                user.setId(resultSet.getInt("id"));
                String roleString = resultSet.getString("role");
                user.setRole(Role.valueOf(roleString));
                user.setFullName(resultSet.getString("full_name"));
                user.setEmail(resultSet.getString("email"));
                manager.setExpInYear(resultSet.getString("exp"));
                manager.setProjectId(resultSet.getInt("project_id"));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeConnection();
        }
        return userList;
    }


}
