package com.itxiaozhou.demo3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("小周");
        list.add("hello");
        list.add("小周");
        list.add("world");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
