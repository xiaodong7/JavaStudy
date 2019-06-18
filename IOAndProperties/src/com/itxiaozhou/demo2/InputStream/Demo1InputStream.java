package com.itxiaozhou.demo2.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo1InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IOAndProperties\\a.txt");
        /*int len = fis.read();
        System.out.println((char) len);

        len = fis.read();
        System.out.println((char) len);

        len = fis.read();
        System.out.println((char) len);

        len = fis.read();
        System.out.println( len);*/

        int len = 0;
        while ((len = fis.read())!=-1){
            System.out.print((char) len);
        }

        fis.close();
    }
}
