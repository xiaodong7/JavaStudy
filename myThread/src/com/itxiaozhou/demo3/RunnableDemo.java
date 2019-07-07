package com.itxiaozhou.demo3;


/*
* 线程1  打印 1-20
* 线程2  打印 21-40
* ...
* 线程5  打印 81-100
* */
public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable(1,20);
        MyRunnable mr2 = new MyRunnable(21,40);
        MyRunnable mr3 = new MyRunnable(41,60);
        MyRunnable mr4 = new MyRunnable(61,80);
        MyRunnable mr5 = new MyRunnable(81,100);
        Thread t = new Thread(mr, "001");
        Thread t2 = new Thread(mr2, "002");
        Thread t3 = new Thread(mr3, "003");
        Thread t4 = new Thread(mr4, "004");
        Thread t5 = new Thread(mr5, "005");
        t.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
