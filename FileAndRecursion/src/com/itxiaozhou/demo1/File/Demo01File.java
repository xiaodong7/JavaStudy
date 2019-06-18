package com.itxiaozhou.demo1.File;

import java.io.File;

/**
 * java.io.File   file类
 * 记住三个单词:
 *      path:路径
 *      file:文件
 *      directory:文件夹/目录
 *
 *
 * 以后操作路径不能写死了
 *      D:\百度网盘下载\黑马最新教程\基础班\1-8 File类与IO流\第1节 File类  windows  \
 *
 *      D:/百度网盘下载/黑马最新教程/基础班/1-8 File类与IO流/第1节 File类  linux    /
 *
 *      "D:"+File.separator+"百度网盘下载"+File.separator+"黑马最新教程"+File.separator+"基础班"+File.separator+"1-8 File类与IO流"+File.separator+"第1节 File类"
 */
public class Demo01File {
    public static void main(String[] args) {


        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符 (windows:分号;  Linux:冒号:)

        String separator = File.separator;
        System.out.println(separator);//文件名称分隔符  (windows:反斜杠\  Linux:正斜杠/)
    }

}
