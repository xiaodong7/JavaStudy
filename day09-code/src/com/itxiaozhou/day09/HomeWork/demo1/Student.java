package com.itxiaozhou.day09.HomeWork.demo1;
/*2.根据Person类，写一个学生类Student 和Person是继承关系
        增加属性：
        学校school、学号stuNumber；
        方法:
        重写工作方法（学生的工作是学习）。*/
public class Student extends Person{

    private String school;
    private Integer stuNumber;

    @Override
    public void work() {
        System.out.println("学生需要学习");
    }

    public Student(String name, String gender, Integer age, String nationality, String school, Integer stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public Student() {
    }

    public Student(String school, Integer stuNumber) {
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public Student(String name, String gender, Integer age, String nationality) {
        super(name, gender, age, nationality);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(Integer stuNumber) {
        this.stuNumber = stuNumber;
    }
}
