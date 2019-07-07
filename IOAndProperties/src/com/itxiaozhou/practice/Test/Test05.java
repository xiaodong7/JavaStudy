package com.itxiaozhou.practice.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/*
* 向文件中写入对象集合(指定的格式)
* */
public class Test05 {
    public static void main(String[] args) throws IOException {
        //创建对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("IOAndProperties\\dir\\student.txt"));
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student(1,"东方不败",20,"随州"));
        arr.add(new Student(2,"令狐冲",22,"武汉"));
        arr.add(new Student(3,"西门吹雪",25,"上海"));
        //遍历集合
        for (Student s : arr) {
            StringBuilder sb = new StringBuilder();
            //格式
            sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getDizhi());
            //向文件中写入数据
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
    }
}
