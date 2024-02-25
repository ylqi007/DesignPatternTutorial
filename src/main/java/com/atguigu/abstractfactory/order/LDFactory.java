package com.atguigu.abstractfactory.order;

import com.atguigu.abstractfactory.pizza.LDCheesePizza;
import com.atguigu.abstractfactory.pizza.LDPepperPizza;
import com.atguigu.abstractfactory.pizza.Pizza;

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
