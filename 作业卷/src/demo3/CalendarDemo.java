package demo3;

import java.util.Calendar;
/*用程序判断 2018 年 2 月 14 日是星期几*/
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2018,2-1,14);
        int i = c.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println(i);
    }
}
