package com.itxiaozhou.thread.demo8.Synchronized;

/*
* 多线程 共享数据产生的安全问题
* 模拟卖票产生了卖重票，和卖错误的票的问题
* 解决方案：
*   第二种解决方案:使用同步方法
*   使用步骤：
*       1.将出现线程问题（访问了共享数据）的代码块抽取到一个方法中
*       2.抽取的方法需要用synchronized 关键字修饰
*
*   定义一个同步方法
*   同步方法也能把方法内的代码块锁住
*   只让一个线程执行
*   但那个同步方法的锁对象是谁呢？
*   也就是实现类对象 new RunnableImpl();
*   也就是this
*
*
* */

public class RunnableImpl implements Runnable{

    private static int ticket = 100;//定义票数有100张票

    /*//创建锁对象
    Object obj = new Object();*/


    @Override
    public void run() {//执行卖票操作
        System.out.println("this:"+this);
        //每个窗口都在售票,每个窗口代表着一个线程
        while (true){
            payTicketStatic();
        }


    }
    /*
    * 静态的同步方法
    * 锁对象是谁？
    * 锁对象不能是this
    * this是创建对象之后产生的，static方法是优先于对象
    * static方法的锁对象是静态方法的本类的class属性-->class文件对象(RunnableImpl.class)
    *
    * */
    public static /*synchronized*/ void payTicketStatic(){
        //创建同步代码块
        synchronized (RunnableImpl.class){
            if(ticket > 0){//判断是否有票
                //模拟出票操作
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在卖票第"+ticket+"张票");
                ticket--;
            }
        }
    }
}
