package com.itxiaozhou.demo8.propertiesDemo;

import java.util.Properties;

public class Demo {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.put("001", "关羽");
        p.put("002", "张飞");
        p.put("003", "刘备");
        for (String key : p.stringPropertyNames()) {
            System.out.println(key + "," + p.getProperty(key));
        }
    }
}
