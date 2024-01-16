package com.huce.program;

import com.huce.utils.ScannerUtils;

public class Program {
    static Function function = new Function();
    public static void main(String[] args) {
        menuUser();
    }

    public static void menuUser() {
        Function function = new Function();
        while (true) {
            System.out.println("----------" .repeat(20));
            System.out.println("Mời bạn chọn chức năng: ");
            System.out.println("1. tim danh sach user theo projectid ");
            System.out.println("2. tim employee bang project id");
            System.out.println("3. thoat chuong trinh");
            System.out.println("4. moi ban login ");

            int chose = ScannerUtils.inputNumber(1, 6);
            switch (chose) {
                case 1:
                    function.login();
                    break;
                case 2:
                    function.findEmployeeByProjectId();
                    break;
                case 3:
//                    function.createUser();
                    break;
                case 4:
//                   function.login();
                   break;
            }
            if (chose == 6) {
                System.out.println("Ban da log out");
                break;
            }
        }
    }
}
