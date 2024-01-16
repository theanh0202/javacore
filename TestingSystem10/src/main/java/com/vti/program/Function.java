//package com.vti.frontend;
//
//import com.vti.Utils.ScannerUtils;
//import com.vti.backend.controller.AccountController;
//import com.vti.entity.Account;
//
//import java.util.List;
//
//public class Function {
//    AccountController controller=new AccountController();
//
//    public void updateAccount(){
//
//        System.out.println("moi ban nhap vao id nguoi dung muon thay doi passwword ");
//        int id = ScannerUtils.InputNumber();
//        System.out.println("nhap vao passsword cu ");
//        String oldPassWord=ScannerUtils.InputPassWord();
//        System.out.println("nhap vao passsword moi");
//        String newPassWord=ScannerUtils.InputPassWord();
//        example.updateAccount(id,oldPassWord,newPassWord);
//
//    }
//    public void deleteAccount(){
//        System.out.println("nhap vao id nguoi dung muon xoa");
//        int id=ScannerUtils.InputNumber();
//        example.deleteAccount(id);
//
//    }
//    public void findByEmail(){
//        System.out.println("nhap vao tu khoa can tim");
//        String key = ScannerUtils.inputstring();
//        List<Account> accounts = example.getAllAccount();
//        String leftAlignFormat = "| %-3s| %-15s | %-17s | %-15s |%n";
//        System.out.format("+----+-----------------+-------------------+-----------------+%n");
//        System.out.format("| id |     fullName    |       email       |     password    |%n");
//        System.out.format("+----+-----------------+-------------------+-----------------+%n");
//        for (Account account: accounts ) {
//            System.out.format(leftAlignFormat, account.getAccountId(), account.getFullName(), account.getEmail(), account.getPassword());
//        }
//        System.out.format("+----+-----------------+-------------------+-----------------+%n");
//
//
//    }
//    public void getAllAccount(){
//
//    }
//    public void login(){
//        System.out.println("moi nguoi dung nhap vao email");
//        String email  =ScannerUtils.InputEmail();
//        System.out.println("moi ban nhap vao password");
//        String password= ScannerUtils.InputPassWord();
//        if(example.login(email,password)){
//            System.out.println("dang nhap thanh cong");
//
//        }else {
//            System.out.println("dang nhap thnat bai");
//        }
//
//    }
//    public void createAccount(){
//        System.out.println("moi ban nhap vao username");
//        String username= ScannerUtils.inputstring();
//        System.out.println("moi ban email");
//        String email=ScannerUtils.InputEmail();
//        System.out.println("moi ban nhap vao password");
//        String password=ScannerUtils.InputPassWord();
//        controller.createAccount(username,email,password);
//    }
//
//}
