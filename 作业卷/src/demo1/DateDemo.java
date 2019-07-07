package demo1;

import java.text.SimpleDateFormat;
import java.util.Date;

/*请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如
        2088-08-08 08:08:08。*/
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(date);
        System.out.println(s);

    }
}
