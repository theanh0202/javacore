package demo;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        exercise1.question4();
    }

    public void question1(){
        System.out.println("Nhập vào số phần tử trong mảng: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double tong = 0;
        double tbc =0;
        double tongam=0;
        double tongduong=0;
        for(int i=0; i<arr.length; i++){
            System.out.print("Nhập vào giá trị cho phần tử thứ "+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        for(int i=0; i<arr.length; i++){
            tong = tong + arr[i];
            tbc=tong/n;
            if(arr[i]<0){
                tongam =tongam + arr[i];
                System.out.format("tong cac so am la "+tongam +"\n");
            }else{
                tongduong = tongduong + arr[i];
                System.out.format("tong cac so duong la "+tongduong +"\n");
                break;
            }

        }
        System.out.print("tong cua mang: " + tong +"\n");
        System.out.format("trung binh cong cua mang la: " + tbc +"\n");

        }
        public void question2(){
            Scanner scanner =new Scanner(System.in);
            String s = scanner.next();
            char c = scanner.next().charAt(0);
            int answer = -1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    answer = i;
                    break;
                }
            }
            System.out.print(answer);
        }
        public void question3(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số hàng của ma trận: ");
            int n = scanner.nextInt();
            System.out.print("Nhập số cột của ma trận: ");
            int m = scanner.nextInt();
            int[][] arr = new int[n][m];
            System.out.print("Nhập các phần tử của mảng: \n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("a[%d][%d] = ", i, j);
                    arr[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Các phần tử của (ma trận) mảng hai chiều: ");
            int[][] ma = new int[4][4];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }


        }
        public void question4(){
            System.out.print("nhap so phan tu cua mang ");
            Scanner scanner = new Scanner(System.in);
            int n =scanner.nextInt();
            int[] array=new int[n];
            int temp = array[0];
            for(int i=0; i<array.length; i++){
                System.out.print("Nhập vào giá trị cho phần tử thứ "+(i)+": ");
                array[i] = scanner.nextInt();
            }

            for (int i = 0 ; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }System.out.print("day so dươc sap xep theo thu tu tang dan la" + array[i]);
            }

        }
    }
t

