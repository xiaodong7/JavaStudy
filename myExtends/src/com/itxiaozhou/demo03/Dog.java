package com.itxiaozhou.demo03;

public class Dog extends Animal{
    public void lookDoor(){
        System.out.println("狗看家");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
}
