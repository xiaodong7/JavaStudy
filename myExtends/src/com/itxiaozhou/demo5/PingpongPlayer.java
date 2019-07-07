package com.itxiaozhou.demo5;

public class PingpongPlayer extends Player implements SpeakEnglish{
    @Override
    public void study() {
        System.out.println("乒乓球运动员学习发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃牛肉,喝牛奶");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }

    public PingpongPlayer(String name, int age) {
        super(name, age);
    }

    public PingpongPlayer() {
    }
}
