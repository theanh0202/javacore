package com.vti.entity.testingsystem3;

public class Circle {
    private double Radius;
    private String Color;

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = 1.0;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = "red";
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Color='" + Color + '\'' +
                '}';
    }
}
