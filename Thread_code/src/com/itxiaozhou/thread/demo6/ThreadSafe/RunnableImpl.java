package com.itxiaozhou.thread.demo6.ThreadSafe;
//模拟卖票
@SuppressWarnings("all")
public class RunnableImpl implements Runnable{

    private int ticket = 100;//定义票数有100张票

    @Override
    public void run() {//执行卖票操作
        //每个窗口都在售票,每个窗口代表着一个线程
        while (true){
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
