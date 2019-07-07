package com.itxiaozhou.demo5;

public class PingpongCoach extends Coach implements SpeakEnglish{
    @Override
    public void teach() {
        System.out.println("乒乓球教练教发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃小白菜,喝小米粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    public PingpongCoach() {
    }
}
