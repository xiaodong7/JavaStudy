package com.itxiaozhou.day10.周云飞.Test01;

import java.util.ArrayList;

public class Test {
    /*①定义方法，public static ArrayList<User> getUser(ArrayList<User> users)，获得年龄大于等于18岁,
        并且性别为 “男”的User，加入新的集合并返回。

     ②在main方法中完成以下功能：创建5个User对象并赋值，加入ArrayList<User>集合中，调用getUser方法，
     遍历返回的新集合输出新集合中所有元素信息，格式如下：
*/
    public static void main(String[] args) {
        User u1 = new User("张三", 18, "男");
        User u2 = new User("李四", 12, "男");
        User u3 = new User("王五", 22, "女");
        User u4 = new User("赵六", 20, "男");
        User u5 = new User("小红", 15, "女");
        ArrayList<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
        ArrayList<User> list = getUser(users);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+" "+list.get(i).getAge()+" "+list.get(i).getSex());
        }
    }


    public static ArrayList<User> getUser(ArrayList<User> users){
        ArrayList<User> newArray = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getAge()>=18&& users.get(i).getSex()=="男"){
                newArray.add(users.get(i));
            }
        }
        return newArray;
    }
}
