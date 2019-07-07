package com.itxiaozhou.demo7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StringMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line = sc.nextLine();
        //HashMap<Character, Integer> map = new HashMap<>();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);
            Integer value = map.get(key);
            if (value == null) {
                map.put(key, 1);
            } else {
                value++;
                map.put(key, value);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            sb.append(key).append("(").append(value).append(")");
        }
        System.out.println(sb.toString());


    }
}
