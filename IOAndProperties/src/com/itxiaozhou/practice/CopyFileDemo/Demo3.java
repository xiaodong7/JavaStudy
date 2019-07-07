package com.itxiaozhou.practice.CopyFileDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("IOAndProperties\\a.txt");
        FileWriter fw = new FileWriter("IOAndProperties\\aaaa.txt");

        //一次读取一个字符
        /*int len;
        while ((len = fr.read()) != -1) {
            fw.write(len);
        }*/

        //一次读取一个字符数组
        int len;
        char[] arr = new char[1024];
        while ((len = fr.read(arr)) != -1) {
            fw.write(arr,0,len);
        }
        fw.close();
        fr.close();
    }
}
