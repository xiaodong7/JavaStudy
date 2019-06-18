package com.itxiaozhou.day07.demo3;

public class TestStudentArray {
    public static void main(String[] args) {
        Student[] stus = new Student[3];
        Student s = new Student("刘备", 18);
        Student s2 = new Student("孙权", 50);
        Student s3 = new Student("曹操",45);
        stus[0] = s;
        stus[1] = s2;
        stus[2] = s3;
        /*for (Student student : stus) {
            System.out.println(student.getName()+"------"+student.getAge());
        }*/
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].getName()+"------"+stus[i].getAge());
        }
    }
}
