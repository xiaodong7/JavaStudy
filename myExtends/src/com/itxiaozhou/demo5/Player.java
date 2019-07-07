package com.itxiaozhou.demo5;

public abstract class Player extends Person{
    public Player(String name, int age) {
        super(name, age);
    }

    public Player() {
    }
    public abstract void study();
}
