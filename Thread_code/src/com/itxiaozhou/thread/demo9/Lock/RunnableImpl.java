package com.itxiaozhou.thread.demo9.Lock;
/*多线程 共享数据产生的安全问题
* 模拟卖票产生了卖重票，和卖错误的票的问题
*       解决方案：
*       第二种解决方案:使用lock锁
*       Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。
*       ReentrantLock类实现了lock接口
*
*       使用步骤：
*       1.在成员变量位置中创建ReentrantLock类对象
*       2.在可能出现线程安全问题代码前调用lock方法；
*       3.在可能出现线程安全问题代码后调用unLock方法；
*       */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable{

    private int ticket = 100;//定义票数有100张票

    Lock l = new ReentrantLock();

    @Override
    public void run() {//执行卖票操作
        //每个窗口都在售票,每个窗口代表着一个线程
        while (true){
            l.lock();//获取锁
            if(ticket > 0){//判断是否有票
                //模拟出票操作
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName()+"正在卖票第"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock();//释放锁
                }
            }
        }


    }
}
