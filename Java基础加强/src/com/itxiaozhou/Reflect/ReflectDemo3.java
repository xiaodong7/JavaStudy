package com.itxiaozhou.Reflect;

import com.itxiaozhou.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        //获取Person的class对象
        Class<Person> personClass = Person.class;

        Method[] methods = personClass.getMethods();//获取public修饰的方法数组
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();//获取方法名(***这个后期会用到***)
            System.out.println(name);
        }

        System.out.println("===============================");
        Method method = personClass.getMethod("eat");//获取指定名称的成员方法
        method.invoke(new Person());//执行方法
        System.out.println(method);

        System.out.println("----------------");
        Method eat = personClass.getMethod("eat",String.class);
        eat.invoke(new Person(), "吃饭");//执行方法

        System.out.println("================================");

        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        System.out.println("==============================");
        Method getName = personClass.getDeclaredMethod("getName");
        System.out.println(getName);


        System.out.println("===========================");
        //获取类名
        String className = personClass.getName();
        System.out.println(className);//全类名

    }
}
