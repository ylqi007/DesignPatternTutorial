package com.atguigu.decorator.data;

public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        // super.getPrice() --> 拿到Decorator自己的价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + " + " + drink.getDes();
    }
}
