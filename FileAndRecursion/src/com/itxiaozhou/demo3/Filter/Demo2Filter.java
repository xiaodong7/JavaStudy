package com.itxiaozhou.demo3.Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo2Filter {
    public static void main(String[] args) {
        File f = new File("FileAndRecursion");
        //getAllFile(f);
        getAllFile2(f);
    }

    /*
    * 使用lambda方式优化匿名内部类
    * */
    private static void getAllFile2(File f) {
        /*File[] files = f.listFiles((File dir, String name)->{
            return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
        });*/

        //lambda表达式省略写法
        /*File[] files = f.listFiles((dir, name)->
                new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java")
        );*/

        /*File[] files = f.listFiles((File pathname)->{
            return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
        });*/

        //lambda表达式省略写法
        File[] files = f.listFiles(pathname->
                pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java")
        );

        for (File file : files) {
            if(file.isDirectory()){
                getAllFile(file);
            }else {
                System.out.println(file);
            }
        }
    }

    /*
    * 使用匿名内部类的方式
    * */
    private static void getAllFile(File f) {
        //使用匿名内部类的方式
        /*File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                //过滤规则
                //如果file是个文件夹就继续遍历
//                if(pathname.isDirectory()){
//                    return true;
//                }
                //判断file是不是以.java为结尾的文件
                //return pathname.getName().toLowerCase().endsWith(".java");
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
            }
        });*/
        File[] files = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });

        for (File file : files) {
            if(file.isDirectory()){
                getAllFile(file);
            }else {
                System.out.println(file);
            }
        }
    }
}
