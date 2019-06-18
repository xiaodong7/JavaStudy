package com.itxiaozhou.thread.demo3.sleep;

//毫秒数结束之后，线程继续运行
public class Demo1Sleep {
    public static void main(String[] args) {

        //模拟秒表
        for (int i = 1; i <= 60 ; i++) {
            System.out.println(i);
            //使用Thread类中的sleep方法让程序睡眠一秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
