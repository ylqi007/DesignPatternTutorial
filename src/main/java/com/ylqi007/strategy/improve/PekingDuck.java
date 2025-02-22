package com.ylqi007.strategy.improve;


/**
 * @Author: ylqi007
 * @Create: 3/13/24 17:13
 */
public class PekingDuck extends Duck {
    // 在构造器中创建具体的飞行行为
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是Peking鸭");
    }
}
