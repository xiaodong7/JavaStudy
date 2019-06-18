package com.itxiaozhou.day10.HomeWork.demo3;
/*
1.定义动物类：
        行为：
        吼叫；没有具体的吼叫行为
        吃饭:没有具体的吃饭行为
        2.定义缉毒接口
        行为:
        缉毒
        3.定义缉毒狗:犬的一种
        行为：
        吼叫:汪汪叫
        吃饭:狗啃骨头
        缉毒:用鼻子侦测毒
        4.定义测试类:
        使用多态的形式创建缉毒狗对象,调用缉毒方法和吼叫方法

        运行效果
        汪汪叫
        用鼻子侦测毒
        狗啃骨头
*/

public class Demo {
    public static void main(String[] args) {
        Animal animal = new JiDuDog();

        JiDuDog jiDuDog = (JiDuDog) animal;
        jiDuDog.jiao();
        jiDuDog.jiDu();
        jiDuDog.eat();
    }
}
