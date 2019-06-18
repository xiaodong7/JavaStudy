package com.itxiaozhou.day10.test01;

public class Demo1 {
    public static void main(String[] args) {
        //有实现关系,多态的体现
        ProtectHome p  = new Sheep();

        //继承关系,多态的体现
        Animal a =  new Sheep();

        a.eat();



    }
}
