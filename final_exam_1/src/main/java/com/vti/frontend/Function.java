package com.vti.frontend;

import com.vti.backend.controller.UserController;
import com.vti.entity.Manager;
import com.vti.entity.Role;
import com.vti.entity.User;
import com.vti.utils.ScannerUtils;

import java.util.List;

public class Function {
    UserController userController=new UserController();
    public void findAllUserByProjectId(){
        System.out.println("moi ban nhapo vao projectid");
        int projectId= ScannerUtils.inputNumber();
        List<User>userList=userController.findAllUserByProjectId(projectId);
        System.out.println(userList);
        String leftAlignFormat = "| %-3s| %-8s | %-15s | %-15s |%n";
        System.out.format("+----+---------------+------------------+-----------------+%n");
        System.out.format("| id |   full_name   |       email      |        role     |%n");
        System.out.format("+----+---------------+------------------+-----------------+%n");
        for (User user : userList) {
            System.out.format(leftAlignFormat, user.getId(),user.getFullName(),user.getEmail(),user.getRole().name());
        }
        System.out.format("+----+---------------+------------------+------------------+%n");

    }
    public void login() {
        System.out.println("moi ban nhap vao email");
        String email=ScannerUtils.inputEmail();
        System.out.println("moi ban nhap vao password ");
        String password= ScannerUtils.inputString();
        User user= userController.login(email,password);
        while (user==null){
            System.out.println("moi ban nhap vao email");
             email=ScannerUtils.inputEmail();
            System.out.println("moi ban nhap vao password ");
             password= ScannerUtils.inputString();
             user= userController.login(email,password);
        }
        if (Role.MANAGER==user.getRole()){
            System.out.println("dang nhap gthanh cong");
        }else {
            System.out.println("ban khong co quyen dang nhap");
        }
    }
    public void getAllManagerForProject(){
        System.out.println("thong tin cac manager cua project la");
        List<Manager> managerList=userController.getAllManagerForProject();
        System.out.println(managerList);
        String leftAlignFormat = "| %-3s| %-8s | %-15s | %-15s |%n";
        System.out.format("+----+--------------+------------------+--------------------+%n");
        System.out.format("| id |   full_name  |       email      |        role        |%n");
        System.out.format("+----+--------------+------------------+--------------------+%n");
        for (User user : managerList) {
            System.out.format(leftAlignFormat, user.getId(),user.getFullName(),user.getEmail(),user.getRole().name());
        }
        System.out.format("+----+--------------+------------------+--------------=-----+%n");


    }

}
