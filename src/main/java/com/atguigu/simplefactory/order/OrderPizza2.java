package com.atguigu.simplefactory.order;

import com.atguigu.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza2 {

    Pizza pizza = null;

    public OrderPizza2() {}

    public Pizza getPizza() {
        do {
            String orderType = getPizzaType();
            pizza = SimpleFactory.createPizza2(orderType);
            if(pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购Pizza失败");
                break;
            }
        } while (true);
        return pizza;
    }

    // 获取客户希望订购的Pizza种类
    private String getPizzaType() {
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
