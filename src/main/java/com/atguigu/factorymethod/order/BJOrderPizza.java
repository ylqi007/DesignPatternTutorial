package com.atguigu.factorymethod.order;

import com.atguigu.factorymethod.pizza.BJCheesePizza;
import com.atguigu.factorymethod.pizza.BJPepperPizza;
import com.atguigu.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if(orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
