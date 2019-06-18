package com.itxiaozhou.day10.test02;

public class Demo1 {
    public static void main(String[] args) {
        Fruit f = new Banana();

        System.out.println(((Banana) f).num);//向下转型

        System.out.println(f.num);


        System.out.println("=================");
        Banana b = new Banana();
        method(b);
    }

    private static void method(Fruit fruit) {
        if(fruit instanceof Banana){
            Banana b = (Banana) fruit;
            b.yingyang();
        }
    }
}
