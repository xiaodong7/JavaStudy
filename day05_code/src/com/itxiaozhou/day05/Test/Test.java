package com.itxiaozhou.day05.Test;

import java.util.Arrays;

/*已知一个数组A，将奇数位置元素存到B数组中，偶数元
        素存到C数组中。*/
public class Test {
    public static void main(String[] args) {
        int[] a = {1,2,4,4,56,63};
        int n = a.length/2;
        //if(a.length % 2 == 0){
            int[] b = new int[n];
            int[] c = new int[n];
            int x = 0;
            int y = 0;
            for (int i = 0; i < a.length; i+=2) {
                b[y]=a[i];
                y++;
            }
            for (int i = 1; i < a.length; i+=2) {
                c[x]=a[i];
                x++;
            }
            System.out.println("a数组奇数位置的元素："+Arrays.toString(b));
            System.out.println("a数组偶数位置的元素："+Arrays.toString(c));
        /*}else {
            int[] b = new int[n+1];
            int[] c = new int[n];
            int x = 0;
            int y = 0;
            for (int i = 0; i < a.length; i+=2) {
                b[y]=a[i];
                y++;
            }
            for (int i = 1; i < a.length; i+=2) {
                c[x]=a[i];
                x++;
            }
            System.out.println("a数组奇数位置的元素："+Arrays.toString(b));
            System.out.println("a数组偶数位置的元素："+Arrays.toString(c));
        }*/




    }


}
