package com.itxiaozhou.day06.demo3;

public class Test01_Phone {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println("手机品牌是："+p.brand);
        System.out.println("手机颜色是："+p.color);
        System.out.println("手机价格是："+p.price);

        System.out.println("==================================");
        p.brand = "小米";
        p.color = "绿色";
        p.price = 2000;

        System.out.println("手机品牌是："+p.brand);
        System.out.println("手机颜色是："+p.color);
        System.out.println("手机价格是："+p.price);

        p.call("紫霞仙子");
        p.sendMassage();
    }
}
