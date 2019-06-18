package com.itxiaozhou.demo3.CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
*    文件的复制操作
*
* 先读后写
*      就是先从硬盘到内存  输入流   FileInputStream
*      后从内存到硬盘     输出流   FileOutputStream
* */
public class Demo1CopyFile {
    public static void main(String[] args) throws IOException {
        long e = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("IOAndProperties\\c.txt");
        FileOutputStream fos = new FileOutputStream("FileAndRecursion\\c.txt");
        /*int len = 0;
        while((len = fis.read())!= -1){
            fos.write(len);
        }*/
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = fis.read(bytes))!= -1){
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();
        long s = System.currentTimeMillis();
        System.out.println(s-e);//判断程序运行时间

    }
}
