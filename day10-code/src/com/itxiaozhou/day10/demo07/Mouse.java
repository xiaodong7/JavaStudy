package com.itxiaozhou.day10.demo07;

// 鼠标就是一个USB设备
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    //鼠标特有的方法
    public void click() {
        System.out.println("鼠标点击");
    }
}
