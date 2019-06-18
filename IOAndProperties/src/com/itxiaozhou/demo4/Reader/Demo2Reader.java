package com.itxiaozhou.demo4.Reader;

import java.io.FileReader;
import java.io.IOException;

/*
* FileReader的使用
* */
public class Demo2Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("IOAndProperties\\d.txt");
        /*int len ;
        //定义装字符的容器 char数组
        char[] chars = new char[2];
        while((len = fr.read(chars))!= -1){
            System.out.println(new String(chars));
        }*/
        //定义有效长度
        int len;
        char[] chars = new char[2];
        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }
        //关闭资源
        fr.close();
    }
}
