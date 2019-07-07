package com.itxiaozhou.demo05;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookDoor(){
        System.out.println("狗看家");
    }
}
