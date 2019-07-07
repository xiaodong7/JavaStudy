package com.itxiaozhou.demo01;

import org.junit.Test;

public class Outer {
    private /*static*/ int num = 10 ;

    /*public static void main(String[] args) {
        new Inner().show();
    }*/

    private  /*static*/ class Inner{
        void show(){
            System.out.println("我是内部类");
            System.out.println(num);
        }
    }

    @Test
    public void demo01(){
        new Inner().show();
    }


}
