package com.vti.entity.testingsystem3;

import java.util.Scanner;

public class Student4 {
    private int id;
    private String name;
    private String hometown;
    private float gradeing;
    public Student4(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("NHAP VAO TEN");
        String name= scanner.nextLine();
        this.name= name;
        System.out.println("NHAP VAO DIA CHI: ");
        String hometown=scanner.nextLine();
        this.hometown=hometown;
        this.gradeing=0;
    }

    public void setGradeing(float gradeing) {
        this.gradeing = gradeing;
    }
    public void addGrading(float gradeing){
        this.gradeing+=gradeing;
    }

    @Override
    public String toString() {
        String type = "";
        if(this.gradeing<4){
            type ="yeu";
        }else if(this.gradeing>=4&&this.gradeing<6){
            type="trung binh";
        }else if(this.gradeing>=6&&this.gradeing<=8){
            type="kha";
        }else {
            type="gioi";
        }
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hometown='" + hometown + '\'' +
                ", gradeing=" + type +
                '}';
    }
}
