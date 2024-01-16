package assginment_3;

public class Exercise3 {
    public static void main(String[] args) {
        Exercise3 exercise3= new Exercise3();
        exercise3.question2();
    }
    public void question1() {
        Integer luong = new Integer(5000);//int->integer->int
        float luongConvert = luong.intValue();
    }
    public void question2(){
        String abc="123456";
        int convert =Integer.valueOf(abc);
        int convert2 =Integer.parseInt(abc);
        int convert3 = new Integer(abc);
        System.out.println(convert);
        System.out.println(convert2);
        System.out.println(convert3);
    }
    public void question3(){
        Integer integer = new Integer("1");
        int convert = Integer.valueOf(integer);
    }
}
