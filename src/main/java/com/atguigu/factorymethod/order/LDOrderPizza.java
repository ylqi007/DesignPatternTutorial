package com.atguigu.factorymethod.order;

import com.atguigu.factorymethod.pizza.LDCheesePizza;
import com.atguigu.factorymethod.pizza.LDPepperPizza;
import com.atguigu.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if(orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
