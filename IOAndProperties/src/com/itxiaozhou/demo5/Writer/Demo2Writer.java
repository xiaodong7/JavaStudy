package com.itxiaozhou.demo5.Writer;

/*
* flush()方法的使用
*
* 小demo 注意这个flush与close的区别
* */
import java.io.FileWriter;
import java.io.IOException;

public class Demo2Writer {
    public static void main(String[] args) throws IOException {
        //show01();
        //show02();
        show03();
    }

    /*
    * 换行和续写
    * */
    private static void show03() throws IOException {
        FileWriter fw = new FileWriter("IOAndProperties\\e.txt", true);
        fw.write("我来到了黑马程序员\n");
        fw.write("就要摆正心态\n");
        fw.write("既然选择了,就要选择相信它\n");
        fw.write("不要抱怨了\n");
        fw.close();


    }

    /*
    * 写入char数组   建议是直接使用字符串更方便:直接写入字符串
    * */
    private static void show02() throws IOException {
        FileWriter fw = new FileWriter("IOAndProperties\\e.txt");
        /*char[] chars = "黑马程序员".toCharArray();

        //fw.write(chars);
        fw.write(chars,0,2);*/
        String str = "黑马程序员";
        fw.write(str,2,3);
        fw.close();
    }

    /*
    * flush的使用:刷新缓冲区
    * */
    private static void show01() throws IOException {
        FileWriter fw = new FileWriter("IOAndProperties\\e.txt");
        fw.write('刷');
        fw.flush();//刷新缓冲区
        fw.write('新');
        fw.flush();
        fw.close();
    }


}
