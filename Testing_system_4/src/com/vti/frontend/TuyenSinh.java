package com.vti.frontend;

import com.vti.entity.testingsystem3.CanBo;
import com.vti.entity.testingsystem5.exercise2.question2.ITuyenSinh;
import com.vti.entity.testingsystem5.exercise2.question2.Student;
import com.vti.entity.utils.ScannerUtils;
import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;

public class TuyenSinh implements ITuyenSinh {
    private ArrayList<Student> DanhSachThiSinh= new ArrayList<>();
    public static void main(String[] args) {
        TuyenSinh tuyenSinh= new TuyenSinh();
        while (true){
            System.out.println("______".repeat(20));
            System.out.println("moi ban nhap vao chuc nang :");
            System.out.println("1 them moi thi sinh ");
            System.out.println("2: hien thi thong tin this sinh vaf khooi cua this sinh :");
            System.out.println("3: Tim kiem theo so bao danh ");
            System.out.println("4 : thoat khoi truong trinh");

        int choice2 = Integer.parseInt(ScannerUtils.inputstring());
        switch (choice2){
            case 1:
                tuyenSinh.addNewStudent();
                break;
            case 2:
                tuyenSinh.viewStudent();
                break;
            case 3:
                tuyenSinh.findByStudentCode();
                break;
            case 4:
                tuyenSinh.findByStudentCode();
                return;
            default:
                System.out.println("lua chon khong hop le");
        }
    }

    }


    @Override
    public void addNewStudent() {
        System.out.println("moi ban nhap vao sbd ");
        String Sbd=ScannerUtils.inputstring();
        System.out.println("moi ban nhap vao ho ten ");
        String HoTen = ScannerUtils.inputstring();
        System.out.println("moi ban nhap vao dai chi ");
        String DiaChi=ScannerUtils.inputstring();
        System.out.println("moi ban nhap vao diem cong ");
        int DiemCong=ScannerUtils.InputNumber();
        System.out.println("nhap vao 1 TRONG 3 khoi thi A,B,C :");
        String KhoiThi=ScannerUtils.inputstring().toUpperCase();
        switch (KhoiThi){
            case "A":
                DanhSachThiSinh.add(new Student(Sbd,HoTen,DiaChi,DiemCong,"KHOI A"));
                break;
            case "B":
                DanhSachThiSinh.add(new Student(Sbd,HoTen,DiaChi,DiemCong,"KHOI B"));
                break;
            case "C":
                DanhSachThiSinh.add(new Student(Sbd,HoTen,DiaChi,DiemCong,"KHOI C"));
                break;
            default:
                System.out.println("nhap vao khong hop le");

        }


    }

    @Override
    public void viewStudent(){
       for (Student student:DanhSachThiSinh){
          
       }


    }


    @Override
    public void findByStudentCode() {

    }


}
