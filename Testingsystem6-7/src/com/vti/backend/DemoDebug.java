package com.vti.backend;

public class DemoDebug {
    public static void main(String[] args) {
        DemoDebug demoDebug=new DemoDebug();
        demoDebug.vd1();
        }

    public void vd1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Số i là : " + i);
            if (i % 2 == 0) {
                System.out.println("chỉ lấy số chẵn: " + i);
                continue;
            }
            System.out.println("Số lẻ thì xuống đây " + i);
            if (i == 7) {
                System.out.println("i = 7 thì dừng vòng lặp hiện tại");
                break;
            }
        }
    }
}
