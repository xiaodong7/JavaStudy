package com.itxiaozhou.day07.demo2;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字小游戏
 * 游戏开始时，会随机生成一个1-100之间的整数 number 。玩家猜测一个数字 guessNumber ，会与 number 作比
 * 较，系统提示大了或者小了，直到玩家猜中，游戏结束
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println("猜数字小游戏开始了==============");
        Random r = new Random();
        int number = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("请输入你想的一个数字(1~100)：");
            int guessNumber = sc.nextInt();
            if(number > guessNumber){
                System.out.println("系统提示：你猜的数字"+guessNumber+"小了");
            }else if (number<guessNumber){
                System.out.println("系统提示：你猜的数字"+guessNumber+"大了");
            }else{
                System.out.println("系统提示：恭喜你答对了");
                break;
            }
        }
    }
}
