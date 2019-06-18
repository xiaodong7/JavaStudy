package com.itxiaozhou.Thread.demo5.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1Person {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("张三丰", 70),
                new Person("张无忌", 18),
                new Person("殷梨亭", 30),

        };

        //使用匿名内部类的方式 对数组中的对象用年龄升序进行排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        //使用lambda表达式
        Arrays.sort(arr, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        //lambda表达式省略写法
        Arrays.sort(arr,(o1,o2)->o1.getAge()-o2.getAge());

        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
