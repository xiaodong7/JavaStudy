package com.itxiaozhou.demo09;

public class Dog extends Animal implements Jumpping{
    @Override
    public void jump() {
        System.out.println("狗会跳高了");
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
}
