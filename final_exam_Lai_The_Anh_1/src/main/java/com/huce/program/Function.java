package com.huce.program;

import com.huce.backend.controller.UserController;
import com.huce.entity.User;
import com.huce.utils.ScannerUtils;

import java.util.List;

public class Function {
        UserController userController = new UserController();
        public User login() {
                System.out.println("moi ban nhap vao email");
                String email = ScannerUtils.inputString();
                System.out.println("moi ban nhap vao password");
                String password = ScannerUtils.inputPassword();
                return userController.login(email, password);
        }
        public List<User> getAllUserIsManager() {

                return userController.getAllUserIsManager();
        }
        public void findEmployeeByProjectId() {
                System.out.println("moi ban nhap vao project_id user muon tim kiem");
                int id = ScannerUtils.inputNumber();
                User user= userController.findEmployeeByProjectId(id);
                if (user  != null) {
                        String leftAlignFormat = "| %-3s| %-15s | %-15s | %-15s | %-3s | %-11s | %-11s |%n";
                        System.out.format("+----+---------------+-----------------+----------------+------+%n");
                        System.out.format("| id |   full_name   |       email     |     password   | role |%n");
                        System.out.format("+----+---------------+-----------------+----------------+------+%n");
                        System.out.format(leftAlignFormat, user.getId(), user.getFullName(), user.getEmail(), user.getPassWord(),
                                user.getRole().name());

                        System.out.format("+----+---------------+-----------------+----------------+------+%n");

                } else {
                        System.err.println("khong tim thay user");
                }



        }

}
