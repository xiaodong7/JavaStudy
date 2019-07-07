package com.itxiaozhou.demo7;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IOAndProperties\\e.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("IOAndProperties\\eeee.txt"));
        int len;
        /*while ((len = br.read()) != -1) {
            bw.write(len);
        }*/
        char[] arr = new char[1024];
        while ((len = br.read(arr)) != -1) {
            bw.write(arr, 0, len);
        }


        bw.close();
        br.close();
    }
}
