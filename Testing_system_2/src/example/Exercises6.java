package example;

import java.util.Scanner;

public class Exercises6 {
    public static void main(String[] args) {
        Exercises6 exercises6= new Exercises6();
        exercises6.question1();
    }
    public void question1(){
        for (int i=0;i<10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public void question2(int a, int b){
       float tb = (a+b)/2;
       System.out.println(tb);

    }
    //tao ra 1 methor de truyen vao 3 so in ra thu tu tang dan
    public void question3(int a, int b, int c){
       int min =0;
       int max=0;
       int other=0;
       int[] number= {a,b,c};
       for(int i=0;i<number.length;i++){
           if(number[i]<=a&& number[i]<=b&&number[i]<=c){
               min = number[i];

           }else if(number[i]>=a&& number[i]>=b&&number[i]>=c){
               max = number[i];

           }else{
               other =number[i];
           }
       }

    }
}
