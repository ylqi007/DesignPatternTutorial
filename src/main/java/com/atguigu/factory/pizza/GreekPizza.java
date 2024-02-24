package com.atguigu.factory.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备 GreekPizza");
    }
}
