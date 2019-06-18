package com.itxiaozhou.Thread.demo1.WaitAndNotify;

/**
 * 测试类
 */
public class Demo {
    public static void main(String[] args) {
        //创建包子对象
        BaoZi bz = new BaoZi();

        //创建包子铺线程,开启，生产包子
        BaoZiPu baoZiPu = new BaoZiPu(bz);
        baoZiPu.start();

        //创建吃货线程，开启，吃包子
        XiaoFeiZhe chihuo = new XiaoFeiZhe(bz);
        chihuo.start();
    }
}
