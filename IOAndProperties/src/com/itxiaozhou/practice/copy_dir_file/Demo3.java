package com.itxiaozhou.practice.copy_dir_file;

import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        String src = "C:\\Users\\acer\\Desktop\\嘻嘻.txt";
        String dest = "IOAndProperties\\dir\\哈哈.txt";

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(src), "GBK"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dest)));

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
