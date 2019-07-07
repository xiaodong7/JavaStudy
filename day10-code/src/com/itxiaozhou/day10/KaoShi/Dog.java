package com.itxiaozhou.day10.KaoShi;

public class Dog extends Animal implements Sports{

    @Override
    void speak(String str) {
        System.out.println(getName()+"说: "+str);
    }

    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"刨中!");
    }

    void goPlay(){
        speak("狗说人话了");
        swimming();
    }

}
