package com.vti.Utils;

import javax.swing.plaf.synth.SynthToolTipUI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class FileUtils {
    public static boolean checkFileExits(String pathFile){
        File file= new File(pathFile);
        if(file.exists()){
            System.out.println("duong dan co ton tai");
            return true;
        }else{
            System.out.println("duong dan khong ton tai");
            return false;
        }
    }
    public static void createFile(String fileName){
        String pathFile="data/"+fileName;
        File file=new File(pathFile);
        try{
            if(file.createNewFile()){
                System.out.println("tao file thanh cong");
            } else{
                System.out.println("tao file that bai");
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void deleteFile(String path){
        File file=new File(path);
        if (file.exists()){
            System.out.println(file.delete()?"xoa thanh cong":"xoa file that bai");
    }else{
        System.out.println("file khong ton tai");
    }}
    public static void getAllFile(String folderPath){
        File file=new File(folderPath);
        if (file.isDirectory()){
            for(String fileName:file.list()){
                System.out.println(fileName);
            }

        }else {
            System.out.println("duong dan khong hop le");
        }
    }
    public static void readFile(String pathFile){
        if (checkFileExits(pathFile)){
            try {
                FileInputStream fileInputStream=new FileInputStream(pathFile);
                byte[] b =new byte[1024];
                int length = fileInputStream.read(b);
                while (length>-1){
                    String content = new String(b,0,length);
                    System.out.println(content);
                    System.out.println("_______________________");
                    length=fileInputStream.read(b);
                }
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
