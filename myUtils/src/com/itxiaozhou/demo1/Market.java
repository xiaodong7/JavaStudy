package com.itxiaozhou.demo1;


import java.util.Scanner;

public class Market {
    Scanner sc = new Scanner(System.in);


    Goods[] goods = {new Goods(1, "苹果", 5, "红富士"),
            new Goods(2, "泡面", 3, "康师傅"),
            new Goods(3, "香蕉", 4, "霸王蕉")
            //最简单的方法是在这里加入到100个对象

    };
    int num;
    int money;
    Goods[] goods2 = new Goods[100];

    public void Menu() {
        for (int i = 0; i < goods.length; i++) {
            System.out.println("编号：" + goods[i].index + "\t名称：" + goods[i].name + "\t价格：￥" + goods[i].price + "\t品牌：" + goods[i].brand);
            System.out.print("");
        }
        System.out.println("************************************************************");
        for (int i = 0; i >= 0; i++) {
            System.out.println("请输入商品编号：（输入0结束输入）");
            num = sc.nextInt();
            if (num == 0) {
                for (int j = 0; j < i; j++) {
                    System.out.println(goods2[j].index + "\t" + goods2[j].name + "\t" + goods2[j].price + "\t" + goods2[j].brand);
                }
                System.out.println("总价为" + money);
                break;
            }
            goods2[i] = goods[num - 1];
            money += goods[num - 1].price;
        }

    }


}
