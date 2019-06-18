package com.itxiaozhou.day08.HomeWork.demo2;

import java.util.Scanner;

/*
题目:
        (1) 键盘录入一个字符串数据
        (2) 查看该字符串数据当中,大写字母个数,小写字母个数,数字个数,其他字符个数
        (3) 例如:
        键盘录入的字符串如下:
        12##3AB爱Cab生活c7爱川哥哥89
        打印出来结果数据:
        大写字母个数: 3 个
        小写字母个数: 3 个
        数字字符个数: 6 个
        其他字符个数: 9 个
*/
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int countUpper = 0; // 大写字母
        int countLower = 0; // 小写字母
        int countNumber = 0; // 数字
        int countOther = 0; // 其他字符
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if('A'<= aChar&&'Z'>=aChar){
               countUpper++;
            }else if ('a'<= aChar&&'z'>=aChar){
                countLower++;
            }else if ('0'<= aChar&&'9'>=aChar){
                countNumber++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母个数: "+countUpper+"个");
        System.out.println("小写字母个数: "+countLower+"个");
        System.out.println("数字字符个数: "+countNumber+"个");
        System.out.println("其他字符个数: "+countOther+"个");
    }
}
