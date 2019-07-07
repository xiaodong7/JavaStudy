package com.itxiaozhou.day10.KaoShi;

public abstract class Animal {
    private String name;
    abstract void speak(String str);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }
}
