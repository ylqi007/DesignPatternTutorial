package com.atguigu.simplefactory.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备 GreekPizza");
    }
}
