package com.vti.backend.repository;

import com.mysql.cj.jdbc.JdbcConnection;
import com.vti.entity.Manager;
import com.vti.entity.Role;
import com.vti.entity.User;
import com.vti.utils.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<User> findAllUserByProjectId(int projectId){
        List<User> userList=new ArrayList<>();
        String sql="select * from user where project_id = ?";
        Connection connection= JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(1,projectId);

            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                User user=new User();
                user.setId(resultSet.getInt("id"));
                user.setFullName(resultSet.getString("full_name"));
                user.setEmail(resultSet.getString("email"));
                user.setRole(Role.valueOf("Role"));
                userList.add(user);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }finally {
            JdbcUtils.closeConnection();
        }
        return userList;
    }

    public User login(String email,String passWord){
        String sql="select * from user where email=? and password = ?";
        Connection connection=JdbcUtils.getConnection();

        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,email);
            preparedStatement.setString(2,passWord);
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                User user=new User();
                user.setId(resultSet.getInt("id"));
                user.setFullName(resultSet.getString("full_name"));
                user.setEmail(resultSet.getString("email"));
                user.setRole(Role.valueOf(resultSet.getString("role").toUpperCase()));
                return user;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }finally {
            JdbcUtils.closeConnection();
        }
        return null;
    }
    public List<Manager> getAllManagerForProject()  {
        List<Manager> managerList = new ArrayList<>();
        String sql = "SELECT * FROM user WHERE role = 'manager' ORDER BY PROJECT_ID";
        Connection connection = JdbcUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Manager manager = new Manager();
                manager.setId(resultSet.getInt("id"));
                manager.setFullName(resultSet.getString("full_name"));
                manager.setEmail(resultSet.getString("email"));
                manager.setRole(Role.MANAGER);
                manager.setExpInYear(resultSet.getInt("exp"));
                manager.setProjectId(resultSet.getInt("project_id"));
                managerList.add(manager);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            JdbcUtils.closeConnection();
        }
        return managerList;
    }

}
