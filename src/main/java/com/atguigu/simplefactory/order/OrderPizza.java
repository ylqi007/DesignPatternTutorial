package com.atguigu.simplefactory.order;

import com.atguigu.simplefactory.pizza.CheesePizza;
import com.atguigu.simplefactory.pizza.GreekPizza;
import com.atguigu.simplefactory.pizza.PepperPizza;
import com.atguigu.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;   // 订购的Pizza类型
        do {
            orderType = getPizzaType();
            if("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName("GreekPizza");
            } else if(orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("CheesePizza");
            } else if(orderType.equals("pepper")) { // 新增一个Pizza种类时，需要修改OrderPizza类
                pizza = new PepperPizza();
                pizza.setName("胡椒Pizza");
            } else {
                break;
            }

            //输出Pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
