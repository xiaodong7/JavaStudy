package com.itxiaozhou.demo6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("孙悟空");
        arr1.add("唐僧");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("武松");
        arr2.add("鲁智深");
        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("赵云");
        arr3.add("刘备");
        map.put("西游记", arr1);
        map.put("水浒传", arr2);
        map.put("三国演义", arr3);

        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            for (String s : entry.getValue()) {
                System.out.println("\t" + s);
            }
        }
    }
}
