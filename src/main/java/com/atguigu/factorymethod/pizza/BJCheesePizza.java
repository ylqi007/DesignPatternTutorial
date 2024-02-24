package com.atguigu.factorymethod.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("准备BJCheesePizza");
    }
}
