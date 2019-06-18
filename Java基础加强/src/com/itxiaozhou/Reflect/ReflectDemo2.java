package com.itxiaozhou.Reflect;

import com.itxiaozhou.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        //获取Person的class对象
        Class<Person> personClass = Person.class;

        Constructor<?>[] constructors = personClass.getConstructors();//获取构造方法集合
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        Constructor<Person> constructor = personClass.getConstructor(String.class,int.class);//获取指定的构造方法
        //创建对象:newInstance方法
        Person p = constructor.newInstance("小周", 22);
        System.out.println(p);

        System.out.println("----------------");

        //无参构造方法创建对象
        Constructor<Person> constructor1 = personClass.getConstructor();//获取指定的构造方法
        Person p1 = constructor1.newInstance();
        System.out.println(p1);

        //无参构造方法创建对象的简化
        Person person = personClass.newInstance();
        System.out.println(person);

    }
}
