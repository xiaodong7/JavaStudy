package com.itxiaozhou.demo03;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        TreeSet<Student> t = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o2.getSum() - o1.getSum();//总成绩降序
                if(num == 0){
                    num = o1.getName().compareTo(o2.getName());//姓名升序
                }
                return num;
            }
        });
        t.add(new Student("张三丰",89,90));
        t.add(new Student("张无忌",86,95));
        t.add(new Student("东方不败",100,94));
        t.add(new Student("令狐冲",84,97));
        t.add(new Student("风清扬",65,93));
        for (Student s : t) {
            System.out.println(s.getName()+","+s.getChinaese()+","+s.getMath()+","+s.getSum());
        }
       /* Integer i = 20;
        String s = String.valueOf(i);
        System.out.println(s.getClass());*/
    }
}
