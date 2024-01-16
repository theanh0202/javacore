package com.vti.entity.testingsystem5.exercise2.question2;

public class KhoiB extends Student{
    private float DiemToan;
    private  float DiemHoa;
    private  float DiemSinh;

    public KhoiB(String sbd, String hoTen, String diaChi, int diemCong, float diemToan, float diemHoa, float diemSinh) {
        super(sbd, hoTen, diaChi, diemCong);
        DiemToan = diemToan;
        DiemHoa = diemHoa;
        DiemSinh = diemSinh;
    }

    public KhoiB(float diemToan, float diemHoa, float diemSinh) {
        DiemToan = diemToan;
        DiemHoa = diemHoa;
        DiemSinh = diemSinh;
    }

    public float getDiemToan() {
        return DiemToan;
    }

    public void setDiemToan(float diemToan) {
        DiemToan = diemToan;
    }

    public float getDiemHoa() {
        return DiemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        DiemHoa = diemHoa;
    }

    public float getDiemSinh() {
        return DiemSinh;
    }

    public void setDiemSinh(float diemSinh) {
        DiemSinh = diemSinh;
    }

    @Override
    public String toString() {
        return "KhoiB{" +
                "DiemToan=" + DiemToan +
                ", DiemHoa=" + DiemHoa +
                ", DiemSinh=" + DiemSinh +
                '}';
    }

}
