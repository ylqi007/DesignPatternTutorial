package com.ylqi007.abstractfactory.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("LDCheesePizza");
        System.out.println("准备LDCheesePizza");
    }
}
