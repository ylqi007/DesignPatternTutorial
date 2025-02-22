package com.ylqi007.factorymethod.order;

import com.ylqi007.factorymethod.pizza.BJCheesePizza;
import com.ylqi007.factorymethod.pizza.BJPepperPizza;
import com.ylqi007.factorymethod.pizza.Pizza;

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
