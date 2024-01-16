package demo;

public class Abc {
    public static void main(String[] args) {
        String a="1234";
        String b="1234";
        //chỉ so sánh giá trị
        String c= new String("1234");
        String d= new String("1234");
        // dung tuừ khóa new tạo ra các ô nhớ mới khác nhau nên so sánh dùng equal
        System.out.println(a==b);//true
        System.out.println(a==c);//false
        System.out.println(a.equals(b));//true
        System.out.println(a.equals(c));//true
        System.out.println(c==d);//false
        System.out.println(c.equals(d));//true
    }
}
