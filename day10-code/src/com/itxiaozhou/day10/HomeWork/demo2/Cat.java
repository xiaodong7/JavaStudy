package com.itxiaozhou.day10.HomeWork.demo2;
/*
3.定义猫类继承动物类
        行为:  eat方法(吃鱼),抓老鼠方法
*/
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
