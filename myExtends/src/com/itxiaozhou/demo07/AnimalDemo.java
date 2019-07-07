package com.itxiaozhou.demo07;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(3);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

    }
}
