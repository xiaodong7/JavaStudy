package com.itxiaozhou.day07.demo1;

import java.util.Scanner;

//从键盘输入三个数，并求出其最大值
public class ScannnerTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int a = sc.nextInt();
        System.out.println("输入第二个数：");
        int b = sc.nextInt();
        System.out.println("输入第三个数：");
        int c = sc.nextInt();

        int temp = (a>b?a:b);
        int max =(temp > c?temp: c);

        System.out.println("最大值为："+max);
    }
}
