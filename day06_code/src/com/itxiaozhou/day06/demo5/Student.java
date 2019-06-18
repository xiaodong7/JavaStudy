package com.itxiaozhou.day06.demo5;

public class Student {
    private String name;
    private int age ;

    public Student() {//无参构造器
    }

    /**
     * 有参构造器
     * @param name
     * @param age
     */
    public Student(String name ,int age){
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
