package com.itxiaozhou.day10.HomeWork.demo1;
/*3.定义旧手机类继承手机类
        行为: 继承父类的行为*/
public class OldPhone extends Phone{
    @Override
    public void call() {
        System.out.println("旧手机打电话");
    }

    @Override
    public void message() {
        System.out.println("旧手机发信息");
    }
}
