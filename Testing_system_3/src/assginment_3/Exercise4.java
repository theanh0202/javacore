package assginment_3;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Exercise4 exercise4= new Exercise4();
        exercise4.question4();

    }
    public void question1(){
        System.out.println("moi ban nhap vao 1 chuoi:");
        String input = scanner.nextLine();
        int length = input.length();
        System.out.println("so ky tu la"+length);

    }
    public void question2(){
        System.out.println("nhap chuoi s1 vao : ");
        String input1= scanner.nextLine();
        System.out.println("nhap chuoi s2 vao: ");
        String input2 = scanner.nextLine();
//        String kq1=input1+input2;
        String kq2= input1.concat(input2);
        System.out.println(input1+input2);
    }
    public void question3(){
        System.out.println("nhap vao ă chuoi : ");
        String name=scanner.nextLine();
        String firt = String.valueOf(name.charAt(0));
        String other=name.substring(1);
        System.out.println(firt+other);
    }
    public void question4(){
        System.out.println("nhap vao 1 chuoi: ");
        String name =scanner.nextLine();
        for(int i=0;i<name.length();i++){
            String text = "ky tu thu "+(i+1)+"la"+String.valueOf(name.charAt(i)).toUpperCase();
            System.out.println(text);
        }
    }
}
