package com.ylqi007.factorymethod.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("准备BJCheesePizza");
    }
}
