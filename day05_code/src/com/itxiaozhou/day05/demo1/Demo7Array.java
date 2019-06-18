package com.itxiaozhou.day05.demo1;

public class Demo7Array {
    public static void main(String[] args) {
        int[] arr = getArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static int[] getArray(){
        int[] arr ={132,43,354,765,76};
        return arr;
    }
}
