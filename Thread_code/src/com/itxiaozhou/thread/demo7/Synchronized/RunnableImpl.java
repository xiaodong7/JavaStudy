package com.itxiaozhou.thread.demo7.Synchronized;

/*
* 多线程 共享数据产生的安全问题
* 模拟卖票产生了卖重票，和卖错误的票的问题
* 解决方案：
*   第一种解决方案:同步代码块
*   synchronized(锁对象){
*       可能出现多线程共享数据的安全问题的代码块
*   }
*
*   注意：
*   1.锁对象可以是任意对象。
*   2.但是必须保证多个线程使用的是同一个锁对象
*
*   3.锁对象的作用:
*      把同步代码块锁住，只让一个线程在同步代码块中执行
*
* */
@SuppressWarnings("all")
public class RunnableImpl implements Runnable{

    private int ticket = 100;//定义票数有100张票

    //创建锁对象
    Object obj = new Object();


    @Override
    public void run() {//执行卖票操作
        //每个窗口都在售票,每个窗口代表着一个线程
        while (true){
            //创建同步代码块
            synchronized (this){  //ctrl+alt+t  快捷键 选择  synchronized
                if(ticket > 0){//判断是否有票
                    //模拟出票操作
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在卖票第"+ticket+"张票");
                    ticket--;
                }else {
                    break;
                }
            }
        }


    }
}
