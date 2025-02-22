package com.ylqi007.factorymethod.order;

import com.ylqi007.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    // 定义一个抽象方法，createPizza，让工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    public Pizza getPizza() {
        Pizza pizza = null;
        do {
            String orderType = getPizzaType();
            pizza = createPizza(orderType); // 抽象方法，由子类工厂完成
            if(pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                break;
            }
        } while (true);
        return pizza;
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
