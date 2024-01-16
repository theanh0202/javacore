package vti.com.frontend;

import vti.com.Utils.ScannerUtils;

public class program2 {
    public static void main(String[] args) {
        FuncitonDepartment functionDepartment = new FuncitonDepartment();
        while (true) {
            System.out.println("------".repeat(20));
            System.out.println("moi ban chon chuc nang");
            System.out.println("1 thêm mới 1 account :");
            System.out.println("2 sửa 1 account :");
            System.out.println("3 xóa 1 account theo id ");
            System.out.println("4 tim kiếm account theo email");
            System.out.println("̀5 tất cả account ");
            System.out.println("6 login vào hệ thống");
            System.out.println("7 thoat chương trình");
            int choice = ScannerUtils.InputNumber(1, 5);
            switch (choice) {
                case 1:
                    functionDepartment.getDepartment();
                    break;
                case 2:
                    functionDepartment.createDepartment();
                    break;
//                case 3:
////                    functionDepartment;
//                    break;

                case 4:
//                    function.login();
                    break;
                case 5:
                    return;
            }
        }

    }
}