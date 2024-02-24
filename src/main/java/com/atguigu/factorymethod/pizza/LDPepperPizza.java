package com.atguigu.factorymethod.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("LDPepperPizza");
        System.out.println("准备LDPepperPizza");
    }
}