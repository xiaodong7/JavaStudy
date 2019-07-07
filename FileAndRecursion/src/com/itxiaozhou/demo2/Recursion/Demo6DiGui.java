package com.itxiaozhou.demo2.Recursion;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Demo6DiGui {
    public static void main(String[] args) {
        //准备数据
        File mFile = new File("FileAndRecursion");
        List<File> fileList = new ArrayList<>();
        List<File> dirList = new ArrayList<>();
        diGui(mFile, fileList, dirList);
        //遍历集合
        for (File f : fileList) {
            System.out.println(f);
        }

    }

    private static void diGui(File mFile, List<File> fileList, List<File> dirList) {
        if (mFile.isFile()) {
            fileList.add(mFile);
        }
        if (mFile.isDirectory()) {
            dirList.add(mFile);

            File[] files = mFile.listFiles();
            if (files != null) {
                for (File f : files) {
                    diGui(f, fileList, dirList);
                }
            }
        }

    }
}
