package com.itxiaozhou.day06.demo5;

public class Test01_Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(18);
        s.setName("赵丽颖");
        System.out.println(s.getName()+"同学-----"+s.getAge());

        System.out.println("======================");

        Student s2 = new Student("柳岩", 25);
        System.out.println(s2.getName()+"同学-----"+s2.getAge());

        Student s3 = new Student("小周");
        System.out.println(s3.getName());


    }
}
