package com.itxiaozhou.demo1;

public class Mythread extends Thread{

    @Override
    public void run() {
        System.out.println("我是自定义线程类");
        System.out.println("我的名字是: "+getName());
    }
}
