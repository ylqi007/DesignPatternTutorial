package com.atguigu.simplefactory.pizza;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备 PepperPizza ");
    }
}
