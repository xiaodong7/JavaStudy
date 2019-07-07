package com.itxiaozhou.demo4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ProStreamDemo {
    public static void main(String[] args) throws IOException {
        //cun();
        qu();
    }

    private static void qu() throws IOException {
        Properties p = new Properties();
        p.load(new FileReader("myOtherStream\\pro文件.properties"));
        for (String key : p.stringPropertyNames()) {
            System.out.println(key + "=" + p.getProperty(key));
        }
    }

    private static void cun() throws IOException {
        Properties p = new Properties();
        p.setProperty("001", "小周");
        p.setProperty("002", "小六");
        p.setProperty("003", "小二");
        p.store(new FileWriter("myOtherStream\\pro文件.properties"), "配置文件");
    }
}
