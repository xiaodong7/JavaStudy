package com.itxiaozhou.demo2.Recursion;

/*
*   使用递归求1~n的和
*   分析:1+2+3+...+n    ==>   n+(n-1)+...+1
*        最大值:n
*        最小值:1
*    使用递归要明确:
*          递归结束方法的条件  :获取到1的时候结束方法
*          递归的目的:获取下一个被加的数字(n-1)
*
* */
public class Demo2DiGui {
    public static void main(String[] args) {
        int num = 5;
        int sum = sum(num);
        System.out.println(sum);
    }

    private static int sum(int num) {
        if(num ==1 ){
            return 1;
        }
        return num + sum(num-1);
    }
}
