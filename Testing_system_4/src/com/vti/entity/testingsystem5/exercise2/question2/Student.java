package com.vti.entity.testingsystem5.exercise2.question2;

public class Student {
    private String Sbd;
    private  String HoTen;
    private String DiaChi;
    private int DiemCong;
    private  String KhoiThi;
    public Student(String sbd, String hoTen, String diaChi, int diemCong, String khoiThi) {
        Sbd = sbd;
        HoTen = hoTen;
        DiaChi = diaChi;
        DiemCong = diemCong;
        KhoiThi=khoiThi;
    }

    public Student(String sbd, String hoTen, String diaChi, int diemCong) {
    }

    public String getKhoiThi() {
        return KhoiThi;
    }

    public void setKhoiThi(String khoiThi) {
        KhoiThi = khoiThi;
    }


    public String getSbd() {
        return Sbd;
    }

    public void setSbd(String sbd) {
        Sbd = sbd;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getDiemCong() {
        return DiemCong;
    }

    public void setDiemCong(int diemCong) {
        DiemCong = diemCong;
    }

    public Student() {
    }

}
