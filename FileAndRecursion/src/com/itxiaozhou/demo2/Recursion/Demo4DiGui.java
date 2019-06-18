package com.itxiaozhou.demo2.Recursion;

/*
* 遍历文件下所有的文件夹和文件
* */
import java.io.File;

public class Demo4DiGui {
    public static void main(String[] args) {
        File f = new File("FileAndRecursion");
        getAllFile(f);
    }

    private static void getAllFile(File f) {
        System.out.println(f);
        //遍历目录
        File[] files = f.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                getAllFile(file);
            }else {
                System.out.println(file);
            }
        }
    }
}
