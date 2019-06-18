package com.itxiaozhou.day07.demo1;


import java.util.Scanner;

public class ScannnerTest02 {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in));//输出匿名对象

        Scanner sc = new Scanner(System.in);
        input(new Scanner(System.in));//方法中传入匿名对象

        //普通方式传入
        input(sc);
    }

    public static Scanner input(Scanner sc){
        return sc;
    }

    public static Scanner input(){
        return new Scanner(System.in);//匿名对象作为返回值返回
    }
}
