package com.itxiaozhou.demo10;

import java.util.*;

public class PokerDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        ArrayList<Integer> array = new ArrayList<>();
        //定义卡牌颜色
        String[] colors = {"♦", "♥", "♠", "♣"};

        //定义牌
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //装编号
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                map.put(index, color + number);
                array.add(index);
                index++;
            }
        }
        map.put(index, "小王");
        array.add(index);
        index++;
        map.put(index, "大王");
        array.add(index);

        //洗编号
        Collections.shuffle(array);

        //发牌
        TreeSet<Integer> a = new TreeSet<>();
        TreeSet<Integer> b = new TreeSet<>();
        TreeSet<Integer> c = new TreeSet<>();
        TreeSet<Integer> d = new TreeSet<>();
        for (int i = 0; i < array.size(); i++) {
            if (i >= array.size() - 3) {
                d.add(array.get(i));
            } else if (i % 3 == 0) {
                a.add(array.get(i));
            } else if (i % 3 == 1) {
                b.add(array.get(i));
            } else if (i % 3 == 2) {
                c.add(array.get(i));
            }
        }
        lookPoker("刘备", a, map);
        lookPoker("孙权", b, map);
        lookPoker("曹操", c, map);
        lookPoker("底牌", d, map);

    }

    private static void lookPoker(String name, TreeSet<Integer> set, HashMap<Integer, String> map) {
        System.out.print(name + "的牌是:" + "\t");
        for (Integer key : set) {

            String s = map.get(key);
            System.out.print(s + "\t");
        }
        System.out.println();
    }
}
