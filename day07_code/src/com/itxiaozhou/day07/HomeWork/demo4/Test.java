package com.itxiaozhou.day07.HomeWork.demo4;


import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.ArrayList;
import java.util.Random;

/*  题目:
        1.定义一个集合 ArrayList,用于保存随机数数据,只保存 10个随机数.
        2.产生随机数,要求范围是三位数.包括100不包括1000  [100,1000)
        3.判断当前的数据当中是否存在 3的倍数,如果出现3的倍数就删除改元素.
        4.循环遍历,最后剩余的元素数据

        分析:
        产生随机数的保存在集合当中的数据如下:
        原始数据:  [355,333,369,467,784,142,770,561,453,921]
        如果是 3 的倍数需要删除,删除之后,结果显示如下:
        删除之后:  [355,467,784,142,770]

        TIP提示:
        (1)每一小问,最好独立完成,不要在一个for循环当中操作所有业务逻辑,否则代码逻辑性太强,分步骤完成代码
        (2)保存10个数据需要使用循环操作,在循环的过程当中把数据保存在集合  add(数据)
        (3)随机数的范围在 包括100不包括1000 这里应该如何书写?
        (4)一个数据是 3 的倍数,那么应该满足什么条件?  取余的结果是0
        (5)删除集合元素的操作  remove(索引);  或者 remove(元素);

        删除的操作:
        方式1:
        在循环当中,删除的操作,集合的长度会发生改变,每次删除1次,循环次数就会减少1次.
        因此: 删除的过程当中,需要自减一下,循环的次数
        方式2:
        可以重新定义一个新的集合 ArrayList... newArray = new ArrayList...();
        把满足要求的数据放入到新集合当中,然后将新的集合地址直接赋值给旧的集合地址
        例如:  oldArray = newArray;
*/
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int x = r.nextInt(900)+100;
            list.add(x);
        }
        //method1(list);
        method2(list);

    }

    private static void method2(ArrayList<Integer> list) {
        System.out.println(list);
        System.out.println("====================================");
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%3!=0){
                newArray.add(list.get(i));
            }
        }
         list =newArray;
        System.out.println(list);
    }

    private static void method1(ArrayList<Integer> list) {

        System.out.println(list);
        System.out.println("====================================");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%3==0){
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println(list);
    }
}
