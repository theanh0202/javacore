package com.vti.backend;

public abstract class Class1 {
    protected String name;
    protected int age;
    public abstract void abc();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Class1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
