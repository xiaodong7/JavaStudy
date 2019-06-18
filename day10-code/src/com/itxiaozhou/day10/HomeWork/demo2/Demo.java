package com.itxiaozhou.day10.HomeWork.demo2;
/*
题目
        1.定义动物类
        行为:  eat方法(无具体行为,不同动物吃的不一样)
        2.定义狗类继承动物类
        行为:  eat方法(啃骨头),看家方法
        3.定义猫类继承动物类
        行为:  eat方法(吃鱼),抓老鼠方法
        4.测试类:
        定义一个方法,要求该方法既能接收狗对象也能接收猫对象
        在该方法的内部调用eat()方法,并且调用狗和猫的特有方法

        运行效果
        狗啃骨头
        狗看家
        猫吃鱼
        猫抓老鼠
*/

public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        method(dog);
        method(cat);
    }

    private static void method(Animal animal) {
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.eat();
            cat.catchMouse();
        }else if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.eat();
            dog.watchHome();
        }
    }
}
