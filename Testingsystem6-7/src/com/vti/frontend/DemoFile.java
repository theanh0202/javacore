package com.vti.frontend;

import com.vti.Utils.FileUtils;

import java.io.File;

public class DemoFile {
    public static void main(String[] args) {
//        FileUtils.createFile("demo.txt");
        FileUtils.deleteFile("data/demo1.txt");
        FileUtils.readFile("data/demo2.txt");
    }
}
