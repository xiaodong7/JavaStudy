package com.itxiaozhou.demo3;

public class MyRunnable implements Runnable {
    private int start;
    private int end;

    public MyRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public MyRunnable() {
    }

    @Override
    public void run() {
        for (int i = start; i <=end; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
