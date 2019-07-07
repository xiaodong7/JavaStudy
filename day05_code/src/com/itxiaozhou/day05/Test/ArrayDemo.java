package com.itxiaozhou.day05.Test;


public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 6};
        System.out.println(show(arr));
    }

    private static String show(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                str += arr[i];
            } else {
                str += arr[i] + ",";
            }

        }
        str += "]";
        return str;
    }
}
