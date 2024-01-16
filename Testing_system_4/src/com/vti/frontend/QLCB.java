//package com.vti.frontend;
//
//import com.vti.entity.testingsystem3.CanBo;
//import com.vti.entity.Gender;
//import com.vti.entity.utils.ScannerUtils;
//
//import java.util.List;
//
//public class QLCB {
//
//    public CanBo themMoiCB() {
//
//        System.out.println("moi ban nhap vao ten can bo");
//        String fullname = ScannerUtils.inputstring();
//        System.out.println("moi banj nhap vao tuoi can bo");
//        int age = ScannerUtils.inputnumber();
//        System.out.println("moi banj nhap vao gioi tinh cau can bo");
//        Gender gender;
//        System.out.println("1 , nam ");
//        System.out.println("2, nu");
//        System.out.println("3,khac");
//        int choice = ScannerUtils.inputstring();
//        switch (choice) {
//            case 1:
//                gender = Gender.NAM;
//                break;
//            case 2:
//                gender = Gender.NU;
//            default:
//                gender = Gender.KHAC;
//                break;
//        }
//        System.out.println("moi banj nhap dia chi can bo");
//        String address = ScannerUtils.inputstring();
//        CanBo canBo = new CanBo(fullname, age, gender, address);
//        System.out.println(canBo);
//
//        return canBo;
//    }
//    public CanBo findCanBo(List<CanBo>canBoList){
//        System.out.println("nhap vao ten ma ban tim kiem :");
//        String fullname=ScannerUtils.inputstring();
//        CanBo canBo = new CanBo();
//        for(CanBo cb :canBoList){
//            if(fullname.equals(cb.getFullname())){
//                canBo=cb;
//                break;
//            }
//        }return canBo;
//    }
//
//}
//
