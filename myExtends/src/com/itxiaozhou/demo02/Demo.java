package com.itxiaozhou.demo02;

public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setAge(60);
        t1.setName("张三丰");
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("小周", 23);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();

        Student s1 = new Student();
        s1.setAge(12);
        s1.setName("小红");
        System.out.println(s1.getName() + "," + s1.getAge());
        s1.study();

        Student s2 = new Student("小明", 15);
        System.out.println(s2.getName() + "," + s2.getAge());
        s2.study();
    }
}
