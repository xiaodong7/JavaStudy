package com.itxiaozhou.demo2;


import java.util.Scanner;

public class ScoreExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩:");
        int score = sc.nextInt();
        try {
            method(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }

    private static void method(int score) throws ScoreException {
        if(score < 0 || score >100){
            throw new ScoreException("你输入的成绩有误!");
        }
    }
}
