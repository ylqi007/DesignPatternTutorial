package com.ylqi007.decorator.data;

// 具体的修饰，即调味品
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDes("Chocolate");
        setPrice(3.0f);
    }
}
