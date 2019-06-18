package com.itxiaozhou.day05.demo2;
//方法的参数为基本类型时,传递的是数据值. 方法的参数为引用类型时,传递的是地址值
public class Demo2Array {
    public static void main(String[] args) {
        int [] arr ={223,699,5452,56};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int[] arr){
        arr[0] = 200;
    }
}
