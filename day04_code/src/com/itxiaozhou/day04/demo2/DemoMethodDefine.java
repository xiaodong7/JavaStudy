package com.itxiaozhou.day04.demo2;


public class DemoMethodDefine {
    public static void main(String[] args) {
        int sum = sum(100, 58);
        System.out.println(sum);

    }
    public static int sum(int a,int b){
        System.out.println("方法执行了");
        int result = a + b;
        return result;
    }
}
