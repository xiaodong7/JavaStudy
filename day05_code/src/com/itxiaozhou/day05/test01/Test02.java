package com.itxiaozhou.day05.test01;

import java.util.Arrays;

/*定义一个方法 boolean equals(int[] arr1,int[] arr2)
        功能:比较两个数组是否相等(长度和内容均相等则认为两个数组是相同的)*/
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5};
        int[] arr1 = {1, 2, 3, 4, 4, 5};
        System.out.println(equals(arr, arr1));
    }

    public static boolean equals(int[] arr, int[] arr2) {

        /*if (a == a2) {
            return true;
        }
        if (a == null || a2 == null) {
            return false;
        }*/

        int length = arr.length;

        if (arr2.length != length) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (arr[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
