package com.itxiaozhou.demo6;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("IOAndProperties\\e.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IOAndProperties\\eee.txt"));
        char[] arr = new char[1024];
        int len;
        while ((len = isr.read(arr)) != -1) {
            osw.write(arr,0,len);
        }
        osw.close();
        isr.close();
    }
}
