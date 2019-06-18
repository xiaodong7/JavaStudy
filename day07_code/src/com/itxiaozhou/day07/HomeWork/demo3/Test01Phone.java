package com.itxiaozhou.day07.HomeWork.demo3;

import java.util.ArrayList;

/*
2.在测试类中，创建4个对象，将对象存入集合中。
        华为-1200-4
        苹果-9000-1
        锤子-3000-3
        小米-1800-2

        3.遍历集合，将使用年限小于等于2并且价格低于2000的手机打印出来  格式：华为-2000-3

        4.遍历集合,删除价格大于5000的手机对象

*/
public class Test01Phone {
    /*
        2.在测试类中，创建4个对象，将对象存入集合中。
        华为-1200-4
        苹果-9000-1
        锤子-3000-3
        小米-1800-2
    */
    public static void main(String[] args) {
        Phone p1 = new Phone("华为", 1200, 4);
        Phone p2 = new Phone("苹果", 9000, 1);
        Phone p3 = new Phone("锤子", 3000, 3);
        Phone p4 = new Phone("小米", 1800, 2);
        ArrayList<Phone> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        //method01(list);
        method02(list);
    }

    /*
        4.遍历集合,删除价格大于5000的手机对象
    */
    private static void method02(ArrayList<Phone> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice()>5000) {
                list.remove(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+"-"+list.get(i).getPrice()+"-"+list.get(i).getYears());
        }
    }

    /*
        3.遍历集合，将使用年限小于等于2并且价格低于2000的手机打印出来  格式：华为-2000-3
    * */
    private static void method01(ArrayList<Phone> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getYears()<=2 && list.get(i).getPrice()<2000) {
                System.out.println(list.get(i).getName()+"-"+list.get(i).getPrice()+"-"+list.get(i).getYears());
            }
        }
    }
}
