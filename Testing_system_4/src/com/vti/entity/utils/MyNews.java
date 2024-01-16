package com.vti.entity.utils;

import com.vti.entity.testingsystem3.News;

public class MyNews {
    public static void main(String[] args) {
        News news=new News();
        while (true){
        System.out.println("-----".repeat(20));
        System.out.println("moi ban nhap chuc nag");
        System.out.println("1:them moi mot new");
        System.out.println("2 hien thi thong tin news");
        System.out.println("3 danh gia");
        System.out.println("4 thoat khoi chuong trinh");

        int chose = ScannerUtils.InputNumber();
        switch (chose){
            case 1:

            case 2:

            case 3:

            case 4:


        }
    }

}
    }
