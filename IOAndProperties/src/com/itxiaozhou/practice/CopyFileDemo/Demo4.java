package com.itxiaozhou.practice.CopyFileDemo;

import java.io.*;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("IOAndProperties\\d.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IOAndProperties\\dddd.txt"));
        //一次读取一个字符
        /*int len;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }*/

        //一次读取一个字符数组
        int len;
        char[] arr = new char[1024];
        while ((len = isr.read(arr)) != -1) {
            osw.write(arr,0,len);
        }

        osw.close();
        isr.close();
    }
}
