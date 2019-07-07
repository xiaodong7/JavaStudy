package com.itxiaozhou.practice.copy_dir_file;

import java.io.*;


/*
* 复制单级文件夹的文件
* */
public class Demo {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("D:\\itcast");
        String srcFolderName = srcFolder.getName();
        File destFolder = new File("IOAndProperties\\dir", srcFolderName);
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }
        for (File srcFile : srcFolder.listFiles()) {
            String srcFileName = srcFile.getName();
            File destFile = new File(destFolder, srcFileName);
            copyfile(srcFile,destFile);
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
