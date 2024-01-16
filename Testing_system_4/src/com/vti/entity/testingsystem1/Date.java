package com.vti.entity.testingsystem1;

public class Date {
    private int Day;
    private int month;
    private int year;

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "Day=" + Day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
    private boolean isLeapYear;
}
