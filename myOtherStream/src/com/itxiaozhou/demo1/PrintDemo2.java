package com.itxiaozhou.demo1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintDemo2 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("myOtherStream\\pw.txt"));
        pw.println("黑马程序员");
        pw.close();
    }
}
