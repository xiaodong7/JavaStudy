package com.itxiaozhou.demo09;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(2);
        dog.setName("哈士奇");
        dog.eat();
        dog.jump();
        System.out.println(dog.getName() + "," + dog.getAge());

        System.out.println("=====================================");
        Animal a = new Dog("泰迪", 2);
        a.eat();
        ((Dog) a).jump();
        System.out.println(a.getName() + "," + a.getAge());
    }
}
