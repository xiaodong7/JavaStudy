package com.itxiaozhou.demo1;

public class Demo {
    public static void main(String[] args) {
        Integer i = Integer.valueOf("200");
        System.out.println("i = " + i);

        Integer i3 = Integer.valueOf(200);
        System.out.println("i3 = " + i3);

        Integer i2 = Integer.valueOf("343a");
        System.out.println("i2 = " + i2);//NumberFormatException


    }
}
