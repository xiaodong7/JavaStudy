package com.itxiaozhou.demo1.File;

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {
        show01();
        //show02();
        //show03();
    }


    /*
    * File类中的isDirectory方法
    * */
    private static void show03() {
        File f = new File("D:\\ideaPorject\\JavaStudy");
        System.out.println(f.isDirectory());
    }

    /*
    * File类中的isFile方法
    * */
    private static void show02() {
        File f = new File("D:\\ideaPorject\\JavaStudy\\a.txt");
        System.out.println(f.isFile());
    }

    /*
    * File类的exists方法   判断构造方法的路径是否存在
    *
    * 一般都是先判断路径是否存在,在判断是文件还是文件夹
    * */
    private static void show01() {
        File f = new File("D:\\ideaPorject\\JavaStudy");
        System.out.println(f.exists());//true

        File f1 = new File("D:\\ideaPorject\\Java");
        System.out.println(f1.exists());//false

        File f2= new File("a.txt");//相对路径
        System.out.println(f2.exists());//true

    }


}
