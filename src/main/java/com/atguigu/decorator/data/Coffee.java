package com.atguigu.decorator.data;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
