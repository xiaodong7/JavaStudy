package com.itxiaozhou.demo;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        Set<String> s = new HashSet<>();
        s.add("重地");
        s.add("通话");
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
