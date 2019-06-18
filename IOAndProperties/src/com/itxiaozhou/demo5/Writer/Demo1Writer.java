package com.itxiaozhou.demo5.Writer;
/*
* FileWriter 的使用
* 往文件中写数据   字符为单位的
*     从内存到硬盘
*
*
*     注意:
*     未调用close方法，数据只是保存到了缓冲区，并未写出到文件中。

 * */
import java.io.FileWriter;
import java.io.IOException;

public class Demo1Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("IOAndProperties\\e.txt");
        fw.write(97);//写出第一个数据
        fw.write('b');
        fw.write('c');
        fw.write(30000);
        /*关闭资源

        注意 : 关闭资源与FileOutputStream不同

        如果不关闭,就是保存到缓存区,并未保存文件
        */
        fw.close();
    }
}
