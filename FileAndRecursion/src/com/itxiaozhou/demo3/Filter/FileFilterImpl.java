package com.itxiaozhou.demo3.Filter;

import java.io.File;
import java.io.FileFilter;


/*
* 过滤器的使用
* */
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        //如果file是个文件夹就继续遍历
        if(pathname.isDirectory()){
           return true;
        }
        //判断file是不是以.java为结尾的文件
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
