package com.ylqi007.strategy.traditional;

/**
 * Description: ToyDuck需要覆盖所有父类Duck中定义的行为。
 *
 * @Author: ylqi007
 * @Create: 3/13/24 17:14
 */
public class ToyDuck extends Duck {
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

    @Override
    public void fly() {
        System.out.println("玩具鸭不会飞。。。");
    }
}
