package com.atguigu.decorator.data;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("Milk");
        setPrice(1.5f);
    }
}