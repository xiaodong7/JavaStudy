package com.itxiaozhou.practice.student_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o2.getSum() - o1.getSum();
                int num2 = num == 0 ? o1.getChinese() - o2.getChinese() : num;
                int num3 = num2 == 0 ? o1.getEnglish() - o2.getEnglish() : num2;
                int num4 = num3 == 0 ? o1.getName().compareTo(o2.getName()) : num3;
                return num4;
            }
        });

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第" + (i + 1) + "个学生信息: ");
            System.out.println("姓名: ");
            String name = sc.nextLine();
            System.out.println("语文: ");
            int chinese = sc.nextInt();
            System.out.println("语文: ");
            int math = sc.nextInt();
            System.out.println("语文: ");
            int English = sc.nextInt();

            Student s = new Student(name, chinese, math, English);
            ts.add(s);

        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("IOAndProperties\\dir\\student11.txt"));
        for (Student s : ts) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(s.getSum());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
