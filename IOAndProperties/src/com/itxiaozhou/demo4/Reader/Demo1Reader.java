package com.itxiaozhou.demo4.Reader;

import java.io.FileReader;
import java.io.IOException;

/*
* FileReader的使用
* */
public class Demo1Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("IOAndProperties\\d.txt");
        int len = 0;
        while((len = fr.read())!= -1){
            System.out.println((char) len);
        }
        fr.close();
    }
}
