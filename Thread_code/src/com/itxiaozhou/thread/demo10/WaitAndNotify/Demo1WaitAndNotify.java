package com.itxiaozhou.thread.demo10.WaitAndNotify;
/*
* 等待和唤醒案例：线程之间的通信
*    创建一个顾客线程（消费者），告知老板要的包子的数量和种类，调用wait方法，放弃CPU的执行，进入WAITING状态（无限等待）
*    创建一个老板线程（生产者），花了5秒做包子，包子做完之后，调用notify方法，唤醒顾客吃包子
*
*    注意事项：
*    顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能一个在执行
*    同步使用的锁对象必须保持唯一
*    只有锁对象才能调用wait方法和notify方法
*     void wait()
          在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
*     void notify()
          唤醒在此对象监视器上等待的单个线程。
          会继续执行wait方法之后的代码
* */
public class Demo1WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                while(true){
                    synchronized (obj){
                        System.out.println("告知老板要的包子的数量和种类");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子已经做好了，开吃");
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
                        obj.notify();
                    }
                }
            }
        }.start();
    }

}
