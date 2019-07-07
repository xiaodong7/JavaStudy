package com.itxiaozhou;

import java.text.ParseException;
import java.util.Date;

public class DateUtilsDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        String s = DateUitls.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s);


        String s1 = "2019-02-25 14:23:34";
        Date dd= DateUitls.stringToDate(s1, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);

    }
}
