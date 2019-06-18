package com.itxiaozhou.day06.demo3;

public class Phone {
    String brand;//品牌
    String color;//颜色
    int price;//价格

    /**
     * 打电话
     * @param name
     */
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    /**
     * 发短信
     */
    public void sendMassage(){
        System.out.println("群发短信");
    }

}
