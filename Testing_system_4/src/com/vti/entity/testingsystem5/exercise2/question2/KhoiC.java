package com.vti.entity.testingsystem5.exercise2.question2;

public class KhoiC extends Student {
    private float DiemVan;
    private float DiemSu;
    private float DiemDia;

    public KhoiC(String sbd, String hoTen, String diaChi, int diemCong, float diemVan, float diemSu, float diemDia) {
        super(sbd, hoTen, diaChi, diemCong);
        DiemVan = diemVan;
        DiemSu = diemSu;
        DiemDia = diemDia;
    }

    public KhoiC(float diemVan, float diemSu, float diemDia) {
        DiemVan = diemVan;
        DiemSu = diemSu;
        DiemDia = diemDia;
    }

    public float getDiemVan() {
        return DiemVan;
    }

    public void setDiemVan(float diemVan) {
        DiemVan = diemVan;
    }

    public float getDiemSu() {
        return DiemSu;
    }

    public void setDiemSu(float diemSu) {
        DiemSu = diemSu;
    }

    public float getDiemDia() {
        return DiemDia;
    }

    public void setDiemDia(float diemDia) {
        DiemDia = diemDia;
    }
}