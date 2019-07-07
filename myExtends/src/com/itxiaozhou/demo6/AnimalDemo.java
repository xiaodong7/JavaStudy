package com.itxiaozhou.demo6;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setAge(2);
        a.setName("加菲");
        System.out.println(a.getAge() + "," + a.getName());
        a.eat();

        a = new Cat("加菲", 2);
        System.out.println(a.getAge() + "," + a.getName());
        a.eat();


    }
}
