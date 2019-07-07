package com.itxiaozhou.practice.copy_dir_file;

import java.io.*;

/**
 * 复制多级文件夹
 */
@SuppressWarnings("all")
public class Demo2 {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("D:\\itcast");
        File destFile = new File("C:\\");
        copyFolder(srcFile,destFile);
    }

    private static void copyFolder(File srcFile, File destFile) throws IOException {
        if (srcFile.isDirectory()) {
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName);

            if(!newFolder.exists()){
                newFolder.mkdir();
            }
            for (File file : srcFile.listFiles()) {
                copyFolder(file,newFolder);
            }
        }else{
            File newFile = new File(destFile, srcFile.getName());
            copyfile(srcFile,newFile);
        }
    }

    private static void copyfile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte [] arr = new byte[1024];
        int len;
        while ((len = bis.read(arr)) != -1) {
            bos.write(arr,0,len);
        }
        bos.close();
        bis.close();
    }
}
