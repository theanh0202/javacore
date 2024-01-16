package com.vti.frontend;

import java.util.*;

public class DemoList {
    public static void main(String[] args) {
        demoSort();
    }
    public static void DemoArrayList(){
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        //kiem tra so phan tu
        System.out.println("so phan tu trong mang la" +integerList.size());
        //LAY phan tu o vi tri index thu n(index bat dau tu 0)
        System.out.println("vi tri co index =1 la" + integerList.get(1));
        //xoa phan tu  cos 2 cach
        //c1: truyen indexx cua phan tu muoon xoa(tra ve doi tuong e ma minh lam viec)
//        integerList.remove(4);
//        System.out.println(integerList);
//c2" truyền vào đói tượng mà mình muốn xóa()(du lieu  tra ve la boolen   )
        System.out.println("xoa"+integerList.remove(Integer.valueOf(2)));
        System.out.println(integerList);
        Iterator<Integer> stringIterator=integerList.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

    }
    public void demoLinkList(){
        List<Integer> integerList=new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        //kiem tra so phan tu
        System.out.println("so phan tu trong mang la" +integerList.size());
        //LAY phan tu o vi tri index thu n(index bat dau tu 0)
        System.out.println("vi tri co index =1 la" + integerList.get(1));
        //xoa phan tu  cos 2 cach
        //c1: truyen indexx cua phan tu muoon xoa(tra ve doi tuong e ma minh lam viec)
//        integerList.remove(4);
//        System.out.println(integerList);
//c2" truyền vào đói tượng mà mình muốn xóa()(du lieu  tra ve la boolen   )
        System.out.println("xoa"+integerList.remove(Integer.valueOf(2)));
        System.out.println(integerList);
        Iterator<Integer> stringIterator=integerList.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

    }
        public static void demoSort(){
            List<Integer> integerList=new LinkedList<Integer>();
            integerList.add(1);
            integerList.add(2);
            integerList.add(3);
            integerList.add(4);
            integerList.add(5);
            System.out.println(integerList);
            //sap xep tang dan
//            Collections.sort(integerList);
//            System.out.println(integerList);
//            //sap xep dao nguoc danh sach
//            Collections.reverse(integerList);
//            System.out.println(integerList);
//            for (Integer student1:integerList) {
//                int count=0;
//                for (Integer student2:integerList) {
//                    if (student1.equals(student2)){
//                        count++;
//                    }
//
//                }
//            }
            List<Integer> coppy=new LinkedList<Integer>();
            coppy=integerList;
//            coppy.add(integerList1);
        }
}
