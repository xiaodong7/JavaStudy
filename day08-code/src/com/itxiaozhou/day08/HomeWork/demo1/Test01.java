package com.itxiaozhou.day08.HomeWork.demo1;

import java.util.Scanner;

/*
题目:
        (1) 定义一个String字符串"   ab123cd   "，
        (2) 首先去除字符串两端的空白空格，然后截取出字符串中的最后3个字符并在控制台输出。
        (3) 例如: 最终显示的结果是  3cd

        提示TIP:
        A. 去掉两端空格的方法,查阅API:
public String trim()  去掉两端的空格,返回新的字符串
        B. 截取子字符串的方法,查阅API:
        String substring(int beginIndex)    返回一个字符串，该字符串是此字符串的子字符串。
        String substring(int beginIndex, int endIndex)   返回一个字符串，该字符串是此字符串的子字符串。

        扩展:
        可以采用键盘录入 Scanner 来录入一个字符串,然后再进行处理.上述题目处理（去掉两端空格,截取最后三位字符）
        Scanner 录入字符串的核心操作代码:   String str = sc.nextLine();  //nextLine() 可以录入空格
*/
public class Test01 {
    public static void main(String[] args) {
        /*扩展:
        可以采用键盘录入 Scanner 来录入一个字符串,然后再进行处理.上述题目处理（去掉两端空格,截取最后三位字符）
        Scanner 录入字符串的核心操作代码:   String str = sc.nextLine();  //nextLine() 可以录入空格*/
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        /*String s = "   ab123cd   ";
        System.out.println(s.trim().substring(4));*/
        System.out.println(s.trim().substring(4));
    }
}
