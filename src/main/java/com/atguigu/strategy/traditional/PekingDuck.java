package com.atguigu.strategy.traditional;

/**
 * Description: 北京鸭子有具体的fly行为，所以要对父类Duck中的fly()进行覆盖。
 *
 * @Author: ylqi007
 * @Create: 3/13/24 17:13
 */
public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是Peking鸭");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭子不能飞。。。");
    }
}
