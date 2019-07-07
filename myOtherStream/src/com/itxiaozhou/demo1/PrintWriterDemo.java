package com.itxiaozhou.demo1;

import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myOtherStream\\pw.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("myOtherStream\\复制文件.txt"),true);
        String line;
        while ((line = br.readLine()) != null) {
            pw.println(line);
        }
        pw.close();
        br.close();
    }
}
