package com.itxiaozhou.demo2;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("001", "东方不败");
        map.put("002", "令狐冲");
        map.put("003", "张无忌");
        map.put("004", "赵敏");
        //第一种遍历方式
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + "," + value);
        }

        System.out.println("-------[华丽的分割线]--------");

        //第二种遍历方式

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "," + value);
        }
    }
}
