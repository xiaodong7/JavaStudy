package com.itxiaozhou.Reflect;

import com.itxiaozhou.domain.Person;
import java.lang.reflect.Field;


public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        //获取Person的class对象
        Class<Person> personClass = Person.class;
        //Field[] getFields() ：获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("-------------------------------------");
        Field a = personClass.getField("a");//获取指定的public修饰的成员变量
        System.out.println(a);

        //获取成员变量a的值
        Person p = new Person();
        Object o = a.get(p);
        System.out.println(o);

        //设置对象的成员变量a的值
        a.set(p,"小周");
        System.out.println(p);

        System.out.println("==============================");

        Field[] declaredFields = personClass.getDeclaredFields();//获取所有的成员变量
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        System.out.println("================================");
        Field d = personClass.getDeclaredField("d");
        //忽略访问修饰符的安全检查
        d.setAccessible(true);//暴力反射
        Object o1 = d.get(p);
        System.out.println(o1);
        d.set(p,"程序员");
        System.out.println(p);
    }
}
