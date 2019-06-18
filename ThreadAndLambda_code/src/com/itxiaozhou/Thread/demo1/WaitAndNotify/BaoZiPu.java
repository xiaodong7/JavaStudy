package com.itxiaozhou.Thread.demo1.WaitAndNotify;
/*
*  包子铺线程（生产者）
* run线程任务：生产包子
* 对包子的状态分析
* true：有包子
*       包子铺调用wait方法进入等待状态
* false：没有包子
*       包子铺生产包子
*       增加一些趣味性：交替生产两种包子
*            有两种状态(i%2==0)
*       包子铺生产完了包子
*       更改包子的状态为true
*       唤醒消费者线程，吃包子
*
* 注意：生产者线程（包子铺线程）与包子线程是  通信（互斥）关系
*      必须使用同步技术使两个线程只有一个执行
*
* */
public class BaoZiPu extends Thread{
    private BaoZi bz;

    //使用带参的构造方法，为这个包子赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    //run线程任务：生产包子
    @Override
    public void run() {
        //定义一种变量
        int count = 0;
        //让包子铺一直生产包子
        while (true){
            //必须使用同步技术使两个线程只有一个执行
            synchronized (bz){
                //对包子的状态进行判断
                if(bz.flag == true){
                    //包子铺调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行:包子铺开始生产包子
                //趣味性操作:交替生产两种包子
                if(count%2 == 0){
                    //生产 薄皮 三鲜馅包子
                    bz.pi="薄皮";
                    bz.xian = "三鲜馅";
                }else{
                    //生产 冰皮 牛肉馅包子
                    bz.pi = "冰皮";
                    bz.xian = "牛肉馅";
                }
                count++;
                System.out.println("包子铺正在生产"+bz.pi+bz.xian+"包子");
                //包子铺正在生产包子
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //包子铺生产完包子了，修改包子的状态为true
                bz.flag = true;
                //唤醒消费者线程，让消费者吃包子
                bz.notify();
                System.out.println("包子已经生产好了:"+bz.pi+bz.xian+"包子，消费者可以吃包子了");
            }
        }

    }
}
