package com.itxiaozhou.demo5;

import java.util.Iterator;

public class NiuBeaLinkedListDemo {
    public static void main(String[] args) {
        NiuBeaLinkedList nbll = new NiuBeaLinkedList();
        nbll.add("A");
        nbll.add("B");
        nbll.add("C");
        nbll.add("D");
        Iterator it = nbll.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
        Object a = nbll.updateFirst("a");
        System.out.println("a = " + a);

        System.out.println("-------[华丽的分割线]--------");

        for (int i = 0; i < nbll.size(); i++) {
            Object o = nbll.get(i);
            System.out.println(o);
        }

        System.out.println("-------[华丽的分割线]--------");

        Object d = nbll.updateLast("d");
        System.out.println("d = " + d);

        for (Object o : nbll) {
            System.out.println(o);
        }


    }
}
