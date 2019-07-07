package com.itxiaozhou.demo3;

import java.util.HashMap;
import java.util.Map;

public class StudentDemo {
    public static void main(String[] args) {
        HashMap<String, Student> m = new HashMap<>();
        m.put("001", new Student("张无忌", 25));
        m.put("002", new Student("赵敏", 24));
        m.put("003", new Student("东方不败", 22));
        m.put("004", new Student("令狐冲", 23));
        for (Map.Entry<String, Student> entry : m.entrySet()) {
            String key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }

        System.out.println("-------[华丽的分割线]--------");

        for (String key : m.keySet()) {
            Student value = m.get(key);
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
    }
}
