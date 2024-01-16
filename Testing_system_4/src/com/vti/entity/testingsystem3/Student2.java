package com.vti.entity.testingsystem3;

public class Student2  extends testingsystem4.Person {
     private String msv;
    private String clazz;

    public Student2(String msv, String clazz) {
        this.msv = msv;
        this.clazz = clazz;
        this.age = 2;
        this.name="nguyen van a";
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", msv='" + msv + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }
}
