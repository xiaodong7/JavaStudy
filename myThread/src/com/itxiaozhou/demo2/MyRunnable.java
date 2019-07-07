package com.itxiaozhou.demo2;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
