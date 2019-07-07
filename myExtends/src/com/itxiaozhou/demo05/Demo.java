package com.itxiaozhou.demo05;

public class Demo {
    public static void main(String[] args) {
        AnimalOper ao = new AnimalOper();
        Cat cat = new Cat();
        ao.useAnimal(cat);

        Dog dog = new Dog();
        ao.useAnimal(dog);


    }
}
