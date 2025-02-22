package com.ylqi007.abstractfactory.order;

import com.ylqi007.abstractfactory.pizza.BJCheesePizza;
import com.ylqi007.abstractfactory.pizza.BJPepperPizza;
import com.ylqi007.abstractfactory.pizza.Pizza;

public class BJFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("====== 使用抽象工厂模式 ========");
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if(orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
