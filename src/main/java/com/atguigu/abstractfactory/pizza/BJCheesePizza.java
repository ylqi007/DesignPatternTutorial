package com.atguigu.abstractfactory.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("准备BJCheesePizza");
    }
}
