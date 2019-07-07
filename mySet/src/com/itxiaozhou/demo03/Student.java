package com.itxiaozhou.demo03;

public class Student {
    private String name;
    private int chinaese;
    private int math;

    public Student(String name, int chinaese, int math) {
        this.name = name;
        this.chinaese = chinaese;
        this.math = math;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinaese() {
        return chinaese;
    }

    public void setChinaese(int chinaese) {
        this.chinaese = chinaese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSum() {
        return this.chinaese + this.math;
    }
}
