package com.ylqi007.abstractfactory.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJPepperPizza");
        System.out.println("准备BJPepperPizza");
    }
}
