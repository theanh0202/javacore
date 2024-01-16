package com.vti.frontend;

import com.vti.utils.ScannerUtils;

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
            System.out.println("2. thong tin manager cua cac project");
            System.out.println("3. login");
            int chose = ScannerUtils.inputNumber(1, 4);
            switch (chose) {
                case 1:
                    function.findAllUserByProjectId();
                    break;
                case 2:
                    function.getAllManagerForProject();
                case 3:
                    function.login();
                case 4:
                    return;
            }
        }
    }
}
