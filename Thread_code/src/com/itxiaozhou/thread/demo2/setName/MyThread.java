package com.itxiaozhou.thread.demo2.setName;

//设置线程名称（了解）setName

public class MyThread extends Thread{

    public MyThread (String name){
        super(name);
    }

    public MyThread(){}

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
