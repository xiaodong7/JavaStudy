package com.itxiaozhou.demo6;

import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        String GBKPath = "C:\\Users\\acer\\Desktop\\嘻嘻.txt";
        String UTF8Path = "C:\\Users\\acer\\Desktop\\哈哈.txt";

        InputStreamReader isr = new InputStreamReader(new FileInputStream(GBKPath), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(UTF8Path));


        char[] arr = new char[1024];
        int len;
        while ((len = isr.read(arr)) != -1) {
            osw.write(arr,0,len);
        }
        isr.close();
        osw.close();

    }
}
