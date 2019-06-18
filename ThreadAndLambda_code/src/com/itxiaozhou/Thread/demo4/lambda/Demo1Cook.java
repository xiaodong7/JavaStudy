package com.itxiaozhou.Thread.demo4.lambda;

public class Demo1Cook {
    public static void main(String[] args) {
        //使用了内部类的方式
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了!!!");
            }
        });

        //使用lambda表达式
        invokeCook(()->{
            System.out.println("吃饭了!!!");
        });

        //lamdba表达式省略写法
        invokeCook(()->System.out.println("吃饭了!!!"));
    }

    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
