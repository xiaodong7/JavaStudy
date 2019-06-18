package com.itxiaozhou.thread.demo10.WaitAndNotify;
/*
* 进入到TimeWaiting状态（计时等待）有两种方式：
* 1.sleep()方法 在毫秒值结束后，线程睡醒进入到Runnable/Blocked状态
* 2.wait()方法 在毫秒值结束后，还没有被notify()方法唤醒，就会自动睡醒，线程睡醒进入到Runnable/Blocked状态
* */
public class Demo2WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                while(true){
                    synchronized (obj){
                        System.out.println("顾客1告知老板要的包子的数量和种类");
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子已经做好了，顾客1开吃");
                        System.out.println("--------------------------------");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while(true){
                    synchronized (obj){
                        System.out.println("顾客2告知老板要的包子的数量和种类");
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子已经做好了，顾客2开吃");
                        System.out.println("--------------------------------");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while(true){
                    //花了5秒做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("老板包子做好了,通知顾客吃包子");
                        //obj.notify();
                        obj.notifyAll();//唤醒所有等待的线程
                    }
                }
            }
        }.start();
    }
}
