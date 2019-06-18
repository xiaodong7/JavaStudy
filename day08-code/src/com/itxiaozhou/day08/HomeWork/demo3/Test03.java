package com.itxiaozhou.day08.HomeWork.demo3;
/*
题目:
        (1) 定义一个字符串"123,456,789"
        (2) 定义一个方法，将该字符串传入，返回一个字符串"789,456,123"
        (3) 将返回的字符串打印到控制台上

        提示TIP:
        a. 分割方法,可以将字符串分割成为一个字符的数组 public String[] split(String regex)
        b. 倒着遍历数组的操作. 例如: 数组名称是 array 那么快捷键  array.forr 回车
        c. 将遍历的字符串,重新拼接在一起. 可以使用如下两种方式
        方式1: 采用 + 进行拼接操作,组合在一起 ,例如: ""+'A'+'b'+'3'
        方式2: public String concat(String s)  //采用 concat()方法,将字符串重组在一起作为新的字符串
*/
public class Test03 {
    public static void main(String[] args) {
        String s = "123,456,789";
        System.out.println(method(s));
    }

    private static String method(String s) {
        String[] split = s.split(",");
        String s1 = "";
        for (int i = split.length - 1; i >= 0; i--) {
            if(i==0){
                s1 += split[i];
            }else{
                s1 += (split[i]+",");
            }
        }
        return s1;


    }
}
