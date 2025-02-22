package com.ylqi007.decorator.data;

public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDes("Soy");
        setPrice(1.5f);
    }
}
