package com.itxiaozhou.thread.demo3.join;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        };
        t1.start();
        //join 等待线程死亡
        //Thread.currentThread().join();

        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
