package com.itxiaozhou.thread.demo5.innerClassThread;

/*
        匿名内部类实现多线程的创建
        内部类：写在其他类内部的类
        匿名内部类的作用：简化代码
              把子类继承父类，重写父类的方法，创建子类对象合成一步完成
              把实现类实现接口，重写接口的方法，创建实现类对象合成一步完成
        匿名内部类的最终产物：子类、内部类对象   而这个类没有名字

        格式：
        new 父类/接口 (){
            重写父类/接口中的方法
        };
      */
public class Demo1InnerClassThread {
    public static void main(String[] args) {
        //线程创建：继承父类Thread
        new Thread(){
            //重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+i);
                }
            }
        }.start();

        //线程创建：实现runnable接口
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->  runnable" + i);
                }
            }
        };
        new Thread(r).start();

        //简化runnable方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->  runnable" + "小周");
                }
            }
        }).start();
    }
}
