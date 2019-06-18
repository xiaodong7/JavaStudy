package com.itxiaozhou.day10.HomeWork.demo1;
/*
4.定义新手机继承手机类实现IPlay接口
        行为: 继承父类的行为,重写玩游戏方法
*/

public class NewPhone extends Phone implements IPlay{
    @Override
    public void play() {
        System.out.println("新手机玩游戏");
    }

    @Override
    public void call() {
        System.out.println("新手机打电话");
    }

    @Override
    public void message() {
        System.out.println("新手机发短信");
    }
}
