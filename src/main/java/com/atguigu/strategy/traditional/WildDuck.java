package com.atguigu.strategy.traditional;

/**
 * Description: 父类Duck中定义的行为都符合WildDuck的需求，只需要对Duck中的抽象方法进行实现就好。
 *
 * @Author: ylqi007
 * @Create: 3/13/24 17:12
 */
public class WildDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是野鸭...");
    }
}
