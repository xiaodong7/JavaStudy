package com.itxiaozhou.day06.demo1;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Demo1PrintArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        //需求：打印成[1,2,3,4,5]
        //面向过程
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.println(arr[i]+"]");
            }else {
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("===================");
        //使用面向对象
        System.out.println(Arrays.toString(arr));

        System.out.println("-------[华丽的分割线]--------");

    }

    private static int[] show(int [] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.println(arr[i]+"]");
            }else {
                System.out.print(arr[i]+", ");
            }
        }
        return arr;
    }

}
