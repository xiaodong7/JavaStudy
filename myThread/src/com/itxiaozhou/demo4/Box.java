package com.itxiaozhou.demo4;

public class Box {
    private int milk;
    private boolean state;

    public synchronized void put(int milk) {
        //如果有牛奶,送奶工就等待生产牛奶
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("送奶工将" + this.milk + "瓶奶装进奶箱");

        state = true;
        this.notifyAll();
    }

    public synchronized void get() {
        //如果没有牛奶,等待生产
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者往奶箱取" + this.milk + "瓶奶");

        state= false;
        notifyAll();

    }
}
