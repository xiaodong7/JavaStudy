package com.itxiaozhou.Thread.demo6.lambda;

public class Demo1Calc {
    public static void main(String[] args) {

        //匿名内部类的形式
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        //lambda表达式
        invokeCalc(20,50,(int a,int b)->{
            return a+b;
        });

        //lamdba表达式省略写法
        invokeCalc(120,130,(a,b)->a+b);
    }

    public static void invokeCalc(int a,int b,Calculator calc){
        int result = calc.calc(a, b);
        System.out.println(result);
    }
}

