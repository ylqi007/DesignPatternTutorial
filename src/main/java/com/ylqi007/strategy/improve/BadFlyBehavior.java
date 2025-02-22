package com.ylqi007.strategy.improve;

/**
 * @Author: ylqi007
 * @Create: 3/13/24 17:24
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞行技术一般");
    }
}
