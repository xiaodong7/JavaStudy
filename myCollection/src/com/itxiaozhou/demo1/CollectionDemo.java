package com.itxiaozhou.demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("古力娜扎");
        c.add("马尔扎哈");
        c.add("真皮沙发");
        Iterator<String> iter = c.iterator();
        while (iter.hasNext()) {
            String next = iter.next();
            System.out.println(next);
        }
    }
}
