package com.itxiaozhou.day07.demo4;

import java.util.ArrayList;

public class Test02StudentArrayList {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        System.out.println(student);
        student.add("刘备");
        student.add("曹操");
        student.add("孙权");
        System.out.println(student);
        System.out.println("================================");
        /*for (String s : student) {
            System.out.println(s);
        }*/
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }
        student.remove(0);

        System.out.println(student);

    }
}
