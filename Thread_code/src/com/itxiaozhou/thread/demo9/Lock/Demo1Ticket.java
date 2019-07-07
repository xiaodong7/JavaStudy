package com.itxiaozhou.thread.demo9.Lock;

/*
* 多线程 共享数据产生的安全问题
* */
@SuppressWarnings("all")
public class Demo1Ticket {
    public static void main(String[] args) {
        RunnableImpl r = new RunnableImpl();//3个窗口共享100张票
        Thread t0 = new Thread(r);//模拟窗口
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t0.start();
        t1.start();
        t2.start();
    }
}
