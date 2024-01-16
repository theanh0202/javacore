package vti.com.Utils;

import java.util.Scanner;

public class ScannerUtils {
    static Scanner scanner=new Scanner(System.in);
    //tao 1 method de nhap vao 1 chuoi  bat ky\
    public static String inputstring(){
        return scanner.nextLine();
    }
    // tao 1 method de nhap vao  1 so nguyen duong
    public static int InputNumber(){
        int number =0;
        while (true) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number<=0){
                    System.out.println("moi ban nhap lai");
                    number=Integer.parseInt(scanner.nextLine());
                    continue;
                }
                break;
            } catch (NumberFormatException ex) {
                System.out.println("nhap vao phai la so , moi nhap lai");
                continue;
            }
        }
        return number;
    }
    public static String InputPassWord(){
        System.out.println("moi ban nhap vao password :");
        String password = ScannerUtils.inputstring();
        Boolean isValue =false;
        if (password.length() < 6 || password.length() > 12) {
            System.out.println("Password must contain between 6 and 12 characters.");
        } else {
            System.out.println("password ban vau nhap la "+password);
        }
        return password;
    }
    public static String InputEmail(){
        System.out.println("moi ban nhap vao email ");
        String email=scanner.nextLine();
        while (!email.contains("@")){
            System.out.println("moi ban nhap lai");
            email=scanner.nextLine();
        }return email;
    }
    public static int InputNumber(int min , int max){
        int number= Integer.parseInt(scanner.nextLine());
        while (number<min||number>max){
            System.out.println("so khong dung dih dang moi ban nhap lai");
            number=scanner.nextInt();
        }return number;
    }

}
