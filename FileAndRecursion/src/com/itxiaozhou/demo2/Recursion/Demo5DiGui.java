package com.itxiaozhou.demo2.Recursion;

/*
 * 遍历文件下所有的文件夹和文件
 *
 * 需求:从这目录中  只要.java为结尾文件
 * */

import java.io.File;

public class Demo5DiGui {
    public static void main(String[] args) {
        File f = new File("FileAndRecursion");
        getAllFile(f);
    }

    private static void getAllFile(File f) {
        //System.out.println(f);//打印遍历的目录
        //遍历目录
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                //把file对象转为string对象
                String ff = file.toString();
                //判断文件是否是以.java结尾
                boolean b = ff.endsWith(".java");
                if (b) {
                    System.out.println(file);
                }

            }
        }
    }
}
