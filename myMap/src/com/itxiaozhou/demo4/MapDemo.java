package com.itxiaozhou.demo4;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student("东方不败", 25), "随州");
        map.put(new Student("令狐冲", 26), "西安");
        map.put(new Student("张无忌", 24), "广水");
        map.put(new Student("赵敏", 22), "武汉");
        map.put(new Student("赵敏", 22), "襄阳");
        for (Map.Entry<Student, String> entry : map.entrySet()) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }
    }
}
