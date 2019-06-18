package com.itxiaozhou.day05.test01;


/*定义一个int型的一维数组，包含10个元素，
        然后求出所有元素的最大值，最小值，平均值，和值，并输出出来。
        int[] arr={10,11,20,31,99,70,20,11,53,28};*/
public class Test01 {
    public static void main(String[] args) {
        int[] arr={10,11,20,31,99,70,20,11,53,28};
        max(arr);
        min(arr);
        avgAndSum(arr);

    }
    public static void max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("数组的最大值为："+max);
    }
    public static void min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("数组的最小值为："+min);
    }
    public static void avgAndSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        System.out.println("数组的和为："+sum);
        double avg = (double) sum / arr.length;
        System.out.println("数组的平均值为："+avg);
    }
}
