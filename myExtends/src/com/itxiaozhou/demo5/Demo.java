package com.itxiaozhou.demo5;


public class Demo {
    public static void main(String[] args) {
        PingpongPlayer pp = new PingpongPlayer("小周", 22);
        System.out.println(pp.getName()+","+pp.getAge());
        pp.eat();
        pp.speak();
        pp.study();
    }
}
