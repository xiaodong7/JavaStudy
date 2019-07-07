package com.itxiaozhou.demo04;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }
}
