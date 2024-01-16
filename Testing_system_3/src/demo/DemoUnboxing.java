package demo;

public class DemoUnboxing {
    public static void main(String[] args) {
        int a=100;
        Integer aObject= Integer.valueOf(a);//boxing:chuyển đổi số int a thành dạng object


        Integer b =new Integer(5);
        int bprimitive=b.intValue();//unboxing chuyển đổi kiểu dữ liệu object sang dạng primitive

    }
}
