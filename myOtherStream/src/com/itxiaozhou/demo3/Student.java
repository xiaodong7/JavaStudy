package com.itxiaozhou.demo3;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private transient String sex;

    static final long serialVersionUID = 42L;

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
