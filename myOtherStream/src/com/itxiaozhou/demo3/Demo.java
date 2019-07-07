package com.itxiaozhou.demo3;


import java.io.*;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //writeData();
        readData();
    }

    private static void readData() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myOtherStream\\student.txt"));
        Object o = ois.readObject();
        ArrayList<Student> list = (ArrayList<Student>) o;
        for (Student student : list) {
            System.out.println(student);
        }
        ois.close();

    }

    private static void writeData() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myOtherStream\\student.txt"));
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张无忌",15,"男"));
        list.add(new Student("东方不败",25,"男"));
        list.add(new Student("令狐冲",24,"男"));
        list.add(new Student("西门吹雪",35,"男"));
        oos.writeObject(list);
        oos.close();
    }
}
