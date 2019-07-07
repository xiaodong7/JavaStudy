package com.itxiaozhou.demo02;

import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String[] args) {
        TreeSet<Student> s = new TreeSet<>();
        s.add(new Student("dong",25));
        s.add(new Student("zhang",25));
        s.add(new Student("ling",24));
        s.add(new Student("xi",25));
        s.add(new Student("dong",25));
        for (Student st : s) {
            System.out.println(st);
        }
    }
}
