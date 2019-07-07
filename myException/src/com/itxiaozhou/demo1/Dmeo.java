package com.itxiaozhou.demo1;

public class Dmeo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    private static void method() {//ctrl + alt + t
        try {
            int[] arr = {1, 3, 4, 5};
            arr[5] = 55;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
