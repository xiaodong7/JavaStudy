package com.itxiaozhou.day07.demo2;

import org.junit.Test;

import java.util.Random;

public class Test01_Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            int a = r.nextInt(10);
            System.out.println(a);
        }
        System.out.println((int) (Math.random()*31)+30);//输出打印[30,60]之间的随机整数
    }

    @Test
    /**
     * 获取1-n之间的随机数，包含n
     */
    public void demoRandom(){
        int n = 50;
        Random r = new Random();
        int i = r.nextInt(n)+1;
        System.out.println(i);

    }

}
