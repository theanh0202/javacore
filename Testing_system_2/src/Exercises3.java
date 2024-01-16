import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercises3 {
    public static void main(String[] args) {
        Exercises3 exercises3 = new Exercises3();
        exercises3.question1();
        exercises3.question2();
        exercises3.question3();
        exercises3.question4();
        exercises3.question5();
    }
    public void question1(){
        Date date = new Date();
        Locale locale = new Locale("vi","VN");
        DateFormat dateFormat = SimpleDateFormat.getDateInstance(DateFormat.DEFAULT,locale);
        String dateString = dateFormat.format(date);
        System.out.println(dateString);
    }
    public void question2(){
        Date date =new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String dateString = dateFormat.format(date);
        System.out.println(dateString);
    }
    public void question3(){
        Date date= new Date();
        String patten = "yyyy";
        DateFormat dateFormat = new SimpleDateFormat(patten);
        String dateString = dateFormat.format(date);
        System.out.println(dateString);
    }
    public void question4(){
        Date date= new Date();
        String patten = "MM-yyyy";
        DateFormat dateFormat = new SimpleDateFormat(patten);
        String dateString = dateFormat.format(new Date());
        System.out.println(dateString);
    }
    public void question5(){
        String patten = "MM-dd";
        DateFormat dateFormat= new SimpleDateFormat(patten);
        String dateString = dateFormat.format(new Date());
        System.out.println(dateString);

    }

}
