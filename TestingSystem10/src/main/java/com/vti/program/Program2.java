package com.vti.program;

import com.vti.Utils.ScannerUtils;

public class Program2 {
    static Function2 function2 = new Function2();
    public static void main(String[] args) {
        menuUser();
//        menuAdmin();
    }

    public static void menuUser() {
        Function2 function2 = new Function2();
        while (true) {
            System.out.println("-----menuUser-----");
            System.out.println("Mời bạn chọn chức năng: ");
            System.out.println("1. Hiển thị danh sách tất cả User ");
            System.out.println("2. Tìm kiếm User theo Id");
            System.out.println("3. Tìm kiếm user theo username và email");
            System.out.println("4. Hiển thị danh sách tất cả các Department");
            System.out.println("5. Tìm kiếm Department theo Id");
            System.out.println("6. Tìm kiếm Department theo Department Name");
            System.out.println("7. Log out");
            System.out.println("8. Thoát chương trình");
            int chose = ScannerUtils.inputNumber(1, 8);
            switch (chose) {
                case 1:
                    function2.getAllUser();
                    break;
                case 2:
                    function2.findUserById();
                    break;
                case 3:
                    function2.findUser();
                    break;
                case 4:
                    function2.getAllDepartment();
                    break;
                case 5:
                    function2.findDepartmentById();
                    break;
                case 6:
                    function2.findDepartment();
                    break;
                case 7:
                    break;
                case 8:
                    return;
            }
            if (chose == 7) {
                System.out.println("Ban da log out");
                break;
            }
        }
    }


    public static void menuAdmin() {
        Function2 function2 = new Function2();
        while (true) {
            System.out.println("-----menuAdmin-----");
            System.out.println("Mời bạn chọn chức năng: ");
            System.out.println("1.Hiển thị danh sách tất cả User và có kèm theo thông tin của departmentName ");
            System.out.println("2. Xóa 1 User theo Id");
            System.out.println("3. Thay đổi mật khẩu của 1 user");
            System.out.println("4. Thêm mới 1 User, mặc định password là 123456 và role là USER");
            System.out.println("5. Hiển thị danh sách tất cả các Department");
            System.out.println("6. Xóa 1 department theo Id  ");
            System.out.println("7. Thay đổi tên 1 department");
            System.out.println("8. Thêm mới 1 department");
            System.out.println("9. Log out");
            int chose = ScannerUtils.inputNumber(1, 9);
            switch (chose) {
                case 1:
                    function2.getAllUser();
                    break;
                case 2:
                    function2.deleteUserById();
                    break;
                case 3:
                    function2.updateUser();
                    break;
                case 4:
                    function2.createUser();
                    break;
                case 5:
                    function2.getAllDepartment();
                    break;
                case 6:
                    function2.deleteDepartmentById();
                    break;
                case 7:
                    function2.updateDepartment();
                    break;
                case 8:
                    function2.createDepartment();
                    break;
                case 9:
                    return;
            }
        }
    }
}