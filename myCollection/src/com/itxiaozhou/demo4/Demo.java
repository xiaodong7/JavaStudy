package com.itxiaozhou.demo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("张三丰", 80);
        Student s2 = new Student("张无忌", 30);
        Student s3 = new Student("令狐冲", 25);
        Student s4 = new Student("东方不败", 25);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for (Student s : list) {
            System.out.println(s.getName() + "," + s.getAge());

        }

        System.out.println("-------[华丽的分割线]--------");

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }

        System.out.println("-------[华丽的分割线]--------");


        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
