package com.ylqi007.simplefactory.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备 CheesePizza");
    }
}
