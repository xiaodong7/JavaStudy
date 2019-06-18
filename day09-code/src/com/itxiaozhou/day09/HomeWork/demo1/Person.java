package com.itxiaozhou.day09.HomeWork.demo1;
/*      1.定义Person类
        属性：
        姓名name、性别gender、年龄age、国籍nationality；
        方法：
        吃饭eat、睡觉sleep，工作work。
        */
public class Person {
    private String name;
    private String gender;
    private Integer age;
    private String nationality;

    public void eat(){
        System.out.println("吃饭!");
    }
    public void sleep(){
        System.out.println("睡觉!");
    }
    public void work(){
        System.out.println("工作!");
    }

    public Person(String name, String gender, Integer age, String nationality) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
