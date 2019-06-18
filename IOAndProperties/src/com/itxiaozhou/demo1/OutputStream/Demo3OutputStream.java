package com.itxiaozhou.demo1.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
* 续写:就是创建FileOutputStream对象的构造方法中的第二个参数
*      第二个参数为true时,就是续写
*      第二个参数为false时,就是不续写
*
* 换行写
*     在windows中是:\r\n
*     Linux中是:/n
*     mac中是:/r
*
*
* */
public class Demo3OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("IOAndProperties\\c.txt",true);
        for (int i = 1; i <= 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }
}
