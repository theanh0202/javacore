//package com.vti.frontend;
//
//import com.vti.entity.testingsystem3.CanBo;
//import com.vti.entity.utils.ScannerUtils;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Program3 {
//    public static void main(String[] args) {
//        List<CanBo> canBoList=new ArrayList<>();
//        QLCB qlcb=new QLCB();
//       while (true){
//        System.out.println("-----".repeat(20));
//        System.out.println("moi ban nhap chuc nag");
//        System.out.println("1:them moi can bo");
//        System.out.println("2 tim kiem theo hoj ten");
//        System.out.println("3 Hiện thị thông tin về danh sách các cán bộ.");
//        System.out.println("4 Nhập vào tên của cán bộ và delete cán bộ đó");
//        System.out.println("5 Thoát khỏi chương trình.");
//        int choice = Integer.parseInt(ScannerUtils.inputstring());
//        switch (choice){
//            case 1:
//                CanBo canBo= qlcb.themMoiCB();
//                canBoList.add(canBo);
//                break;
//            case 2:
//                CanBo canBo2= qlcb.findCanBo(canBoList);
//                System.out.println(canBo2);
//                break;
//            case 3:
//                for (CanBo cb:canBoList){
//                    System.out.println(cb);
//                }break;
//            case 4:
//                CanBo canBo4= qlcb.findCanBo(canBoList);
//                canBoList.remove(canBo4);//
//                System.out.println("da xoa thanh cong");
//                break;
//            case 5:
//                return;
//        }
//       }
//
//    }
//}
