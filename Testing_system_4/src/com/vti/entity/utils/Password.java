package com.vti.entity.utils;

public class Password {
    public static String InputPassWord(){
        System.out.println("moi ban nhap vao password :");
        String password = ScannerUtils.inputstring();
        Boolean isValue =false;
            if (password.length() < 6 || password.length() > 12) {
                System.out.println("Password must contain between 6 and 12 characters.");
            } else {
                System.out.println("password ban vau nhap la "+password);
            }
        return password;
    }
}
