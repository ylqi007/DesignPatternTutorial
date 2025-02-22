package com.ylqi007.abstractfactory.order;

import com.ylqi007.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbstractFactory factory;

    // 可以决定需要BJFactory or LDFactory
    // 如果是BJFactory，就负责生产BJCheesePizza和BJPepperPizza
    // 如果是LDFactory，就负责生产LDCheesePizza和LDPepperPizza
    public OrderPizza(AbstractFactory factory) {
        this.factory = factory;
    }

    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }

    public void createPizza() {
        Pizza pizza = null;
        do {
            String orderType = getPizzaType();
            pizza = factory.createPizza(orderType);
            if(pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }

    // 写一个method，可以获取客户希望订购的Pizza种类
    public String getPizzaType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input pizza type: ");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
