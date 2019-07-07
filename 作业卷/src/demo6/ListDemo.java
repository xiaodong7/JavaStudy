package demo6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*List 集合元素替换
        向 list 集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫,写入到"D:\\stuinfo.txt"*/
public class ListDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\stuinfo.txt");
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("二丫");
        list.add("钱六");
        list.add("孙七");
        list.set(list.indexOf("二丫"), "王小丫");
        //System.out.println(list);
        for (String s : list) {
            fw.write(s + "\r\n");
        }
        fw.close();
    }
}
