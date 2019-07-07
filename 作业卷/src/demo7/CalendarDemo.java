package demo7;

import java.util.Scanner;
/**
 *     ***********************万年历*****************************
 请输入年份
 1997
 请输入月份
 4
 周日 周一 周二 周三 周四 周五 周六
           1   2    3   4   5
  6    7   8   9   10   11	12
  13   14  15  16  17	18	19
  20   21  22  23  24	25	26
  27   28  29  30

 1900.1.1~~1997,3.31总天数

 (总天数+1)%7==？1997,4前面空格数。


 1900<=year<=1996::年的总天数

 1~~3月的总天数
 年的总天数+月的总天数==总天数

 还要将录入月份天数算出来。用来显示的

 换行：（总天数+当月的每一天）%7==6

 */
public class CalendarDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        //录入年份变量
        int year = input.nextInt();

        System.out.println("请输入月份：");
        //录入月份变量
        int mon = input.nextInt();

        //总天数变量
        int allDays = 0;

        //一个月天数变量
        int days = 0;


        //年份的总天数
        for (int i = 1900; i < year; i++) {
            //判断每一个年是否是闰年
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
                allDays += 366;
            else
                allDays += 365;
        }


        //月份的总天数
        for (int i = 1; i <= mon; i++) {
            //计算每个月的天数，然后存放到days变量中。
            //days只记录一个月的天数
            //days最后记录的是录入月份的天数
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                        days = 29;
                    else
                        days = 28;
                    break;
            }
            if (i < mon)
                allDays += days;
        }

        //计算空格数
        int temp = (allDays + 1) % 7;

        //格式输出
        System.out.println("周日\t周一\t周二\t周三\t周四\t周五\t周六");
        //空格输出
        for (int i = 1; i <= temp; i++) {
            System.out.print("\t");
        }

        //输出录入月份每一天
        for (int i = 1; i <= days; i++) {
            System.out.print(i + "\t");
            //判断换行
            if ((allDays + i) % 7 == 6)
                System.out.println();
        }
    }
}
