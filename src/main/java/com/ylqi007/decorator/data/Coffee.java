package com.ylqi007.decorator.data;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
