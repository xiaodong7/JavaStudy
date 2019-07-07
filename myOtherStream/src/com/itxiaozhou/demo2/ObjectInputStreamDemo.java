package com.itxiaozhou.demo2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myOtherStream\\oos.txt"));
        Object o = ois.readObject();
        Student s = (Student)o;
        System.out.println(s);
        ois.close();
    }
}
