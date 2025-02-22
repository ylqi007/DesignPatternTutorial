package com.ylqi007.simplefactory.order;

import com.ylqi007.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza1 {
    // 定义一个简单工厂
    private SimpleFactory simpleFactory;

    // 构造器
    public OrderPizza1(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public Pizza getPizza() {
        Pizza pizza = null;
        do {
            String orderType = getPizzaType();
            pizza = this.simpleFactory.createPizza(orderType);
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
