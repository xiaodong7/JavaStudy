package com.itxiaozhou.demo;

import java.util.HashSet;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        Set<Student> set =new HashSet<>();
        set.add(new Student("张三丰",60));
        set.add(new Student("张无忌",30));
        set.add(new Student("张三丰",60));
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
