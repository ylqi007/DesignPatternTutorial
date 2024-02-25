package com.atguigu.abstractfactory.order;

import com.atguigu.abstractfactory.pizza.Pizza;

// 抽象工厂模式的抽象层(接口)
public interface AbstractFactory {

    // 让具体的工厂子类负责具体实现
    Pizza createPizza(String orderType);
}
