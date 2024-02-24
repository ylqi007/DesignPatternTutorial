package com.atguigu.factory.order;

// 相当于一个客户端，发出订购
public class PizzaStore {
    public static void main(String[] args) {
        //
        // new OrderPizza();

        // 使用简单工厂模式
        //OrderPizza1 orderPizza1 = new OrderPizza1(new SimpleFactory());
        //orderPizza1.getPizza();

        // 使用简单(静态)工厂模式
        OrderPizza2 orderPizza2 = new OrderPizza2();
        orderPizza2.getPizza();
    }
}