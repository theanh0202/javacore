package com.vti.frontend;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
    demoHashSet();
    }
    public static void demoHashSet(){
        Set<Integer> integerSet=new HashSet<>();
        //set khong luu cac phan tu giong nhau
        //SET TU SAP XEP CAC PHAN TU
        integerSet.add(1);
        integerSet.add(4);
        integerSet.add(5);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(1);
        System.out.println(integerSet);
        //kiem tra so phan tu
        System.out.println("so phan tu trong mang la" +integerSet.size());
        //LAY phan tu o vi tri index thu n(index bat dau tu 0)
        //KHONG CO HAM GET INDEX SO VOI LIST
        //xoa phan tu  cos 2 cach
        //c1: truyen indexx cua phan tu muoon xoa(tra ve doi tuong e ma minh lam viec)
        integerSet.remove(4);
        System.out.println(integerSet);
//c2" truyền vào đói tượng mà mình muốn xóa()(du lieu  tra ve la boolen   )
        System.out.println("xoa"+integerSet.remove(Integer.valueOf(2)));
        System.out.println(integerSet);
        Iterator<Integer> stringIterator=integerSet.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
    }
}
