package com.itxiaozhou.Thread.demo1.WaitAndNotify;

public class XiaoFeiZhe extends Thread {
    private BaoZi bz;

    //使用带参的构造方法，为这个包子赋值
    public XiaoFeiZhe(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        //让消费者一直吃包子
        while(true){
            //必须使用同步技术使两个线程只有一个执行
            synchronized (bz){
                if(bz.flag==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //线程被唤醒之后，执行的代码：吃包子
                System.out.println("吃货正在吃："+bz.pi+bz.xian+"包子");
                //吃货吃完包子，修改包子的状态为false
                bz.flag = false;
                //吃货线程唤醒包子铺线程，生产包子
                bz.notify();
                System.out.println("吃货已经把："+bz.pi+bz.xian+"包子吃完了，包子铺开始生产包子");
                System.out.println("============================");
            }
        }
    }
}
