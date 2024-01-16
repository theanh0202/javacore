//package com.vti.frontend;
//
//import com.vti.Utils.ScannerUtils;
//import com.vti.backend.Example;
//
//public class Program {
//    public static void main(String[] args) {
//        Example example= new Example();
//        Function function= new Function();
//        while (true){
//            System.out.println("------".repeat(20));
//            System.out.println("moi ban chon chuc nang");
//            System.out.println("1 thêm mới 1 account :");
//            System.out.println("2 sửa 1 account :");
//            System.out.println("3 xóa 1 account theo id ");
//            System.out.println("4 tim kiếm account theo email");
//            System.out.println("̀5 tất cả account ");
//            System.out.println("6 login vào hệ thống");
//            System.out.println("7 thoat chương trình");
//            int choice= ScannerUtils.inputNumber(1,7);
//            switch (choice){
//                case 1:
//                    function.createAccount();
//                    break;
//                case 2:
//                    function.updateAccount();
//                    break;
//                case 3:
//                    function.deleteAccount();
//                    break;
//                case 4:
//                    function.findByEmail();
//                    break;
//                case 5:
//                    function.getAllAccount();
//                    break;
//                case 6:
//                    function.login();
//                    break;
//                case 7:
//                    return;
//            }
//        }
//
//    }
//}
