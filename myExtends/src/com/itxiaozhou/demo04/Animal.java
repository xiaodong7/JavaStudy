package com.itxiaozhou.demo04;

public class Animal {
    String name = "动物";
    int age = 2;

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

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }
    public void eat(){
        System.out.println("动物吃东西");
    }

}
