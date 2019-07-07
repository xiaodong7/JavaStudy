package com.itxiaozhou.demo6;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IOAndProperties\\aaa.txt"),"GBK");
        osw.write("中国");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("IOAndProperties\\aaa.txt"), "GBK");

        int len;
        while ((len = isr.read()) != -1) {
            System.out.print((char)len);
        }
        isr.close();
    }
}
