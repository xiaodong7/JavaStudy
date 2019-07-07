package com.itxiaozhou.demo02;

public class Demo {

    public static void main(String[] args) {
        method(new Inner() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类");
            }
        });

    }

    private static void method(Inner i) {

        i.show();
    }
}
