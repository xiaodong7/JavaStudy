package com.itxiaozhou.day05.test01;
/*写一个程序来判断一个数是否为质数*/
public class Test05 {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
    private static boolean isPrime(int n) {
        boolean flag = true; // flag:返回值默认true,表示是质数
        if (n == 1)
            flag = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i== 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
