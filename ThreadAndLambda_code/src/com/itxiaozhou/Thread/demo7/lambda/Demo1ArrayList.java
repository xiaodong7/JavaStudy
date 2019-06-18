package com.itxiaozhou.Thread.demo7.lambda;
/**
 * lamdba表达式可推导,可省略
 * 凡是根据上下文推导的内容,都可以省略书写
 * 可以省略的内容:
 *      1.(参数列表):括号中的参数的数据类型可以省略不写
 *      2.(参数列表):括号中的参数如果只有一个,那么类型和()都可以省略
 *      3.{一些代码}:如果{}中代码只有一行,无论是否有返回值,都可以省略({},return,分号)
 *            注意:要省略{},return,分号,必须一起省略
 *
 */
import java.util.ArrayList;

public class Demo1ArrayList {

    public static void main(String[] args) {
        //jdk1.7之前,创建集合中对象必须把前后的泛型加上
        ArrayList<String> list01 = new ArrayList<String>();

        //jdk1.7之后,=号后面的泛型就可以省略,后面的泛型可以根据前面的泛型推导出来
        ArrayList<String> list02 = new ArrayList<>();
    }
}
