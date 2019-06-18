package com.itxiaozhou.day07.HomeWork.demo3;
/*
1.创建Phone类，包含如下属性(品牌,价格,使用年限) 写一个标准的Phone类,  要求如下:
        private私有成员变量
        无参数构造方法 和 有参数构造方法
        getter/setter


*/

public class Phone {
    private String name;
    private Integer price;
    private Integer years;

    public Phone(String name, Integer price, Integer years) {
        this.name = name;
        this.price = price;
        this.years = years;
    }

    public Phone() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", years=" + years +
                '}';
    }
}
