package com.itxiaozhou.demo6;

public class Dog extends Animal{
    public Dog() {
        super();
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookDoor(){
        System.out.println("狗看家");
    }

}
