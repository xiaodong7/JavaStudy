package com.itxiaozhou.demo03;

public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("加菲猫");
        cat.setAge(2);
        System.out.println(cat.getName() + "," + cat.getAge());
        cat.catchMouse();

        Cat cat1 = new Cat("加菲猫", 4);

        System.out.println(cat1.getName() + "," + cat1.getAge());
        cat1.catchMouse();

        Dog dog = new Dog("哈士奇", 2);
        System.out.println(dog.getName() + "," + dog.getAge());
        dog.lookDoor();

        Dog dog1 = new Dog();
        dog1.setAge(4);
        dog1.setName("泰迪");
        System.out.println(dog1.getName() + "," + dog1.getAge());
        dog1.lookDoor();
    }
}
