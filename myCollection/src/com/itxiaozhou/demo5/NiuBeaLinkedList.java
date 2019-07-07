package com.itxiaozhou.demo5;

import java.util.LinkedList;

public class NiuBeaLinkedList extends LinkedList {
    //修改头
    public Object updateFirst(Object o){
        //删除
        Object tou = this.removeFirst();
        //添加
        this.addFirst(o);
        return tou;
    }
    //修改尾
    public Object updateLast(Object o){
        //删除
        Object wei = this.removeLast();
        //添加
        this.addLast(o);
        return wei;
    }
}
