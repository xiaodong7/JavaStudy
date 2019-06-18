package com.itxiaozhou.day10.HomeWork.demo3;
/*3.定义缉毒狗:犬的一种
        行为：
        吼叫:汪汪叫
        吃饭:狗啃骨头
        缉毒:用鼻子侦测毒*/
public class JiDuDog extends Animal implements IJidu{
    @Override
    public void jiao() {
        System.out.println("汪汪叫");
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }


    @Override
    public void jiDu() {
        System.out.println("用鼻子侦测毒");
    }
}
