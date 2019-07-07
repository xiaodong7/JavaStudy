package com.itxiaozhou.demo1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> mmap = new HashMap<>();
        mmap.put("001","张无忌");
        mmap.put("002","东方不败");
        mmap.put("003","西门吹雪");
        String s = mmap.get("001");
        System.out.println(s);
        System.out.println(mmap);
        System.out.println("-------[华丽的分割线]--------");

        Set<String> keySet = mmap.keySet();
        for (String s1 : keySet) {
            System.out.println(s1);
        }

        System.out.println("-------[华丽的分割线]--------");

        Collection<String> values = mmap.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("-------[华丽的分割线]--------");

        for (Map.Entry<String, String> entry : mmap.entrySet()) {
            System.out.println(entry);
        }

    }
}
