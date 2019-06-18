package com.itxiaozhou.day10.HomeWork.demo2;
/*2.定义狗类继承动物类
        行为:  eat方法(啃骨头),看家方法*/
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    public void watchHome(){
        System.out.println("狗看家");
    }
}
