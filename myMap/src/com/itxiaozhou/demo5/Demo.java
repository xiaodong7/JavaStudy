package com.itxiaozhou.demo5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> arr = new ArrayList<>();
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("张无忌", "赵敏");
        map1.put("周瑜", "大乔");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("诸葛亮", "周瑜");
        map2.put("刘备", "孙尚香");

        HashMap<String, String> map3 = new HashMap<>();
        map3.put("吕布", "貂蝉");
        map3.put("赵云", "韩信");

        arr.add(map1);
        arr.add(map2);
        arr.add(map3);
        for (HashMap<String, String> map : arr) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key + "," + value);
            }
        }
    }
}
