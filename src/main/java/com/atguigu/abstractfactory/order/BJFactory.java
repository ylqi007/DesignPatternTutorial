package com.atguigu.abstractfactory.order;

import com.atguigu.abstractfactory.pizza.BJCheesePizza;
import com.atguigu.abstractfactory.pizza.BJPepperPizza;
import com.atguigu.abstractfactory.pizza.Pizza;

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
