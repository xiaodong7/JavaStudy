package com.itxiaozhou.day10.周云飞.Test02;

public class Dog extends Animal implements Sports {

    @Override
    void speak(String str) {
        System.out.println(getName()+"说: "+str);
    }

    public Dog(String name) {
        super(name);
    }



    @Override
    public void swimming() {
        System.out.println(getName()+"狗刨中!");
    }

    void goPlay(){
        speak("我去玩了!");
        swimming();
    }

}
