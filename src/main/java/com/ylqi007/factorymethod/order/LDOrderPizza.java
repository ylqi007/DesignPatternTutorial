package com.ylqi007.factorymethod.order;

import com.ylqi007.factorymethod.pizza.LDCheesePizza;
import com.ylqi007.factorymethod.pizza.LDPepperPizza;
import com.ylqi007.factorymethod.pizza.Pizza;

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
