package com.itxiaozhou.demo5;

public class BasketballCoach extends Coach{
    @Override
    public void teach() {
        System.out.println("篮球教练教运动员如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉,喝羊奶");
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    public BasketballCoach() {
    }
}
