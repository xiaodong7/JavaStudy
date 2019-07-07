package com.itxiaozhou.demo04;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Cat("加菲猫",2);
        animal.eat();
        System.out.println(animal.age);
        System.out.println(animal.name);
    }
}
