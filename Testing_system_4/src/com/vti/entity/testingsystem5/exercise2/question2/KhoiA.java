package com.vti.entity.testingsystem5.exercise2.question2;

public class KhoiA extends Student {
    private float DiemToan ;
    private  float DiemLy;
    private float DiemHoa;
    private int DiemCong;
    public float getDiemToan() {
        return DiemToan;
    }

    public void setDiemToan(float diemToan) {
        DiemToan = diemToan;
    }

    public float getDiemLy() {
        return DiemLy;
    }

    public void setDiemLy(float diemLy) {
        DiemLy = diemLy;
    }

    public float getDiemHoa() {
        return DiemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        DiemHoa = diemHoa;
    }

    public KhoiA(String sbd, String hoTen, String diaChi, int diemCong) {
        super(sbd, hoTen, diaChi, diemCong);
        this.DiemToan=DiemToan;
        this.DiemLy=DiemLy;
        this.DiemHoa=DiemHoa;

    }

    public KhoiA() {
    }


}
