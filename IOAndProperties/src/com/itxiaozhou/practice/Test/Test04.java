package com.itxiaozhou.practice.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * 点名器
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IOAndProperties\\dir\\names.txt"));
        ArrayList<String> arr = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            arr.add(line);
        }
        br.close();
        Random r = new Random();
        int index = r.nextInt(arr.size());
        String name = arr.get(index);
        System.out.println("幸运者是: "+name);
    }
}
