package com.itxiaozhou.thread.demo8.Synchronized;

/*
* 多线程 共享数据产生的安全问题
* */
public class Demo1Ticket {
    public static void main(String[] args) {
        RunnableImpl r = new RunnableImpl();//3个窗口共享100张票
        System.out.println("r:"+r);
        Thread t0 = new Thread(r);//模拟窗口
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t0.start();
        t1.start();
        t2.start();
    }
}
