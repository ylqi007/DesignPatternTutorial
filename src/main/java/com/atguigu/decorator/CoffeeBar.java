package com.atguigu.decorator;

import com.atguigu.Main;
import com.atguigu.decorator.data.Chocolate;
import com.atguigu.decorator.data.Drink;
import com.atguigu.decorator.data.LongBlack;
import com.atguigu.decorator.data.Milk;
import com.atguigu.decorator.data.Soy;

public class CoffeeBar {
    public static void main(String[] args) {
        // 1. 点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("描述: " + order.getDes()+ "; " + "费用=" + order.cost());

        // 2. 加一份牛奶
        order = new Milk(order);
        System.out.println("描述: " + order.getDes()+ "; " + "费用=" + order.cost());

        // 3. 在加一份牛奶
        order = new Milk(order);
        System.out.println("描述: " + order.getDes()+ "; " + "费用=" + order.cost());

        // 4. 加一份巧克力
        order = new Chocolate(order);
        System.out.println("描述: " + order.getDes()+ "; " + "费用=" + order.cost());

        // 5. 加一份豆奶
        order = new Soy(order);
        System.out.println("描述: " + order.getDes()+ "; " + "费用=" + order.cost());
    }
}
