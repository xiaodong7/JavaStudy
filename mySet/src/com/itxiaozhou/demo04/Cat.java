package com.itxiaozhou.demo04;

public class Cat<K> {
    private K mao;

    public K getMao() {
        return mao;
    }

    public void setMao(K mao) {
        this.mao = mao;
        System.out.println(this.mao.getClass());
    }
}
