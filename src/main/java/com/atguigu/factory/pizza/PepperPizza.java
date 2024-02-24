package com.atguigu.factory.pizza;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备 PepperPizza ");
    }
}
