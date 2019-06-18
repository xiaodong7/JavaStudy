package com.itxiaozhou.thread.demo1.getName;

public class Demo1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        //开启新线程
        mt.start();

        new MyThread().start();

        System.out.println(Thread.currentThread().getName());
    }
}
