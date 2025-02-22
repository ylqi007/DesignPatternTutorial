package com.ylqi007.decorator.data;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("Milk");
        setPrice(1.5f);
    }
}