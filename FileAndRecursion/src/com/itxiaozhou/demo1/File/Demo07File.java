package com.itxiaozhou.demo1.File;

import java.io.File;
//重名名文件或剪切文件
public class Demo07File {
    public static void main(String[] args) {
        File f1 = new File("FileAndRecursion\\a.txt");
        File f2 = new File("C:\\Users\\acer\\Desktop\\a.txt");
        boolean b = f2.renameTo(f1);
        System.out.println(b);
    }
}
