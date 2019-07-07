package com.itxiaozhou.demo1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("myOtherStream\\ps.txt");
        ps.write(97);
        ps.println();
        ps.println("97");
        ps.println("hello");
        ps.close();
    }
}
