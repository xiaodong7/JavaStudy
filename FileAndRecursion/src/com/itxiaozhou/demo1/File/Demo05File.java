package com.itxiaozhou.demo1.File;

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) throws IOException {
        //show01();
        //show02();
        show03();
    }

    /*
    * file类中delete()方法 :删除file表示的文件/文件夹
    * 返回值:boolean
    * true:文件/文件夹删除成功,返回true
    * false:文件夹中有内容,不会删除,返回false;构造方法中的路径不存在,返回false
    *
    *       注意:delete方法是直接删除硬盘文件,不走回收站的,删除要谨慎!!!!
    * */
    private static void show03() {
        File f = new File("FileAndRecursion\\新建文件夹");
        boolean b = f.delete();
        System.out.println(b);

    }

    /*
    * file类中的mkdir()方法 :创建单级文件夹
    *          mkdirs()方法:既可以创建单级文件夹,也可以创建多级文件夹
    *          返回值为boolean
    *          true:文件夹不存在,创建文件,返回true
    *          false:文件夹存在,不会创建,返回false;构造方法中给出的路径不存在 返回false
    *          只能创建文件夹,不能创建文件夹
    * */
    private static void show02() {
        File f = new File("D:\\ideaPorject\\JavaStudy\\FileAndRecursion\\aaa");
        System.out.println(f.mkdir());

        File f1 = new File("FileAndRecursion\\bbb");
        System.out.println(f1.mkdir());

        File f2 = new File("FileAndRecu\\bbb");
        System.out.println(f2.mkdir());

        File f3 = new File("FileAndRecursion\\bbb\\ccc\\ddd");
        System.out.println(f3.mkdirs());

        File f4 = new File("FileAndRecursion\\bbb.txt");
        System.out.println(f4.mkdir());
    }

    /*
    * file类中的createNewFile方法
    *
    * 返回值为boolean
    * true:文件不存在,创建文件,返回true
    * false:文件存在,不会创建,返回false
    *
    * */
    private static void show01() throws IOException {
        File f = new File("D:\\ideaPorject\\JavaStudy\\FileAndRecursion\\a.txt");
        boolean b = f.createNewFile();
        System.out.println(b);//true

        File f2 = new File("FileAndRecursion\\b.txt");//相对路径
        System.out.println(f2.createNewFile());

        File f3 = new File("FileAndRecursion\\新建文件夹");
        System.out.println(f3.createNewFile());//不要被名称迷惑,要看文件类型

        File f4 = new File("D:\\ideaPorject\\JavaStudy\\FileAndRecurs\\a.txt");
        System.out.println(f4.createNewFile());//路径不存在,抛出IOException异常
    }
}
