package com.ylqi007.abstractfactory.order;


public class PizzaStore {
    public static void main(String[] args) {
        // 生成OrderPizza实例时，可以决定使用BJFactory还是LDFactory
        OrderPizza orderPizza = new OrderPizza(new BJFactory());
        orderPizza.createPizza();
    }
}
