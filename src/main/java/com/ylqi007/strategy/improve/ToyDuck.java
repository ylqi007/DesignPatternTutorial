package com.ylqi007.strategy.improve;

/**
 * @Author: ylqi007
 * @Create: 3/13/24 17:14
 */
public class ToyDuck extends Duck {

    // 在构造器中创建具体的飞行行为
    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是ToyDuck");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不会叫");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳。。。");
    }
}
