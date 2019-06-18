package com.itxiaozhou.thread.demo4.Runnable;

public class DemoRunnable {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread mt = new Thread(run);
        mt.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }
}
