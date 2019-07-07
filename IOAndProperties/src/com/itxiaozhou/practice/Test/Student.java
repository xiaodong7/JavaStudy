package com.itxiaozhou.practice.Test;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String dizhi;

    public Student(Integer id, String name, Integer age, String dizhi) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dizhi = dizhi;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
    }
}
