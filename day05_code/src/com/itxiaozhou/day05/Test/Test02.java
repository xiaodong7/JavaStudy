package com.itxiaozhou.day05.Test;

import java.util.ArrayList;
import java.util.Arrays;

/*
int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        要求将以上数组中的0项去掉，将不为0的值存入一个新
        的数组，生成新的数组为
        int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5};
*/
public class Test02 {
    /*public static void main(String[] args) {
        int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int num = 0 ;
        ArrayList<Integer> list = new ArrayList<>();
         for (int i = 0; i < oldArr.length; i++) {
            if(oldArr[i] != 0){
                num++;
            }
        }
        int[] newArr = new int[num];
        int j = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if(oldArr[i] != 0){
                newArr[j]=oldArr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }*/
    public static void main(String[] args) {
        int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        for (int i = 0; i < oldArr.length; i++) {
            if(oldArr[i] == 0){
                continue;
            }else{
                int[] newArr = oldArr;
                System.out.println(newArr[i]);
            }
        }
    }
}
