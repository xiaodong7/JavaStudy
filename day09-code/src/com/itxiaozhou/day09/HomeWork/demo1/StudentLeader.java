package com.itxiaozhou.day09.HomeWork.demo1;
/*4.根据Student类，写一个学生干部类 StudentLeader 和Student是继承关系
        增加属性：
        职务job；
        方法:
        增加方法：开会meeting。*/
public class StudentLeader extends Student{
    private String job;
    public void meeting(){
        System.out.println("学生干部喜欢开会");
    }

    public StudentLeader(String job) {
        this.job = job;
    }

    public StudentLeader() {
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
