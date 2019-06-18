package com.itxiaozhou.demo1.File;

import java.io.File;

/*
    public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
    public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录
*/
public class Demo06File {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    //调用listFiles方法的File对象，表示的必须是实际存在的目录，否则返回null，无法进行遍历
    private static void show02() {
        File f = new File("D:\\ideaPorject\\JavaStudy\\FileAndRecursion");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);//eg:FileAndRecursion\a.txt(打印的是构造方法中路径的目录下的子文件/子目录)
        }
    }


    private static void show01() {
        File f = new File("FileAndRecursion");
        String[] names = f.list();
        for (String name : names) {
            System.out.println(name);
        }

    }

}
