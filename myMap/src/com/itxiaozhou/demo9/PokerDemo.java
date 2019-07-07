package com.itxiaozhou.demo9;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        //定义卡牌颜色
        String[] colors = {"♦", "♥", "♠", "♣"};

        //定义牌
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //装牌
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("大王");
        array.add("小王");

        //洗牌
        Collections.shuffle(array);

        //发牌
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        ArrayList<String> d = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            String p = array.get(i);
            if ((i >= array.size() - 3)) {
                d.add(p);
            } else if (i % 3 == 0) {
                a.add(p);
            } else if (i % 3 == 1) {
                b.add(p);
            } else if (i % 3 == 2) {
                c.add(p);
            }
        }

        lookPoker("张无忌", a);
        lookPoker("令狐冲", b);
        lookPoker("猪八戒", c);
        lookPoker("底牌", d);


    }

    private static void lookPoker(String name, ArrayList<String> arrayList) {
        System.out.print(name+"的牌是:"+"\t");
        for (String poker : arrayList) {
            System.out.print(poker + "\t");
        }
        System.out.println();
    }
}
