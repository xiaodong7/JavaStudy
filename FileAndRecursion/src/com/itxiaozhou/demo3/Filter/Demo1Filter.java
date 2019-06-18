package com.itxiaozhou.demo3.Filter;

import java.io.File;

public class Demo1Filter {
    public static void main(String[] args) {
        File f = new File("FileAndRecursion");
        getAllFile(f);
    }

    private static void getAllFile(File f) {
        //遍历目录
        File[] files = f.listFiles(new FileFilterImpl());//传入过滤器的实现类
        for (File file : files) {
            if(file.isDirectory()){
                getAllFile(file);
            }else {
                System.out.println(file);
            }
        }
    }
}
