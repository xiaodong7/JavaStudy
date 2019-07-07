package com.itxiaozhou.demo02;

public class Teacher extends Person{
    public void teach(){
        System.out.println("用爱成就每一位学员");
    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
}
