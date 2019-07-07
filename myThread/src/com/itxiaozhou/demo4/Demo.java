package com.itxiaozhou.demo4;

public class Demo {
    public static void main(String[] args) {
        Box b = new Box();
        Customer c = new Customer(b);
        Producer p = new Producer(b);
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(p);
        t1.start();
        t2.start();
    }
}
