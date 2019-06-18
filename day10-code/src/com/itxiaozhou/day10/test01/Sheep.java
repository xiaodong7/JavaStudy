package com.itxiaozhou.day10.test01;

public class Sheep extends Animal implements ProtectHome{
    @Override
    void eat() {
        System.out.println("羊吃草");
    }

    @Override
    public void watch() {
        System.out.println("羊傻傻的看着家...");
    }
}
