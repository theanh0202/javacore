package example;

import java.util.Random;

public class Exercises4 {
    public static void main(String[] args) {
        Exercises4 exercises4= new Exercises4();
        exercises4.question1();

    }
    public void question1(){
        Random random = new Random();
        int number = random.nextInt();
        System.out.println(number);
    }
    public void question2(){
        Random random = new Random();
        float number= random.nextFloat();
        System.out.println(number);

    }
    public void question4(){
        Random random = new Random();
//       random.nextInt("1000-99")-> gia tri di tu 0 -> n-1
        // muc dich : tao ra tu 100-999
        int number = random.nextInt(900) + 100;
        System.out.println(number);
    }

}
