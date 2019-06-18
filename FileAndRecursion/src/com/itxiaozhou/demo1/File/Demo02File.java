package com.itxiaozhou.demo1.File;

import java.io.File;

/**
 * 路径:
 *      绝对路径:是一个完整的路径
 *         以盘符(c:  D:)开始的路径
 *         c:\\a.txt
 *         D:\\ideaPorject\\JavaStudy
 *      相对路径:是一个简化的路径
 *          相对指的是相对于当前项目的根路径
 *             D:\\ideaPorject\\JavaStudy\\a.txt  简化为:a.txt(可以省略项目的根目录)
 *
 *      注意:
 *          路径是不区分大小写的
 *          路径中的文件名称分隔符Windows使用的是反斜杠\,反斜杠是转义字符,两个反斜杠代表一个普通的反斜杠
 */
public class Demo02File {

    public static void main(String[] args) {
        /*
           File类的构造方法
        */

        //show01();
        //show02("c:\\ ","a.txt");
        show03();
    }


    /*
    * File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
                * 参数把路径分成了两部分
                 *           File parent:父路径
                 *           String child:子路径
                 *    好处:父路径和子路径可以单独书写,使用起来非常灵活;父路径和子路径都可以变化
                 *         父路径是file类型,可以使用File的方法对路径进行一些操作,再使用路径创建对象
    * */
    private static void show03() {
        File parent = new File("c:\\");

        File file = new File(parent, "a.txt");
        System.out.println(file);

    }

    /*
    * File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
    *       参数把路径分成了两部分
    *           String parent:父路径
    *           String child:子路径
    *       父路径和子路径可以单独书写,使用起来非常灵活;父路径和子路径都可以变化
    *
    * */
    private static void show02(String parent, String child) {
        File f1 = new File(parent, child);
        System.out.println(f1);

    }

    /*
    * File(String pathname)
    *
    * String pathname:字符串的路径名称
    * 路径可以是文件结尾,也可以是文件夹结尾
    * 路径可以是绝对路径,也可以是相对路径
    * 路径可以存在,也可以不存在
    * 创建file对象 只是把字符串路径封装为file对象,不考虑路径的真假情况
    * */
    private static void show01() {
        File f1 = new File("D:\\ideaPorject\\JavaStudy\\a.txt");
        System.out.println(f1);//重写了object类中的toString方法  D:\ideaPorject\JavaStudy\a.txt

        File f2 = new File("D:\\ideaPorject\\JavaStudy");
        System.out.println(f2);

        File f3 = new File("a.txt");
        System.out.println(f3);
    }
}
