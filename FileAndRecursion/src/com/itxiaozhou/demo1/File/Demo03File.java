package com.itxiaozhou.demo1.File;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        //show01();
        //show02();
        //show03();
        show04();
    }

    /*
    * File类
    * length();的使用 :获取的是构造方法指定文件的大小,以字节为单位
    * 文件夹是没有大小概念的,不能获取文件夹的大小
    * 如果文件夹的路径不存在,那么length返回的值为0
    *
    * */
    private static void show04() {
        File f = new File("D:\\ideaPorject\\JavaStudy\\a.txt");
        long length = f.length();
        System.out.println(length);

        File f1 = new File("D:\\ideaPorject\\JavaStudy\\b.txt");
        long length1 = f1.length();
        System.out.println(length1);

        File f2 = new File("D:\\ideaPorject\\JavaStudy");
        long length2 = f2.length();
        System.out.println(length2);
    }

    private static void show03() {
        File f = new File("D:\\ideaPorject\\JavaStudy\\a.txt");
        String name = f.getName();//获取的就是构造方法传递的路径的结尾(文件夹/文件)
        System.out.println(name);

        File f1 = new File("D:\\ideaPorject\\JavaStudy");
        String name1 = f1.getName();
        System.out.println(name1);
    }

    private static void show02() {
        File f = new File("D:\\ideaPorject\\JavaStudy\\a.txt");
        String path = f.getPath();//获取构造方法中的路径
        System.out.println(path);

        File f1 = new File("a.txt");
        String path1 = f1.getPath();
        System.out.println(path1);

        System.out.println(f1);
        System.out.println(f1.toString());
    }

    private static void show01() {
        File f = new File("D:\\ideaPorject\\JavaStudy\\a.txt");
        String absolutePath = f.getAbsolutePath();//获取file的绝对路径
        System.out.println(absolutePath);

        File f1 = new File("a.txt");
        String absolutePath1 = f.getAbsolutePath();
        System.out.println(absolutePath1);



    }
}
