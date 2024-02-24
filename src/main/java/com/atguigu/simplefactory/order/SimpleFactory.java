package com.atguigu.simplefactory.order;

import com.atguigu.simplefactory.pizza.CheesePizza;
import com.atguigu.simplefactory.pizza.GreekPizza;
import com.atguigu.simplefactory.pizza.PepperPizza;
import com.atguigu.simplefactory.pizza.Pizza;

// 简单工厂类：负责生产不同类型的Pizza
public class SimpleFactory {
    public Pizza createPizza(String orderType) {
        System.out.println("使用SimpleFactory模式 createPizza()");
        Pizza pizza = null;
        if("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("GreekPizza");
        } else if(orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("CheesePizza");
        } else if(orderType.equals("pepper")) { // 新增一个Pizza种类时，不需要修改OrderPizza类
            pizza = new PepperPizza();
            pizza.setName("胡椒Pizza");
        }
        return pizza;
    }

    // 简单工厂模式，也就静态工厂模式 --> 调用会更方便，直接通过类调用
    public static Pizza createPizza2(String orderType) {
        System.out.println("使用SimpleFactory模式(静态) createPizza()");
        Pizza pizza = null;
        if("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("GreekPizza");
        } else if(orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("CheesePizza");
        } else if(orderType.equals("pepper")) { // 新增一个Pizza种类时，不需要修改OrderPizza类
            pizza = new PepperPizza();
            pizza.setName("胡椒Pizza");
        }
        return pizza;
    }
}
