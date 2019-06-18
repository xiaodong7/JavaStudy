package com.itxiaozhou.day07.HomeWork.demo1;

import java.util.ArrayList;
import java.util.Random;

/*      1. ArrayList练习之存储随机数字
        2. ArrayList练习之存储自定义对象
        3. ArrayList练习之按指定格式遍历集合字符串
        4. ArrayList练习之筛选集合中的随机数*/
public class Test01 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        //show01();
        //show02(show01());
        show03(show01());

    }

    //4. ArrayList练习之筛选集合中的随机数  筛选集合中的偶数
    private static void show03(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if((list.get(i))%2==0){
                newList.add(list.get(i));
            }
        }
        System.out.println(newList);
    }

    //3. ArrayList练习之按指定格式遍历集合
    private static void show02(ArrayList<Integer> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i)+"]");
            }else{
                System.out.print(list.get(i)+", ");
            }
        }


    }

    //1. ArrayList练习之存储随机数字
    private static ArrayList<Integer> show01() {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int x = r.nextInt(31);//[0,30]
            list.add(x);
        }
        //System.out.println(list);//打印集合
        return list;
    }
}
