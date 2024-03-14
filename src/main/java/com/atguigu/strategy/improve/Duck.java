package com.atguigu.strategy.improve;

import lombok.Setter;

/**
 * @Author: ylqi007
 * @Create: 3/13/24 17:10
 */
public abstract class Duck {
    // 需要聚合具体的strategy
    // 加入Setter，以便后续可以动态更改
    @Setter FlyBehavior flyBehavior;

    public abstract void display(); // 显示鸭子信息

    public void quack() {
        System.out.println("鸭子叫。。。");
    }

    public void swim() {
        System.out.println("鸭子游泳。。。");
    }

    public void fly() {
        if(flyBehavior != null) {
            flyBehavior.fly();
        }
    }
}
