package com.itxiaozhou.demo2;

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr, "东方不败");
        Thread t2 = new Thread(mr, "令狐冲");
        t.start();
        t2.start();

    }
}
