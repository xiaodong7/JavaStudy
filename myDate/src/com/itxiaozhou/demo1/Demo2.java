package com.itxiaozhou.demo1;

import java.util.Calendar;

public class Demo2 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(1998,9-1,14);
        int i = c.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("生日当天星期"+i);
    }

}
