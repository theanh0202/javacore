package com.vti.backend.repository;

import com.vti.Utils.JdbcUtils;
import com.vti.entity.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    public void createAccount(String username, String email, String password) {

        //tao cau query tuong ung voi chuc nang su dung
        String sql = "INSERT INTO jdbc.Account(fullname, email, password ) VALUES(?,?,?)";
        //ket noi voi database -> tao 1 phien lam viec
        Connection connection = JdbcUtils.getConnection();
        //tao statement tuong ung voi cau query(co bien chuyen vao :PreparedStatement)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //execute cau query -> lay ket qua (result)
            preparedStatement.setString(1, "username");
            preparedStatement.setString(2, "email");
            preparedStatement.setString(3, "password");
            //execute  cau query-> LAY ra ket qua
            int result = preparedStatement.executeUpdate();
            if (result == 0) {
                System.err.println("them moi that bai");
            } else {
                System.out.println("them moi thanh cong ");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        JdbcUtils.closeConnection();
        //kiem tra su thanh cong va thong bao

    }

    public List<Account> getAllAccount() {
        String sql = "SELECT*FROM";
        return null;
    }

    public void updateAccount(int id, String oldPassWord, String newPassWord) {
        String sql = "Set password=? where  account_id=? and password=?";
        try {
            Connection connection = JdbcUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newPassWord);
            preparedStatement.setInt(2, id);
            preparedStatement.setString(3, oldPassWord);
            preparedStatement.executeUpdate();
            int rs = preparedStatement.executeUpdate();
            if (rs == 0) {
                System.err.println("thay doi that bai");
            } else {
                System.out.println("thay doi thanh cong");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        JdbcUtils.closeConnection();

    }

    public void deleteAccount(int id) {
        String sql = "DELETE FROM jdbc.Account where account_id=?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            if (rs == 0) {
                System.out.printf("xoa that bai");
            } else {
                System.out.println("xao thanh cong");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            JdbcUtils.getConnection();
        }
    }

    public List<Account> findAllByEmail(String key) {
        String sql = "select* from jdbc.Account where email like ?";
        Connection connection = JdbcUtils.getConnection();
        String words = "%" + key + "%";
        List<Account> accountList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, words);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Account account = new Account();
                int accountID = resultSet.getInt("account_id");
                account.setAccountId(accountID);
                account.setFullName("full_name");
                account.setEmail("email");
                account.setPassword("password");
                accountList.add(account);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return accountList;
    }

    public boolean login(String email, String password) {
        String sql = "select* from jdbc.Account where account= ?; password=?";
        try {
            PreparedStatement preparedStatement = JdbcUtils.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, "email");
            preparedStatement.setString(2, "password");
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            JdbcUtils.closeConnection();
        }
    }
}
