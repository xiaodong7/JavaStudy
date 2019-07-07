package com.itxiaozhou.practice.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IOAndProperties\\dir\\array.txt"));
        ArrayList<String> arr = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            arr.add(line);
        }
        br.close();
        for (String s : arr) {
            System.out.println(s);
        }

    }
}
