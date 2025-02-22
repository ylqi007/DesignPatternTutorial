package com.ylqi007.strategy.improve;

/**
 * @Author: ylqi007
 * @Create: 3/13/24 17:12
 */
public class WildDuck extends Duck {
    // 构造器，传入FlyBehavior对象
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭...");
    }
}
