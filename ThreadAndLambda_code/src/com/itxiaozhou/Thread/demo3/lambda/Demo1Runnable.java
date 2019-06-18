package com.itxiaozhou.Thread.demo3.lambda;

public class Demo1Runnable {
    public static void main(String[] args) {
        //创建runnable实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象,构造方法中传递runnable实现类对象
        Thread t = new Thread(run);
        //开启线程
        t.start();


        //简化代码 匿名内部类的方式 实现多线程程序
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        }).start();


    }
}
