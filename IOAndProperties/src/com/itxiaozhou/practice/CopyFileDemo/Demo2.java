package com.itxiaozhou.practice.CopyFileDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IOAndProperties\\b.txt");
        FileOutputStream fos = new FileOutputStream("IOAndProperties\\bbbb.txt");

        /*
        * 读取一个字节写入一个字节
        * */
        /*int len;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }*/

        /*
        * 一次读写一个字节数组
        * */
        int len ;
        byte[] arr = new byte[1024];
        while ((len = fis.read(arr)) != -1) {
            fos.write(arr,0,len);
        }
        fos.close();
        fis.close();
    }
}
