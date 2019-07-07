package com.itxiaozhou.demo1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        String newStr = sb.toString();

        System.out.println("是对称字符串:" + s.equals(newStr));
    }
}
