package com.atguigu.strategy.improve;

/**
 * @Author: ylqi007
 * @Create: 3/13/24 17:27
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术高超 ~~~");
    }
}
