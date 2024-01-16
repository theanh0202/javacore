package com.vti.entity.testingsystem1;

import com.vti.entity.testingsystem3.CanBo;

public class CongNhan  extends CanBo {
    private  int bac;
    public CongNhan(String fullname,int age){
        super(fullname,age);
    }
    public CongNhan(){
        System.out.println("ham khoi tao khong tham so :");
    }
    public CongNhan(int bac){
        this();
        this.bac=bac;
        System.out.println("ham khoi tao vowi bien truyen la bien caop bac");
    }
}//bai tap
//1 thay thế scaner ở các class khác bằng với phương thức trong clas
//2 tạo 1 method nhập vào đúng định dạng email
//3 tạo 1 method nhap vao dúng 1 so min và max do người dùng truyền vào  VD: inputnumber(1.4):(min =  1,mã=4)
// 4 tao 1 methhod nhap vao 1 chuoi la password , chứa ít nhất 6-12 ký tự
