package com.itxiaozhou.practice.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IOAndProperties\\dir\\student.txt"));
        ArrayList<Student> arr = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            String[] str = line.split(",");
            Student s = new Student();
            s.setId(Integer.parseInt(str[0]));
            s.setName(str[1]);
            s.setAge(Integer.parseInt(str[2]));
            s.setDizhi(str[3]);

            arr.add(s);
        }

        br.close();

        for (Student ss : arr) {
            System.out.println(ss.getId() + "," + ss.getName() + "," + ss.getAge() + "," + ss.getDizhi());
        }
    }
}
