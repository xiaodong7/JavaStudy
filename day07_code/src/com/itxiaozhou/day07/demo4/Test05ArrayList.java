package com.itxiaozhou.day07.demo4;

import java.util.ArrayList;
import java.util.Random;

/*定义获取所有偶数元素集合的方法(ArrayList类型作为返回值)*/
public class Test05ArrayList {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(1000) + 1;
            list.add(i);
        }

        System.out.println(getArrayList(list));

    }

    public static ArrayList<Integer> getArrayList(ArrayList<Integer> list){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (Integer i : list) {
            if(i % 2 == 0){
                smallList.add(i);
            }
        }
        return smallList;
    }

}
