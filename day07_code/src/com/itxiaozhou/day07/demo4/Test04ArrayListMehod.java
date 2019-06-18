package com.itxiaozhou.day07.demo4;

import java.util.ArrayList;
//打印集合
public class Test04ArrayListMehod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("宋远桥");
        list.add("张无忌");
        list.add("殷梨亭");
        printArrayList(list);

    }

    public static void printArrayList(ArrayList<String> list){
        //拼接做括号{
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                System.out.println(list.get(i)+"}");
            }else{
                System.out.print(list.get(i)+", ");
            }
        }
    }
}
