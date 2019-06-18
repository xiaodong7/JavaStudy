package com.itxiaozhou.day06.demo2;

public class Test01_Student {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu);
        System.out.println(stu.age);
        System.out.println(stu.name);
        stu.age = 18 ;
        stu.name = "赵丽颖";
        System.out.println("我的年龄是："+stu.age);
        System.out.println("我是："+stu.name);
        stu.eat();
        stu.study();
    }
}
