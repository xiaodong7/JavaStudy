package com.itxiaozhou.demo2.Recursion;

/**
 * 递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。
 * 在递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出。
 *
 *                          ****构造方法,禁止递归*****
 */

public class Demo1DiGui {
    public static void main(String[] args) {
        //a();
        //b(1);
    }

    /*
    * 在递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出。
    * 栈溢出异常
    * */
    private static void b(int i) {
        System.out.println(i);
        if(i==20000){
            return;//结束方法
        }
        b(++i);
    }

    /*
    * 递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。
    * */
    private static void a() {
        System.out.println("a方法!");
        a();
    }
}
