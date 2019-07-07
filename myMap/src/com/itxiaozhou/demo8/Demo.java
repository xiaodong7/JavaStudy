package com.itxiaozhou.demo8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("张无忌", 20));
        s.add(new Student("赵敏", 25));
        s.add(new Student("东方不败", 30));
        s.add(new Student("西门吹雪", 30));

        Collections.sort(s, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getAge() - o2.getAge();
                if (i == 0) {
                    i = o1.getName().compareTo(o2.getName());
                }
                return i;
            }
        });

        for (Student ss : s) {
            System.out.println(ss);
        }

    }
}
