package com.itxiaozhou.Thread.demo3.lambda;

/**
 * lambda表达式的标准格式
 *     (参数列表)->{一些重写方法的方法体}
 */
public class Demo2lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式,来实现多线程
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        }).start();

        //使用lambda表达式,实现多线程
        new Thread(()->{

                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        ).start();
    }
}
