package com.vti.program;

import com.vti.Utils.ScannerUtils;
import com.vti.backend.controller.UserController;
import com.vti.entity.Department;
import com.vti.entity.User;

import java.util.List;

public class Function2 {
    UserController userController = new UserController();

    public User login() {
        System.out.println("moi ban nhap vao username");
        String username = ScannerUtils.inputString();
        System.out.println("moi ban nhap vao password");
        String password = ScannerUtils.inputPassword();
        return userController.login(username, password);
    }

    public void getAllUser() {
        List<User> userList = userController.getAllUser();
        String leftAlignFormat = "| %-3s| %-8s | %-15s | %-17s | %-15s | %-15s |%n";
        System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
        System.out.format("| id |   role   |     username    |        email      | date_of_birth   | department_name |%n");
        System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
        for (User user : userList) {
            System.out.format(leftAlignFormat, user.getId(), user.getRole().name(), user.getUserName(), user.getEmail(),
                    user.getDateOfBirth(), user.getDepartment().getDepartmentName());
        }
        System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
    }

    public void findUserById() {
        System.out.println("moi ban nhap vao id user muon tim kiem");
        int id = ScannerUtils.inputNumber();
        User user= userController.findUserById(id);
        if (user  != null) {
            String leftAlignFormat = "| %-3s| %-8s | %-15s | %-17s | %-15s | %-15s |%n";
            System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
            System.out.format("| id |   role   |     username    |        email      | date_of_birth   | department_name |%n");
            System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
                System.out.format(leftAlignFormat, user.getId(), user.getRole().name(), user.getUserName(), user.getEmail(),
                        user.getDateOfBirth(), user.getDepartment().getDepartmentName());

            System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");

        } else {
            System.err.println("khong tim thay user");
        }

    }

    public void  findUser() {
        System.out.println("moi ban nhap vao tu muon tim kiem");
        String key = ScannerUtils.inputString();
        List<User> userList = userController.findUser(key);
        String leftAlignFormat = "| %-3s| %-8s | %-15s | %-17s | %-15s | %-15s |%n";
        System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
        System.out.format("| id |   role   |     username    |        email      | date_of_birth   | department_name |%n");
        System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
        for (User user : userList) {
            System.out.format(leftAlignFormat, user.getId(), user.getRole().name(), user.getUserName(), user.getEmail(),
                    user.getDateOfBirth(), user.getDepartment().getDepartmentName());
        }
        System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
    }

    public void deleteUserById(){
        System.out.println("nhap vao id user muon xoa");
        int id = ScannerUtils.inputNumber();
        User user= userController.findUserById(id);
        if (user ==null){
            System.out.println("xoa that bai");
        }else {
            userController.deleteUserById(id);
        }
    }

    public void updateUser(){
        System.out.println("nhap vao userid muon thay doi pasword ");
        int id = ScannerUtils.inputNumber();
        System.out.println("nhap vao password cu");
        String oldPassWord = ScannerUtils.inputString();
        System.out.println("nhap vao password moi");
        String newPassWord = ScannerUtils.inputString();
        userController.updateUser(id,oldPassWord,newPassWord);
    }

    public void createUser(){
        System.out.println("nhap vao ten user ");
        String userName = ScannerUtils.inputString();
        System.out.println("nhap vao emai ");
        String email = ScannerUtils.inputEmail();
        System.out.println("moi ban nhap vao nagy sinh ");
        String birthdate= ScannerUtils .inputString();
        System.out.println("moi ban nhap vao chon phong ban");
        System.out.println("java");
        System.out.println("php");
        System.out.println("scrum matter");
        int departmentid = ScannerUtils.inputNumber(1,3);
        userController.createUser(userName, email, birthdate, departmentid);
    }

    public void getAllDepartment(){
        List<Department> departmentList=userController.getAllDepartment();
        String leftAlignFormat = "| %-3s| %-15s |%n";
        System.out.format("+----+---------------------+%n");
        System.out.format("| id |   department_name   |%n");
        System.out.format("+----+---------------------+%n");
        for (Department department : departmentList) {
            System.out.format(leftAlignFormat,department.getDepartmentId(), department.getDepartmentName());
        }
        System.out.format("+----+---------------------+%n");
    }

    public void findDepartmentById(){
        System.out.println("nhap vao id ban muon tim kiem ");
        int id = ScannerUtils.inputNumber();
        Department department= userController.findDepartmentById(id);
        if (department != null){
            String leftAlignFormat = "| %-3s| %-15s |%n";
            System.out.format("+----+---------------------+%n");
            System.out.format("| id |   department_name   |%n");
            System.out.format("+----+---------------------+%n");
            System.out.format(leftAlignFormat,department.getDepartmentId(), department.getDepartmentName());
            System.out.format("+----+---------------------+%n");
        }
        else {
            System.out.println("khong tim thay department vs id ban can tim");
        }
    }

    public void findDepartment(){
        System.out.println("moi ban nhap vao tu muon tim kiem");
        String key=ScannerUtils.inputString();
        List<Department>departmentList=userController.findDepartment(key);
        String leftAlignFormat = "| %-3s| %-15s |%n";
        System.out.format("+----+---------------------+%n");
        System.out.format("| id |   department_name   |%n");
        System.out.format("+----+---------------------+%n");
        for (Department department : departmentList) {
            System.out.format(leftAlignFormat,department.getDepartmentId(), department.getDepartmentName());
        }
        System.out.format("+----+---------------------+%n");
    }

    public void deleteDepartmentById(){
        System.out.println("nhap vao id muon xoa");
        int id = ScannerUtils.inputNumber();
        Department department= userController.findDepartmentById(id);
        if (department == null){
            System.err.println("xoa that bai");
        }else {
            userController.deleteDepartmentById(id);
        }
    }

    public void updateDepartment(){
        System.out.println("nhap vao departmentid muon thay doi ten");
        int id = ScannerUtils.inputNumber();

        System.out.println("nhap vao departmentName moi");
        String newDepartmentName=ScannerUtils.inputString();
        userController.updateDepartment(id,newDepartmentName);
    }

    public void createDepartment( ){
        System.out.println("nhap vao ten departmentname muon them");
        String departmentName=ScannerUtils.inputString();
        userController.createDepartment(departmentName);
    }
}
