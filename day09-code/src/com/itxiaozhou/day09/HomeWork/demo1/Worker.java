package com.itxiaozhou.day09.HomeWork.demo1;
/*
3.根据Person类，写一个工人类Worker  和Person是继承关系
        增加属性：
        单位unit、工龄workAge；
        方法:
        重写工作方法（工人的工作是盖房子）。
*/
public class Worker extends Person{
    private String unit;
    private Integer workage;

    @Override
    public void work() {
        System.out.println("工人的工作是盖房子");
    }

    public Worker() {
    }

    public Worker(String name, String gender, Integer age, String nationality, String unit, Integer workage) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workage = workage;
    }

    public Worker(String name, String gender, Integer age, String nationality) {
        super(name, gender, age, nationality);
    }

    public Worker(String unit, Integer workage) {
        this.unit = unit;
        this.workage = workage;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getWorkage() {
        return workage;
    }

    public void setWorkage(Integer workage) {
        this.workage = workage;
    }
}
