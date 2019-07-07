package com.itxiaozhou.demo04;

public class CatDemo {
    public static void main(String[] args) {
        Cat<String> stringCat = new Cat<String>();
        stringCat.setMao("tom猫");
        System.out.println(stringCat.getMao());
    }
}
