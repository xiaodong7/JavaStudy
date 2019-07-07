package com.itxiaozhou.demo2.Recursion;

/*
 * 计算n的阶乘
 * */
public class Demo3DiGui {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(jc(n));
    }

    private static int jc(int n) {
        if (n == 1) {
            return 1;
        }
        return n * jc(n - 1);
    }
}
