package com.ylqi007.abstractfactory.order;

import com.ylqi007.abstractfactory.pizza.LDCheesePizza;
import com.ylqi007.abstractfactory.pizza.LDPepperPizza;
import com.ylqi007.abstractfactory.pizza.Pizza;

public class LDFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("====== 使用抽象工厂模式 ========");
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if(orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
