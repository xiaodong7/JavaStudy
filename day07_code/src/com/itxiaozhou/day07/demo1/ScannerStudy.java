package com.itxiaozhou.day07.demo1;

import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int num = sc.nextInt();
        System.out.println("输入第二个数：");
        int num1 = sc.nextInt();
        int sum = num+num1;
        System.out.println("两个数的和为："+sum);
    }
}
