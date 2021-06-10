package com.mec;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name","YHJ");
        map.put("phone","123");
        map.put("age","24");
        map.put("email","email");

        String email =  map.get("email");
        System.out.println(email);

        method();

        map.remove("email");

    }

    private static void method() {
        System.out.println("这是一个方法");
    }

}
