package com.itxiaozhou.demo1.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo2OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("IOAndProperties\\b.txt"));
        fos.write(49);
        fos.write(48);
        fos.write(48);

        byte [] bytes = {65,66,67,68,69};//ABCDE
        //byte [] bytes = {-65,-66,-67,68,69};//烤紻E
        fos.write(bytes);

        fos.write(bytes,1,2);

        /*
        * 写入字符的方法:可以string类中的方法把字符串转化为字节数组
        * byte[] getBytes
        * */
        byte[] bytes1 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes1));

        fos.write(bytes1);//[-28, -67, -96, -27, -91, -67]

        fos.close();
    }
}
