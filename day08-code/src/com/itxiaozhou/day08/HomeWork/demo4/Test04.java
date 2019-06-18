package com.itxiaozhou.day08.HomeWork.demo4;

/*
题目:
        (1) 定义一个字符串"aaammssDJEjn"
        (2) 定义一个方法，将字符串传入其中，将字符串的首写字母变为大写，其余变成小写字母
        (3) 将返回的字符串在控制台上打印出来。

        提示:
        A. 以下方法,通过查阅API可以获得到
        a. 字符串变大写的方法   public String toUpperCase()
        b. 字符串变小写的方法   public String toLowerCase()
        c. 截取子字符串的方法   public String substring(int beginIndex, int endIndex)
        B. 整体效果演示
        请输入字符串:   aaammssDJEjn
        最终结果如下:   Aaammssdjejn
*/

public class Test04 {
    public static void main(String[] args) {
        String s = "aaammssDJEjn";
        System.out.println(method(s));
    }

    private static String method(String s) {
        String s1 = s.substring(0, 1).toUpperCase();//首字母变换
        String s2 = s.substring(1).toLowerCase();//首字母以外的字母的变换
        s=s1+s2;
        return s;
    }
}
