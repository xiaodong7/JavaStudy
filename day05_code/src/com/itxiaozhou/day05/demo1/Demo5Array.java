package com.itxiaozhou.day05.demo1;


public class Demo5Array {
    public static void main(String[] args) {
        //数组的值的反转
        int[] arr ={1,2,3,4,5};
        //最小索引min
        //最大索引max
        for (int min = 0, max =arr.length-1; min<=max ; min++,max--) {
            int temp = arr[min];//中间变量temp
            arr[min] = arr[max];
            arr[max] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
