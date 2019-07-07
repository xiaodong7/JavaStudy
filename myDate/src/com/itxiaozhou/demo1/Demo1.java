package com.itxiaozhou.demo1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int i = c.get(Calendar.YEAR);
        System.out.println("i = " + i);

        int i1 = c.get(Calendar.MONTH) + 1;
        System.out.println("i1 = " + i1);

        int i2 = c.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println("i2 = " + i2);

        int i3 = c.get(Calendar.DATE);
        System.out.println("i3 = " + i3);





    }
}
