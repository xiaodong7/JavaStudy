package com.itxiaozhou.thread.demo1.getName;

//获取线程的名称
public class MyThread extends Thread {
    /**
     * 定义线程名称的构造方法
     * @param //name
     */
    /*public MyThread(String name) {
        //调用父类String参数的构造方法，指定线程的名称
        super(name);
    }*/

    //重写run方法，完成该线程执行的逻辑
    @Override
    public void run() {
        //获取线程名称的第一种方式
        //String name = getName();
        //System.out.println(name);

        //获取线程名称的第二种方式   Thread-0  Thread-1
        //System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"正在执行"+i);
        }
    }
}
