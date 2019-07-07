package com.itxiaozhou;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*并发修改异常  在迭代器中使用remove add 方法,会发生并发修改异常*/
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> mList = new ArrayList<>();
        mList.add("张无忌");
        mList.add("东方不败");
        mList.add("武则天");
        mList.add("张三丰");
        Iterator<String> it = mList.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if(s.length()>=3){
                mList.remove(s);
            }
        }
        System.out.println("mList = " + mList);
    }
}
