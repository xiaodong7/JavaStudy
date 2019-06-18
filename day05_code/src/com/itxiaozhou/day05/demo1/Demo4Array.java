package com.itxiaozhou.day05.demo1;

/*获取数组中的最大值*/
public class Demo4Array {
    public static void main(String[] args) {
        int[] arr = {13, 43, 65, 33, 24};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("数组的最大值是："+max);
    }
}
