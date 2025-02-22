package com.ylqi007.factorymethod.order;

public class PizzaStore {
    public static void main(String[] args) {
        String loc = "Bj";  // 通过输入函数可以调整地区，or配置realm参数
        if(loc.equals("BJ")) {
            // 创建北京口味的各种Pizza
            BJOrderPizza bjOrderPizza = new BJOrderPizza();
            bjOrderPizza.getPizza();
        } else if(loc.equals("LD")) {
            LDOrderPizza ldOrderPizza = new LDOrderPizza();
            ldOrderPizza.getPizza();
        }
    }
}