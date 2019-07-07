package demo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*使用 SimpleDateFormat 类,把 2018-03-04 转换为 2018 年 03 月 04 日*/
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        String s = "2018-03-04";
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy 年 MM 月 dd 日");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(s);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy 年 MM 月 dd 日");
        String ss = sdf2.format(date);
        System.out.println(ss);


    }
}
