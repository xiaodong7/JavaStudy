package com.itxiaozhou.demo01;

public class NewPhone extends Phone{
    @Override
    public void call(String name) {
        System.out.println("开启视频通话");
        super.call(name);
    }
}
