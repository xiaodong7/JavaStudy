package com.itxiaozhou.demo1.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1OutputStream {
    public static void main(String[] args) throws IOException {
        //创建FileOutputStream对象,构造方法中传入写入数据的的目的地
        FileOutputStream fos = new FileOutputStream("IOAndProperties\\a.txt");
        //调用write方法写入数据
        fos.write(97);
        //释放资源
        fos.close();
    }
}
