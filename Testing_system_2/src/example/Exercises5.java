package example;

import java.util.Scanner;

public class Exercises5 {
    public static void main(String[] args) {
    Exercises5 exercises5= new Exercises5();
    exercises5.question8();
    }
    public void question1(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap so thu 1 ");
        int number = scanner.nextInt();
        System.out.println("NHAP SO THU 2");
        int number2 = scanner.nextInt();
        System.out.println("NHAP SO THU 3");
        int number3 = scanner.nextInt();
    }
    public void question2(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap so thu 1 ");
        float number =scanner.nextFloat();

    }
    public void question3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ho va ten");
        String fullname = scanner.nextLine();
    }
    public void question5(){
        System.out.println(" NHAP MOI 1 ACCOUNT");
    }
    public void question6(){
        Scanner scanner= new Scanner(System.in);
        Department department = new Department();
        System.out.println("NHAP VAO ID CUA DEPARTMENT ");
        int departmentId = scanner.nextInt();
        System.out.println("nhap vao ten cua department");
        String departmentName =scanner.nextLine();


    }public void question7(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap vao 1 so");
        int a = scanner.nextInt();
        while (true){
            if(a % 2==0){
                System.out.println("so ban vau nhap la:"+ a );
                break;
            }
            System.out.println("SO VUA  nhap khong phai la so chan, moi nhap lai");
            a=scanner.nextInt();
        }
//        int number = Integer.parseInt(scanner.nextLine());
//        String string = scanner.nextLine();
//        System.out.println(string+ number);
    }
    public void question8(){
        Scanner scanner= new Scanner(System.in);
        while (true) {


            System.out.println("MOI BAN NHAP CHUC NANG MUON SU DUNG");
            System.out.println("1,THEM MOI 1 ACCOUNT ");
            System.out.println("2,THEM MOI 1 DEPARTMENT");
            System.out.println("3,THOAT ");
            int number = scanner.nextInt();
            switch (number){
                case 1:
                    question5();
                    break;
                case 2:
                    question6();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("moi nhap lai");
            }

        }
    }

}
