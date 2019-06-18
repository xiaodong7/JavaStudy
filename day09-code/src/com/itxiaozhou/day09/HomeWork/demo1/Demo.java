package com.itxiaozhou.day09.HomeWork.demo1;
/*      1.定义Person类
        属性：
        姓名name、性别gender、年龄age、国籍nationality；
        方法：
        吃饭eat、睡觉sleep，工作work。
        2.根据Person类，写一个学生类Student 和Person是继承关系
        增加属性：
        学校school、学号stuNumber；
        方法:
        重写工作方法（学生的工作是学习）。
        3.根据Person类，写一个工人类Worker  和Person是继承关系
        增加属性：
        单位unit、工龄workAge；
        方法:
        重写工作方法（工人的工作是盖房子）。
        4.根据Student类，写一个学生干部类 StudentLeader 和Student是继承关系
        增加属性：
        职务job；
        方法:
        增加方法：开会meeting。
        5.编写测试类分别对上述3类具体人物进行测试。*/


        /*运行效果:
                学生需要学习!
                工人的工作是盖房子!
                学生干部喜欢开会!*/
public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.work();
        Worker w = new Worker();
        w.work();
        StudentLeader sl = new StudentLeader();
        sl.meeting();
    }
}
