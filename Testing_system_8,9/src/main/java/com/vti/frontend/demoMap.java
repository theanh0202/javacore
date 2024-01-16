package com.vti.frontend;

import java.util.HashMap;
import java.util.Map;

public class demoMap {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("1","gai tri value 1");
        map.put("2","gai tri value 2");
        map.put("3","gai tri value 3");
        map.put("4","gai tri value 4");
        System.out.println(map);

        System.out.println(map.get("3"));
    }

}
