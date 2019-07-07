package com.itxiaozhou.practice.CopyFileDemo;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IOAndProperties\\c.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IOAndProperties\\cccc.txt"));
        //一次读写一个字节
        /*int len;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }*/

        //一次读写一个字节数组
        int len;
        byte [] arr = new byte[1024];
        while ((len = bis.read(arr)) != -1) {
            bos.write(arr,0,len);
        }

        bos.close();
        bis.close();
    }
}
