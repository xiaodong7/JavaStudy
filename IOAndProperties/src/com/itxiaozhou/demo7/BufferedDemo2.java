package com.itxiaozhou.demo7;

import java.io.*;

public class BufferedDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IOAndProperties\\e.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("IOAndProperties\\目标文件1.txt"));
        String line;
        
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }


        bw.close();
        br.close();
    }
}
