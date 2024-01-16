package assginment_3;

public class Exercise_1 {
    public static void main(String[] args) {
        Exercise_1 exercise_1=new Exercise_1();
        exercise_1.question1();
        int kq= exercise_1.question4(4,3);
        System.out.println(kq);
    }
    public void question1(){
        float luong1 =5240.9f;
        float luong2 = 10970.055f;
        int luong1int = (int ) luong1;
        System.out.print(luong1int);
        int luong2int = (int) luong2;
        System.out.print(luong2int);
    }
    public void question2(){
        int random =123;
        String numberString = String.valueOf(random);
        while (numberString.length()<5){
            numberString= "0"+numberString;
        }
        System.out.println(numberString);
    }
    public void question3(){
        int random=1234;
        int kq=random%100;
        System.out.println(kq);

    }
    public int question4(int a, int b){
        int c=a/b;
        return c;
    }

}
