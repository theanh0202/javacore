package com.vti.entity.testingsystem3;

import com.vti.backend.INews;
import com.vti.entity.utils.ScannerUtils;

public class News implements INews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String  conten;
    private float AverageRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public void Display(){
        System.out.println(this.title);
        System.out.println(this.publishDate);
        System.out.println(this.conten);
        System.out.println(this.author);
        System.out.println(this.AverageRate);
    }

    public float Calculate() {
        System.out.println("moi ban danh gia");
        int[] rates = new int[3];
        rates[0] = ScannerUtils.InputNumber(1, 5);
        rates[1] = ScannerUtils.InputNumber(1, 5);
        rates[3] = ScannerUtils.InputNumber(1, 4);
        this.AverageRate = (rates[0] + rates[1] + rates[2]) / 3.0f;
        return 0;
    }
    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getConten() {
        return conten;
    }

    public void setConten(String conten) {
        this.conten = conten;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", author='" + author + '\'' +
                ", conten='" + conten + '\'' +
                ", AverageRate=" + AverageRate +
                '}';
    }

}
